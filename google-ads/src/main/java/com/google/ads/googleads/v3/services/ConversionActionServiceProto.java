// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/conversion_action_service.proto

package com.google.ads.googleads.v3.services;

public final class ConversionActionServiceProto {
  private ConversionActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetConversionActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetConversionActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateConversionActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ConversionActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ConversionActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateConversionActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateConversionActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateConversionActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v3/services/conve" +
      "rsion_action_service.proto\022 google.ads.g" +
      "oogleads.v3.services\0329google/ads/googlea" +
      "ds/v3/resources/conversion_action.proto\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\032 google/protobuf/field_mask.prot" +
      "o\032\027google/rpc/status.proto\"8\n\032GetConvers" +
      "ionActionRequest\022\032\n\rresource_name\030\001 \001(\tB" +
      "\003\340A\002\"\300\001\n\036MutateConversionActionsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022T\n\noperations\030" +
      "\002 \003(\0132;.google.ads.googleads.v3.services" +
      ".ConversionActionOperationB\003\340A\002\022\027\n\017parti" +
      "al_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"" +
      "\371\001\n\031ConversionActionOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022E" +
      "\n\006create\030\001 \001(\01323.google.ads.googleads.v3" +
      ".resources.ConversionActionH\000\022E\n\006update\030" +
      "\002 \001(\01323.google.ads.googleads.v3.resource" +
      "s.ConversionActionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013" +
      "\n\toperation\"\245\001\n\037MutateConversionActionsR" +
      "esponse\0221\n\025partial_failure_error\030\003 \001(\0132\022" +
      ".google.rpc.Status\022O\n\007results\030\002 \003(\0132>.go" +
      "ogle.ads.googleads.v3.services.MutateCon" +
      "versionActionResult\"5\n\034MutateConversionA" +
      "ctionResult\022\025\n\rresource_name\030\001 \001(\t2\213\004\n\027C" +
      "onversionActionService\022\325\001\n\023GetConversion" +
      "Action\022<.google.ads.googleads.v3.service" +
      "s.GetConversionActionRequest\0323.google.ad" +
      "s.googleads.v3.resources.ConversionActio" +
      "n\"K\202\323\344\223\0025\0223/v3/{resource_name=customers/" +
      "*/conversionActions/*}\332A\rresource_name\022\372" +
      "\001\n\027MutateConversionActions\022@.google.ads." +
      "googleads.v3.services.MutateConversionAc" +
      "tionsRequest\032A.google.ads.googleads.v3.s" +
      "ervices.MutateConversionActionsResponse\"" +
      "Z\202\323\344\223\002;\"6/v3/customers/{customer_id=*}/c" +
      "onversionActions:mutate:\001*\332A\026customer_id" +
      ",operations\032\033\312A\030googleads.googleapis.com" +
      "B\203\002\n$com.google.ads.googleads.v3.service" +
      "sB\034ConversionActionServiceProtoP\001ZHgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v3/services;services\242\002\003GAA\252\002 Goog" +
      "le.Ads.GoogleAds.V3.Services\312\002 Google\\Ad" +
      "s\\GoogleAds\\V3\\Services\352\002$Google::Ads::G" +
      "oogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.ConversionActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetConversionActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetConversionActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetConversionActionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateConversionActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_ConversionActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_ConversionActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ConversionActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateConversionActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateConversionActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateConversionActionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateConversionActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateConversionActionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.ConversionActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}