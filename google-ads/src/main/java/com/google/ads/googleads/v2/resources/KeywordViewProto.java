// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_view.proto

package com.google.ads.googleads.v2.resources;

public final class KeywordViewProto {
  private KeywordViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_KeywordView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_KeywordView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v2/resources/keyw" +
      "ord_view.proto\022!google.ads.googleads.v2." +
      "resources\032\034google/api/annotations.proto\"" +
      "$\n\013KeywordView\022\025\n\rresource_name\030\001 \001(\tB\375\001" +
      "\n%com.google.ads.googleads.v2.resourcesB" +
      "\020KeywordViewProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v2/reso" +
      "urces;resources\242\002\003GAA\252\002!Google.Ads.Googl" +
      "eAds.V2.Resources\312\002!Google\\Ads\\GoogleAds" +
      "\\V2\\Resources\352\002%Google::Ads::GoogleAds::" +
      "V2::Resourcesb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_KeywordView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_KeywordView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_KeywordView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
