package com.google.ads.googleads.v2.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to fetch Group Placement views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/group_placement_view_service.proto")
public final class GroupPlacementViewServiceGrpc {

  private GroupPlacementViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.GroupPlacementViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGroupPlacementViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest,
      com.google.ads.googleads.v2.resources.GroupPlacementView> METHOD_GET_GROUP_PLACEMENT_VIEW = getGetGroupPlacementViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest,
      com.google.ads.googleads.v2.resources.GroupPlacementView> getGetGroupPlacementViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest,
      com.google.ads.googleads.v2.resources.GroupPlacementView> getGetGroupPlacementViewMethod() {
    return getGetGroupPlacementViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest,
      com.google.ads.googleads.v2.resources.GroupPlacementView> getGetGroupPlacementViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest, com.google.ads.googleads.v2.resources.GroupPlacementView> getGetGroupPlacementViewMethod;
    if ((getGetGroupPlacementViewMethod = GroupPlacementViewServiceGrpc.getGetGroupPlacementViewMethod) == null) {
      synchronized (GroupPlacementViewServiceGrpc.class) {
        if ((getGetGroupPlacementViewMethod = GroupPlacementViewServiceGrpc.getGetGroupPlacementViewMethod) == null) {
          GroupPlacementViewServiceGrpc.getGetGroupPlacementViewMethod = getGetGroupPlacementViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest, com.google.ads.googleads.v2.resources.GroupPlacementView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.GroupPlacementViewService", "GetGroupPlacementView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.GroupPlacementView.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupPlacementViewServiceMethodDescriptorSupplier("GetGroupPlacementView"))
                  .build();
          }
        }
     }
     return getGetGroupPlacementViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupPlacementViewServiceStub newStub(io.grpc.Channel channel) {
    return new GroupPlacementViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupPlacementViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupPlacementViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupPlacementViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupPlacementViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch Group Placement views.
   * </pre>
   */
  public static abstract class GroupPlacementViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Group Placement view in full detail.
     * </pre>
     */
    public void getGroupPlacementView(com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.GroupPlacementView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupPlacementViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGroupPlacementViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest,
                com.google.ads.googleads.v2.resources.GroupPlacementView>(
                  this, METHODID_GET_GROUP_PLACEMENT_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Group Placement views.
   * </pre>
   */
  public static final class GroupPlacementViewServiceStub extends io.grpc.stub.AbstractStub<GroupPlacementViewServiceStub> {
    private GroupPlacementViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupPlacementViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupPlacementViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupPlacementViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Group Placement view in full detail.
     * </pre>
     */
    public void getGroupPlacementView(com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.GroupPlacementView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupPlacementViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Group Placement views.
   * </pre>
   */
  public static final class GroupPlacementViewServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupPlacementViewServiceBlockingStub> {
    private GroupPlacementViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupPlacementViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupPlacementViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupPlacementViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Group Placement view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.GroupPlacementView getGroupPlacementView(com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupPlacementViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Group Placement views.
   * </pre>
   */
  public static final class GroupPlacementViewServiceFutureStub extends io.grpc.stub.AbstractStub<GroupPlacementViewServiceFutureStub> {
    private GroupPlacementViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupPlacementViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupPlacementViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupPlacementViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Group Placement view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.GroupPlacementView> getGroupPlacementView(
        com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupPlacementViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GROUP_PLACEMENT_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupPlacementViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupPlacementViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GROUP_PLACEMENT_VIEW:
          serviceImpl.getGroupPlacementView((com.google.ads.googleads.v2.services.GetGroupPlacementViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.GroupPlacementView>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GroupPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupPlacementViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.GroupPlacementViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupPlacementViewService");
    }
  }

  private static final class GroupPlacementViewServiceFileDescriptorSupplier
      extends GroupPlacementViewServiceBaseDescriptorSupplier {
    GroupPlacementViewServiceFileDescriptorSupplier() {}
  }

  private static final class GroupPlacementViewServiceMethodDescriptorSupplier
      extends GroupPlacementViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupPlacementViewServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupPlacementViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupPlacementViewServiceFileDescriptorSupplier())
              .addMethod(getGetGroupPlacementViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
