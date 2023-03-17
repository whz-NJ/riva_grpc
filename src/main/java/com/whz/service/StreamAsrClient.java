package com.whz.service;

import com.alibaba.fastjson.JSONArray;
import com.google.protobuf.ByteString;
import com.whz.util.FileUtil;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import nvidia.riva.RivaAudio;
import nvidia.riva.asr.RivaAsr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.grpc.ManagedChannel;
import nvidia.riva.asr.RivaSpeechRecognitionGrpc;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSONObject;

public class StreamAsrClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamAsrClient.class);

    private final ManagedChannel channel;

    private final RivaSpeechRecognitionGrpc.RivaSpeechRecognitionStub grpcStub;

    private static String servUrl;
    private static String audioFilePath;

    public StreamAsrClient() {

        // channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
        String asrUrl = servUrl;
        channel = ManagedChannelBuilder.forTarget(asrUrl).usePlaintext().build();
        grpcStub = RivaSpeechRecognitionGrpc.newStub(channel);
        LOGGER.info("grpc channel created.");
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void test() throws Exception {
        int sliceSize = 1280;

        LOGGER.info("begin to test asr...");
        File file = new File(audioFilePath);
        if (!file.exists()) {
            LOGGER.error("文件不存在:" + file.getAbsolutePath());
            return;
        }

        Boolean finished = false;
        StreamObserver<RivaAsr.StreamingRecognizeRequest> streamObserver = grpcStub.streamingRecognize(new StreamObserver<RivaAsr.StreamingRecognizeResponse>() {
            @Override
            public void onNext(RivaAsr.StreamingRecognizeResponse response) {
                try {
                    if (response != null && response.getResultsCount() > 0) {
                        for (int resultIdx = 0; resultIdx < response.getResultsCount(); resultIdx++) {
                            RivaAsr.StreamingRecognitionResult results = response.getResults(resultIdx);
                            if (results != null && results.getAlternativesCount() > 0) {
                                RivaAsr.SpeechRecognitionAlternative alternative = results.getAlternatives(0);
                                JSONObject info = new JSONObject();
                                info.put("confidence", alternative.getConfidence());
                                info.put("transcript", alternative.getTranscript());
                                info.put("wordsCount", alternative.getWordsCount());
                                List<RivaAsr.WordInfo> wordsList = alternative.getWordsList();
                                if (wordsList != null) {
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
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    LOGGER.error("exception occurs" + e.getMessage());
                    return;
                }
            }

            @Override
            public void onError(Throwable throwable) {
                LOGGER.error("onError", throwable);
                synchronized (finished) {
                    finished.notifyAll();
                }
            }

            @Override
            public void onCompleted() {
                LOGGER.info("onCompleted.");
                synchronized (finished) {
                    finished.notifyAll();
                }
            }
        });
        RivaAsr.RecognitionConfig config = RivaAsr.RecognitionConfig.newBuilder().setEncoding(RivaAudio.AudioEncoding.LINEAR_PCM)
                .setSampleRateHertz(16000).setLanguageCode("en-US").setMaxAlternatives(1).setAudioChannelCount(1)
                .setEnableAutomaticPunctuation(true).setEnableWordTimeOffsets(true).build();

        RivaAsr.StreamingRecognitionConfig streamRecConfig = RivaAsr.StreamingRecognitionConfig.newBuilder()
                .setConfig(config).setInterimResults(false).build();
        int sliceNum = (int) Math.ceil((double) file.length() / sliceSize);
        LOGGER.info("begin to send RecognitionConfig ...");
        RivaAsr.StreamingRecognizeRequest request= RivaAsr.StreamingRecognizeRequest.newBuilder().setStreamingConfig(streamRecConfig).build();
        streamObserver.onNext(request);
        for (int i = 0; i < sliceNum; i++) {
            byte[] audioBytes = FileUtil.getData(file, i * sliceSize, sliceSize);
            if (audioBytes.length == 0) {
                break;
            }
            LOGGER.info("begin to send slice {} ...", i);
            ByteString grpcAudioBytes = ByteString.copyFrom(audioBytes);
            request = RivaAsr.StreamingRecognizeRequest.newBuilder().setAudioContent(grpcAudioBytes).build();
            streamObserver.onNext(request);
        }
        streamObserver.onCompleted();
        synchronized (finished) {
            finished.wait();
        }
        LOGGER.info("completed in main thread.");
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length != 2) {
            LOGGER.error("riva_grpc_java.jar ip:port filePath");
            return;
        }
        servUrl = args[0];
        audioFilePath = args[1];
        LOGGER.info("serverUrl={}, file={}", servUrl, audioFilePath);
        StreamAsrClient client = new StreamAsrClient();

        try {
            LOGGER.info("Client 调用RPC接口");
            client.test();
        } finally {
            client.shutdown();
        }
    }
}
