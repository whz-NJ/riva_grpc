package nvidia.riva.asr;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class RivaSpeechRecognitionGrpc {

  private RivaSpeechRecognitionGrpc() {}

  public static final String SERVICE_NAME = "nvidia.riva.asr.RivaSpeechRecognition";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.asr.RivaAsr.RecognizeRequest,
      nvidia.riva.asr.RivaAsr.RecognizeResponse> METHOD_RECOGNIZE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.asr.RivaSpeechRecognition", "Recognize"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.asr.RivaAsr.RecognizeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.asr.RivaAsr.RecognizeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.asr.RivaAsr.StreamingRecognizeRequest,
      nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse> METHOD_STREAMING_RECOGNIZE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "nvidia.riva.asr.RivaSpeechRecognition", "StreamingRecognize"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.asr.RivaAsr.StreamingRecognizeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse.getDefaultInstance()));

  public static RivaSpeechRecognitionStub newStub(io.grpc.Channel channel) {
    return new RivaSpeechRecognitionStub(channel);
  }

  public static RivaSpeechRecognitionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RivaSpeechRecognitionBlockingStub(channel);
  }

  public static RivaSpeechRecognitionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RivaSpeechRecognitionFutureStub(channel);
  }

  public static interface RivaSpeechRecognition {

    public void recognize(nvidia.riva.asr.RivaAsr.RecognizeRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.RecognizeResponse> responseObserver);

    public io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.StreamingRecognizeRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse> responseObserver);
  }

  public static interface RivaSpeechRecognitionBlockingClient {

    public nvidia.riva.asr.RivaAsr.RecognizeResponse recognize(nvidia.riva.asr.RivaAsr.RecognizeRequest request);
  }

  public static interface RivaSpeechRecognitionFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.asr.RivaAsr.RecognizeResponse> recognize(
        nvidia.riva.asr.RivaAsr.RecognizeRequest request);
  }

  public static class RivaSpeechRecognitionStub extends io.grpc.stub.AbstractStub<RivaSpeechRecognitionStub>
      implements RivaSpeechRecognition {
    private RivaSpeechRecognitionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechRecognitionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechRecognitionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechRecognitionStub(channel, callOptions);
    }

    @java.lang.Override
    public void recognize(nvidia.riva.asr.RivaAsr.RecognizeRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.RecognizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECOGNIZE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.StreamingRecognizeRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_STREAMING_RECOGNIZE, getCallOptions()), responseObserver);
    }
  }

  public static class RivaSpeechRecognitionBlockingStub extends io.grpc.stub.AbstractStub<RivaSpeechRecognitionBlockingStub>
      implements RivaSpeechRecognitionBlockingClient {
    private RivaSpeechRecognitionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechRecognitionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechRecognitionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechRecognitionBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public nvidia.riva.asr.RivaAsr.RecognizeResponse recognize(nvidia.riva.asr.RivaAsr.RecognizeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECOGNIZE, getCallOptions(), request);
    }
  }

  public static class RivaSpeechRecognitionFutureStub extends io.grpc.stub.AbstractStub<RivaSpeechRecognitionFutureStub>
      implements RivaSpeechRecognitionFutureClient {
    private RivaSpeechRecognitionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechRecognitionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechRecognitionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechRecognitionFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.asr.RivaAsr.RecognizeResponse> recognize(
        nvidia.riva.asr.RivaAsr.RecognizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECOGNIZE, getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOGNIZE = 0;
  private static final int METHODID_STREAMING_RECOGNIZE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RivaSpeechRecognition serviceImpl;
    private final int methodId;

    public MethodHandlers(RivaSpeechRecognition serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE:
          serviceImpl.recognize((nvidia.riva.asr.RivaAsr.RecognizeRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.RecognizeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAMING_RECOGNIZE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingRecognize(
              (io.grpc.stub.StreamObserver<nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final RivaSpeechRecognition serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_RECOGNIZE,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.asr.RivaAsr.RecognizeRequest,
              nvidia.riva.asr.RivaAsr.RecognizeResponse>(
                serviceImpl, METHODID_RECOGNIZE)))
        .addMethod(
          METHOD_STREAMING_RECOGNIZE,
          asyncBidiStreamingCall(
            new MethodHandlers<
              nvidia.riva.asr.RivaAsr.StreamingRecognizeRequest,
              nvidia.riva.asr.RivaAsr.StreamingRecognizeResponse>(
                serviceImpl, METHODID_STREAMING_RECOGNIZE)))
        .build();
  }
}
