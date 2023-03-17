package nvidia.riva.tts;

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
public class RivaSpeechSynthesisGrpc {

  private RivaSpeechSynthesisGrpc() {}

  public static final String SERVICE_NAME = "nvidia.riva.tts.RivaSpeechSynthesis";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest,
      nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> METHOD_SYNTHESIZE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.tts.RivaSpeechSynthesis", "Synthesize"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest,
      nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> METHOD_SYNTHESIZE_ONLINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "nvidia.riva.tts.RivaSpeechSynthesis", "SynthesizeOnline"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse.getDefaultInstance()));

  public static RivaSpeechSynthesisStub newStub(io.grpc.Channel channel) {
    return new RivaSpeechSynthesisStub(channel);
  }

  public static RivaSpeechSynthesisBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RivaSpeechSynthesisBlockingStub(channel);
  }

  public static RivaSpeechSynthesisFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RivaSpeechSynthesisFutureStub(channel);
  }

  public static interface RivaSpeechSynthesis {

    public void synthesize(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> responseObserver);

    public void synthesizeOnline(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> responseObserver);
  }

  public static interface RivaSpeechSynthesisBlockingClient {

    public nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse synthesize(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request);

    public java.util.Iterator<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> synthesizeOnline(
        nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request);
  }

  public static interface RivaSpeechSynthesisFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> synthesize(
        nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request);
  }

  public static class RivaSpeechSynthesisStub extends io.grpc.stub.AbstractStub<RivaSpeechSynthesisStub>
      implements RivaSpeechSynthesis {
    private RivaSpeechSynthesisStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechSynthesisStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechSynthesisStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechSynthesisStub(channel, callOptions);
    }

    @java.lang.Override
    public void synthesize(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SYNTHESIZE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void synthesizeOnline(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SYNTHESIZE_ONLINE, getCallOptions()), request, responseObserver);
    }
  }

  public static class RivaSpeechSynthesisBlockingStub extends io.grpc.stub.AbstractStub<RivaSpeechSynthesisBlockingStub>
      implements RivaSpeechSynthesisBlockingClient {
    private RivaSpeechSynthesisBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechSynthesisBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechSynthesisBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechSynthesisBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse synthesize(nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SYNTHESIZE, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> synthesizeOnline(
        nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SYNTHESIZE_ONLINE, getCallOptions(), request);
    }
  }

  public static class RivaSpeechSynthesisFutureStub extends io.grpc.stub.AbstractStub<RivaSpeechSynthesisFutureStub>
      implements RivaSpeechSynthesisFutureClient {
    private RivaSpeechSynthesisFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaSpeechSynthesisFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaSpeechSynthesisFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaSpeechSynthesisFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse> synthesize(
        nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SYNTHESIZE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNTHESIZE = 0;
  private static final int METHODID_SYNTHESIZE_ONLINE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RivaSpeechSynthesis serviceImpl;
    private final int methodId;

    public MethodHandlers(RivaSpeechSynthesis serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNTHESIZE:
          serviceImpl.synthesize((nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse>) responseObserver);
          break;
        case METHODID_SYNTHESIZE_ONLINE:
          serviceImpl.synthesizeOnline((nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final RivaSpeechSynthesis serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_SYNTHESIZE,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest,
              nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse>(
                serviceImpl, METHODID_SYNTHESIZE)))
        .addMethod(
          METHOD_SYNTHESIZE_ONLINE,
          asyncServerStreamingCall(
            new MethodHandlers<
              nvidia.riva.tts.RivaTts.SynthesizeSpeechRequest,
              nvidia.riva.tts.RivaTts.SynthesizeSpeechResponse>(
                serviceImpl, METHODID_SYNTHESIZE_ONLINE)))
        .build();
  }
}
