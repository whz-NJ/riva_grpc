package com.whz.service;

import com.alibaba.fastjson.JSONArray;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannelBuilder;
import nvidia.riva.RivaAudio;
import nvidia.riva.asr.RivaAsr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.grpc.ManagedChannel;
import nvidia.riva.asr.RivaSpeechRecognitionGrpc;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.alibaba.fastjson.JSONObject;

public class AsrClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsrClient.class);

    private final ManagedChannel channel;

    private final RivaSpeechRecognitionGrpc.RivaSpeechRecognitionBlockingStub blockingStub;

    private static String servUrl;
    private static String audioFilePath;

    public AsrClient() {

        // channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
        String asrUrl = servUrl;
        channel = ManagedChannelBuilder.forTarget(asrUrl).usePlaintext().build();
        blockingStub = RivaSpeechRecognitionGrpc.newBlockingStub(channel);
        LOGGER.info("grpc channel created.");
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void test() throws IOException {
        try {
            LOGGER.info("begin to test asr...");
            RivaAsr.RecognitionConfig config = RivaAsr.RecognitionConfig.newBuilder().setEncoding(RivaAudio.AudioEncoding.LINEAR_PCM)
                    .setSampleRateHertz(16000).setLanguageCode("en-US").setMaxAlternatives(1).setAudioChannelCount(1)
                    .setEnableAutomaticPunctuation(true).build();
            File file = new File(audioFilePath);
            if (!file.exists()) {
                LOGGER.error("文件不存在:" + file.getAbsolutePath());
                return;
            }
            byte[] audioBytes = FileUtils.readFileToByteArray(file);

            ByteString grpcAudioBytes = ByteString.copyFrom(audioBytes);
            RivaAsr.RecognizeRequest request = RivaAsr.RecognizeRequest.newBuilder().setConfig(config).setAudio(grpcAudioBytes).build();
            RivaAsr.RecognizeResponse response = blockingStub.recognize(request);
            if(response != null && response.getResultsCount() > 0) {
                RivaAsr.SpeechRecognitionResult result = response.getResults(0);
                if(result != null && result.getAlternativesCount() > 0) {
                    RivaAsr.SpeechRecognitionAlternative alternative = result.getAlternatives(0);
                    JSONObject info = new JSONObject();
                    info.put("confidence", alternative.getConfidence());
                    info.put("transcript", alternative.getTranscript());
                    info.put("wordsCount", alternative.getWordsCount());
                    List<RivaAsr.WordInfo> wordsList = alternative.getWordsList();
                    if(wordsList != null) {
                        JSONArray wordsInfo = new JSONArray();
                        for (RivaAsr.WordInfo wordInfo : wordsList) {
                            JSONObject infoJson = new JSONObject();
                            infoJson.put("word", wordInfo.getWord());
                            infoJson.put("endTime", wordInfo.getEndTime());
                            infoJson.put("startTime", wordInfo.getStartTime());
                            wordsInfo.add(infoJson);
                        }
                        info.put("wordsInfo", wordsInfo);
                        LOGGER.info("result from server: {}", JSONObject.toJSONString(info));
                    } else {
                        LOGGER.error("wordsList is null.");
                    }
                } else if (result == null) {
                    LOGGER.error("result is null.");
                } else {
                    LOGGER.error("alternativesCount is 0.");
                }
            } else {
                LOGGER.error("empty result from server");
            }
        } catch (RuntimeException e) {
            LOGGER.error("RPC failed:" + e.getMessage());
            return;
        }
    }

    public static void main(String[] args) throws Exception {
        if(args == null || args.length != 2) {
            LOGGER.error("riva_grpc_java.jar ip:port filePath");
            return;
        }
        servUrl = args[0];
        audioFilePath = args[1];
        LOGGER.info("serverUrl={}, file={}", servUrl, audioFilePath);
        AsrClient client = new AsrClient();

        try {
            LOGGER.info("Client 调用RPC接口");
            client.test();
        } finally {
            client.shutdown();
        }
    }
}
