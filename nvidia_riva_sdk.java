/*
<dependency>
    <groupId>ai.riva</groupId>
    <artifactId>riva-speech-java-sdk</artifactId>
    <version>1.5.0</version>
</dependency>
*/
import ai.riva.speech.speechkit.*;
import java.io.File;
import java.io.IOException;
public class StreamingSpeechRecognitionDemo {
    public static void main(String[] args) throws IOException {
        // Set the Riva server details
        String serverIp = "localhost";
        int serverPort = 50051;
        // Set the audio file path
        String audioFilePath = "/path/to/audio/file.wav";
        // Set the audio configuration
        SpeechRecognitionConfig config = SpeechRecognitionConfig.newBuilder()
                .setEncoding(AudioEncoding.LINEAR_PCM)
                .setSampleRateHertz(16000)
                .setLanguageCode("en-US")
                .build();
        // Create the speech client
        SpeechClient client = new SpeechClient(serverIp, serverPort);
        // Create the streaming recognizer
        StreamingRecognitionConfig streamingRecognitionConfig = StreamingRecognitionConfig.newBuilder()
                .setConfig(config)
                .build();
        StreamingRecognizeRequest streamingRecognizeRequest = StreamingRecognizeRequest.newBuilder()
                .setStreamingConfig(streamingRecognitionConfig)
                .build();
        // Send the initial request to start the stream
        RecognizeResponseStream recognizeResponseStream = client.streamingRecognize();
        recognizeResponseStream.onNext(streamingRecognizeRequest);
        // Send the audio stream in chunks
        byte[] buffer = new byte[4096];
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(audioFilePath))) {
            int bytesRead = 0;
            while ((bytesRead = audioInputStream.read(buffer)) > 0) {
                StreamingRecognizeRequest audioRequest = StreamingRecognizeRequest.newBuilder()
                        .setAudioContent(ByteString.copyFrom(buffer, 0, bytesRead))
                        .build();
                recognizeResponseStream.onNext(audioRequest);
            }
        }
        // Tell the server that the stream has ended
        recognizeResponseStream.onCompleted();
        // Print the transcription
        for (RecognizeResponse response : recognizeResponseStream) {
            if (response.getResultsCount() > 0) {
                SpeechRecognitionAlternative alternative = response.getResults(0).getAlternatives(0);
                String transcription = alternative.getTranscript();
                System.out.println("Transcription: " + transcription);
            }
        }
        // Shutdown the client
        client.shutdown();
    }
}