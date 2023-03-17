package nvidia.riva.nlp;

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
public class RivaLanguageUnderstandingGrpc {

  private RivaLanguageUnderstandingGrpc() {}

  public static final String SERVICE_NAME = "nvidia.riva.nlp.RivaLanguageUnderstanding";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.TextClassRequest,
      nvidia.riva.nlp.RivaNlp.TextClassResponse> METHOD_CLASSIFY_TEXT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "ClassifyText"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextClassRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextClassResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.TokenClassRequest,
      nvidia.riva.nlp.RivaNlp.TokenClassResponse> METHOD_CLASSIFY_TOKENS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "ClassifyTokens"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TokenClassRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TokenClassResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.TextTransformRequest,
      nvidia.riva.nlp.RivaNlp.TextTransformResponse> METHOD_TRANSFORM_TEXT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "TransformText"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextTransformRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextTransformResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest,
      nvidia.riva.nlp.RivaNlp.TokenClassResponse> METHOD_ANALYZE_ENTITIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "AnalyzeEntities"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TokenClassResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest,
      nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse> METHOD_ANALYZE_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "AnalyzeIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.TextTransformRequest,
      nvidia.riva.nlp.RivaNlp.TextTransformResponse> METHOD_PUNCTUATE_TEXT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "PunctuateText"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextTransformRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.TextTransformResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("")
  public static final io.grpc.MethodDescriptor<nvidia.riva.nlp.RivaNlp.NaturalQueryRequest,
      nvidia.riva.nlp.RivaNlp.NaturalQueryResponse> METHOD_NATURAL_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nvidia.riva.nlp.RivaLanguageUnderstanding", "NaturalQuery"),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.NaturalQueryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(nvidia.riva.nlp.RivaNlp.NaturalQueryResponse.getDefaultInstance()));

  public static RivaLanguageUnderstandingStub newStub(io.grpc.Channel channel) {
    return new RivaLanguageUnderstandingStub(channel);
  }

  public static RivaLanguageUnderstandingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RivaLanguageUnderstandingBlockingStub(channel);
  }

  public static RivaLanguageUnderstandingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RivaLanguageUnderstandingFutureStub(channel);
  }

  public static interface RivaLanguageUnderstanding {

    public void classifyText(nvidia.riva.nlp.RivaNlp.TextClassRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextClassResponse> responseObserver);

    public void classifyTokens(nvidia.riva.nlp.RivaNlp.TokenClassRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse> responseObserver);

    public void transformText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse> responseObserver);

    public void analyzeEntities(nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse> responseObserver);

    public void analyzeIntent(nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse> responseObserver);

    public void punctuateText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse> responseObserver);

    public void naturalQuery(nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.NaturalQueryResponse> responseObserver);
  }

  public static interface RivaLanguageUnderstandingBlockingClient {

    public nvidia.riva.nlp.RivaNlp.TextClassResponse classifyText(nvidia.riva.nlp.RivaNlp.TextClassRequest request);

    public nvidia.riva.nlp.RivaNlp.TokenClassResponse classifyTokens(nvidia.riva.nlp.RivaNlp.TokenClassRequest request);

    public nvidia.riva.nlp.RivaNlp.TextTransformResponse transformText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request);

    public nvidia.riva.nlp.RivaNlp.TokenClassResponse analyzeEntities(nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request);

    public nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse analyzeIntent(nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request);

    public nvidia.riva.nlp.RivaNlp.TextTransformResponse punctuateText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request);

    public nvidia.riva.nlp.RivaNlp.NaturalQueryResponse naturalQuery(nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request);
  }

  public static interface RivaLanguageUnderstandingFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextClassResponse> classifyText(
        nvidia.riva.nlp.RivaNlp.TextClassRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TokenClassResponse> classifyTokens(
        nvidia.riva.nlp.RivaNlp.TokenClassRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextTransformResponse> transformText(
        nvidia.riva.nlp.RivaNlp.TextTransformRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TokenClassResponse> analyzeEntities(
        nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse> analyzeIntent(
        nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextTransformResponse> punctuateText(
        nvidia.riva.nlp.RivaNlp.TextTransformRequest request);

    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.NaturalQueryResponse> naturalQuery(
        nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request);
  }

  public static class RivaLanguageUnderstandingStub extends io.grpc.stub.AbstractStub<RivaLanguageUnderstandingStub>
      implements RivaLanguageUnderstanding {
    private RivaLanguageUnderstandingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaLanguageUnderstandingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaLanguageUnderstandingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaLanguageUnderstandingStub(channel, callOptions);
    }

    @java.lang.Override
    public void classifyText(nvidia.riva.nlp.RivaNlp.TextClassRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TEXT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void classifyTokens(nvidia.riva.nlp.RivaNlp.TokenClassRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TOKENS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void transformText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRANSFORM_TEXT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void analyzeEntities(nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_ENTITIES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void analyzeIntent(nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_INTENT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void punctuateText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUNCTUATE_TEXT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void naturalQuery(nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request,
        io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.NaturalQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NATURAL_QUERY, getCallOptions()), request, responseObserver);
    }
  }

  public static class RivaLanguageUnderstandingBlockingStub extends io.grpc.stub.AbstractStub<RivaLanguageUnderstandingBlockingStub>
      implements RivaLanguageUnderstandingBlockingClient {
    private RivaLanguageUnderstandingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaLanguageUnderstandingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaLanguageUnderstandingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaLanguageUnderstandingBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.TextClassResponse classifyText(nvidia.riva.nlp.RivaNlp.TextClassRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLASSIFY_TEXT, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.TokenClassResponse classifyTokens(nvidia.riva.nlp.RivaNlp.TokenClassRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLASSIFY_TOKENS, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.TextTransformResponse transformText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRANSFORM_TEXT, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.TokenClassResponse analyzeEntities(nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_ENTITIES, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse analyzeIntent(nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_INTENT, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.TextTransformResponse punctuateText(nvidia.riva.nlp.RivaNlp.TextTransformRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUNCTUATE_TEXT, getCallOptions(), request);
    }

    @java.lang.Override
    public nvidia.riva.nlp.RivaNlp.NaturalQueryResponse naturalQuery(nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NATURAL_QUERY, getCallOptions(), request);
    }
  }

  public static class RivaLanguageUnderstandingFutureStub extends io.grpc.stub.AbstractStub<RivaLanguageUnderstandingFutureStub>
      implements RivaLanguageUnderstandingFutureClient {
    private RivaLanguageUnderstandingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RivaLanguageUnderstandingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RivaLanguageUnderstandingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RivaLanguageUnderstandingFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextClassResponse> classifyText(
        nvidia.riva.nlp.RivaNlp.TextClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TEXT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TokenClassResponse> classifyTokens(
        nvidia.riva.nlp.RivaNlp.TokenClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLASSIFY_TOKENS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextTransformResponse> transformText(
        nvidia.riva.nlp.RivaNlp.TextTransformRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRANSFORM_TEXT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TokenClassResponse> analyzeEntities(
        nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_ENTITIES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse> analyzeIntent(
        nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_INTENT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.TextTransformResponse> punctuateText(
        nvidia.riva.nlp.RivaNlp.TextTransformRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUNCTUATE_TEXT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<nvidia.riva.nlp.RivaNlp.NaturalQueryResponse> naturalQuery(
        nvidia.riva.nlp.RivaNlp.NaturalQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NATURAL_QUERY, getCallOptions()), request);
    }
  }

  private static final int METHODID_CLASSIFY_TEXT = 0;
  private static final int METHODID_CLASSIFY_TOKENS = 1;
  private static final int METHODID_TRANSFORM_TEXT = 2;
  private static final int METHODID_ANALYZE_ENTITIES = 3;
  private static final int METHODID_ANALYZE_INTENT = 4;
  private static final int METHODID_PUNCTUATE_TEXT = 5;
  private static final int METHODID_NATURAL_QUERY = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RivaLanguageUnderstanding serviceImpl;
    private final int methodId;

    public MethodHandlers(RivaLanguageUnderstanding serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLASSIFY_TEXT:
          serviceImpl.classifyText((nvidia.riva.nlp.RivaNlp.TextClassRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextClassResponse>) responseObserver);
          break;
        case METHODID_CLASSIFY_TOKENS:
          serviceImpl.classifyTokens((nvidia.riva.nlp.RivaNlp.TokenClassRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse>) responseObserver);
          break;
        case METHODID_TRANSFORM_TEXT:
          serviceImpl.transformText((nvidia.riva.nlp.RivaNlp.TextTransformRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_ENTITIES:
          serviceImpl.analyzeEntities((nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TokenClassResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_INTENT:
          serviceImpl.analyzeIntent((nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse>) responseObserver);
          break;
        case METHODID_PUNCTUATE_TEXT:
          serviceImpl.punctuateText((nvidia.riva.nlp.RivaNlp.TextTransformRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.TextTransformResponse>) responseObserver);
          break;
        case METHODID_NATURAL_QUERY:
          serviceImpl.naturalQuery((nvidia.riva.nlp.RivaNlp.NaturalQueryRequest) request,
              (io.grpc.stub.StreamObserver<nvidia.riva.nlp.RivaNlp.NaturalQueryResponse>) responseObserver);
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
      final RivaLanguageUnderstanding serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_CLASSIFY_TEXT,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.TextClassRequest,
              nvidia.riva.nlp.RivaNlp.TextClassResponse>(
                serviceImpl, METHODID_CLASSIFY_TEXT)))
        .addMethod(
          METHOD_CLASSIFY_TOKENS,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.TokenClassRequest,
              nvidia.riva.nlp.RivaNlp.TokenClassResponse>(
                serviceImpl, METHODID_CLASSIFY_TOKENS)))
        .addMethod(
          METHOD_TRANSFORM_TEXT,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.TextTransformRequest,
              nvidia.riva.nlp.RivaNlp.TextTransformResponse>(
                serviceImpl, METHODID_TRANSFORM_TEXT)))
        .addMethod(
          METHOD_ANALYZE_ENTITIES,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.AnalyzeEntitiesRequest,
              nvidia.riva.nlp.RivaNlp.TokenClassResponse>(
                serviceImpl, METHODID_ANALYZE_ENTITIES)))
        .addMethod(
          METHOD_ANALYZE_INTENT,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.AnalyzeIntentRequest,
              nvidia.riva.nlp.RivaNlp.AnalyzeIntentResponse>(
                serviceImpl, METHODID_ANALYZE_INTENT)))
        .addMethod(
          METHOD_PUNCTUATE_TEXT,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.TextTransformRequest,
              nvidia.riva.nlp.RivaNlp.TextTransformResponse>(
                serviceImpl, METHODID_PUNCTUATE_TEXT)))
        .addMethod(
          METHOD_NATURAL_QUERY,
          asyncUnaryCall(
            new MethodHandlers<
              nvidia.riva.nlp.RivaNlp.NaturalQueryRequest,
              nvidia.riva.nlp.RivaNlp.NaturalQueryResponse>(
                serviceImpl, METHODID_NATURAL_QUERY)))
        .build();
  }
}
