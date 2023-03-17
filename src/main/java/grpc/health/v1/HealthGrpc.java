package grpc.health.v1;

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
public class HealthGrpc {

  private HealthGrpc() {}

  public static final String SERVICE_NAME = "grpc.health.v1.Health";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<grpc.health.v1.HealthOuterClass.HealthCheckRequest,
      grpc.health.v1.HealthOuterClass.HealthCheckResponse> METHOD_CHECK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "grpc.health.v1.Health", "Check"),
          io.grpc.protobuf.ProtoUtils.marshaller(grpc.health.v1.HealthOuterClass.HealthCheckRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(grpc.health.v1.HealthOuterClass.HealthCheckResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<grpc.health.v1.HealthOuterClass.HealthCheckRequest,
      grpc.health.v1.HealthOuterClass.HealthCheckResponse> METHOD_WATCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "grpc.health.v1.Health", "Watch"),
          io.grpc.protobuf.ProtoUtils.marshaller(grpc.health.v1.HealthOuterClass.HealthCheckRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(grpc.health.v1.HealthOuterClass.HealthCheckResponse.getDefaultInstance()));

  public static HealthStub newStub(io.grpc.Channel channel) {
    return new HealthStub(channel);
  }

  public static HealthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthBlockingStub(channel);
  }

  public static HealthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthFutureStub(channel);
  }

  public static interface Health {

    public void check(grpc.health.v1.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse> responseObserver);

    public void watch(grpc.health.v1.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse> responseObserver);
  }

  public static interface HealthBlockingClient {

    public grpc.health.v1.HealthOuterClass.HealthCheckResponse check(grpc.health.v1.HealthOuterClass.HealthCheckRequest request);

    public java.util.Iterator<grpc.health.v1.HealthOuterClass.HealthCheckResponse> watch(
        grpc.health.v1.HealthOuterClass.HealthCheckRequest request);
  }

  public static interface HealthFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<grpc.health.v1.HealthOuterClass.HealthCheckResponse> check(
        grpc.health.v1.HealthOuterClass.HealthCheckRequest request);
  }

  public static class HealthStub extends io.grpc.stub.AbstractStub<HealthStub>
      implements Health {
    private HealthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthStub(channel, callOptions);
    }

    @java.lang.Override
    public void check(grpc.health.v1.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void watch(grpc.health.v1.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_WATCH, getCallOptions()), request, responseObserver);
    }
  }

  public static class HealthBlockingStub extends io.grpc.stub.AbstractStub<HealthBlockingStub>
      implements HealthBlockingClient {
    private HealthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public grpc.health.v1.HealthOuterClass.HealthCheckResponse check(grpc.health.v1.HealthOuterClass.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<grpc.health.v1.HealthOuterClass.HealthCheckResponse> watch(
        grpc.health.v1.HealthOuterClass.HealthCheckRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_WATCH, getCallOptions(), request);
    }
  }

  public static class HealthFutureStub extends io.grpc.stub.AbstractStub<HealthFutureStub>
      implements HealthFutureClient {
    private HealthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<grpc.health.v1.HealthOuterClass.HealthCheckResponse> check(
        grpc.health.v1.HealthOuterClass.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_WATCH = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Health serviceImpl;
    private final int methodId;

    public MethodHandlers(Health serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((grpc.health.v1.HealthOuterClass.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((grpc.health.v1.HealthOuterClass.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.health.v1.HealthOuterClass.HealthCheckResponse>) responseObserver);
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
      final Health serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_CHECK,
          asyncUnaryCall(
            new MethodHandlers<
              grpc.health.v1.HealthOuterClass.HealthCheckRequest,
              grpc.health.v1.HealthOuterClass.HealthCheckResponse>(
                serviceImpl, METHODID_CHECK)))
        .addMethod(
          METHOD_WATCH,
          asyncServerStreamingCall(
            new MethodHandlers<
              grpc.health.v1.HealthOuterClass.HealthCheckRequest,
              grpc.health.v1.HealthOuterClass.HealthCheckResponse>(
                serviceImpl, METHODID_WATCH)))
        .build();
  }
}
