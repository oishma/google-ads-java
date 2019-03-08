// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/feed_item_service.proto

package com.google.ads.googleads.v1.services;

public final class FeedItemServiceProto {
  private FeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetFeedItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetFeedItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_FeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_FeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/services/feed_" +
      "item_service.proto\022 google.ads.googleads" +
      ".v1.services\0321google/ads/googleads/v1/re" +
      "sources/feed_item.proto\032\034google/api/anno" +
      "tations.proto\032 google/protobuf/field_mas" +
      "k.proto\032\036google/protobuf/wrappers.proto\032" +
      "\027google/rpc/status.proto\"+\n\022GetFeedItemR" +
      "equest\022\025\n\rresource_name\030\001 \001(\t\"\246\001\n\026Mutate" +
      "FeedItemsRequest\022\023\n\013customer_id\030\001 \001(\t\022G\n" +
      "\noperations\030\002 \003(\01323.google.ads.googleads" +
      ".v1.services.FeedItemOperation\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\341" +
      "\001\n\021FeedItemOperation\022/\n\013update_mask\030\004 \001(" +
      "\0132\032.google.protobuf.FieldMask\022=\n\006create\030" +
      "\001 \001(\0132+.google.ads.googleads.v1.resource" +
      "s.FeedItemH\000\022=\n\006update\030\002 \001(\0132+.google.ad" +
      "s.googleads.v1.resources.FeedItemH\000\022\020\n\006r" +
      "emove\030\003 \001(\tH\000B\013\n\toperation\"\225\001\n\027MutateFee" +
      "dItemsResponse\0221\n\025partial_failure_error\030" +
      "\003 \001(\0132\022.google.rpc.Status\022G\n\007results\030\002 \003" +
      "(\01326.google.ads.googleads.v1.services.Mu" +
      "tateFeedItemResult\"-\n\024MutateFeedItemResu" +
      "lt\022\025\n\rresource_name\030\001 \001(\t2\375\002\n\017FeedItemSe" +
      "rvice\022\245\001\n\013GetFeedItem\0224.google.ads.googl" +
      "eads.v1.services.GetFeedItemRequest\032+.go" +
      "ogle.ads.googleads.v1.resources.FeedItem" +
      "\"3\202\323\344\223\002-\022+/v1/{resource_name=customers/*" +
      "/feedItems/*}\022\301\001\n\017MutateFeedItems\0228.goog" +
      "le.ads.googleads.v1.services.MutateFeedI" +
      "temsRequest\0329.google.ads.googleads.v1.se" +
      "rvices.MutateFeedItemsResponse\"9\202\323\344\223\0023\"." +
      "/v1/customers/{customer_id=*}/feedItems:" +
      "mutate:\001*B\373\001\n$com.google.ads.googleads.v" +
      "1.servicesB\024FeedItemServiceProtoP\001ZHgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v1/services;services\242\002\003GAA\252\002 Goo" +
      "gle.Ads.GoogleAds.V1.Services\312\002 Google\\A" +
      "ds\\GoogleAds\\V1\\Services\352\002$Google::Ads::" +
      "GoogleAds::V1::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.FeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetFeedItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetFeedItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetFeedItemRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_FeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_FeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_FeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.FeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}