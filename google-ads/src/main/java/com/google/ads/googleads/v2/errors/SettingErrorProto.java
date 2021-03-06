// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/setting_error.proto

package com.google.ads.googleads.v2.errors;

public final class SettingErrorProto {
  private SettingErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_errors_SettingErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_errors_SettingErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v2/errors/setting" +
      "_error.proto\022\036google.ads.googleads.v2.er" +
      "rors\032\034google/api/annotations.proto\"\276\010\n\020S" +
      "ettingErrorEnum\"\251\010\n\014SettingError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035SETTING_TYPE_I" +
      "S_NOT_AVAILABLE\020\003\0220\n,SETTING_TYPE_IS_NOT" +
      "_COMPATIBLE_WITH_CAMPAIGN\020\004\022;\n7TARGETING" +
      "_SETTING_CONTAINS_INVALID_CRITERION_TYPE" +
      "_GROUP\020\005\022Q\nMTARGETING_SETTING_DEMOGRAPHI" +
      "C_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_T" +
      "ARGET_ALL\020\006\022\\\nXTARGETING_SETTING_CANNOT_" +
      "CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPH" +
      "IC_CRITERION_TYPE_GROUP\020\007\022C\n?DYNAMIC_SEA" +
      "RCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUS" +
      "T_BE_PRESENT\020\010\022;\n7DYNAMIC_SEARCH_ADS_SET" +
      "TING_CONTAINS_INVALID_DOMAIN_NAME\020\t\0226\n2D" +
      "YNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDO" +
      "MAIN_NAME\020\n\022=\n9DYNAMIC_SEARCH_ADS_SETTIN" +
      "G_CONTAINS_INVALID_LANGUAGE_CODE\020\013\022>\n:TA" +
      "RGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN" +
      "_SEARCH_CAMPAIGN\020\014\0228\n4UNIVERSAL_APP_CAMP" +
      "AIGN_SETTING_DUPLICATE_DESCRIPTION\020\r\022B\n>" +
      "UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTI" +
      "ON_LINE_WIDTH_TOO_LONG\020\016\022<\n8UNIVERSAL_AP" +
      "P_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODI" +
      "FIED\020\017\0228\n4TOO_MANY_YOUTUBE_MEDIA_IDS_IN_" +
      "UNIVERSAL_APP_CAMPAIGN\020\020\0226\n2TOO_MANY_IMA" +
      "GE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN\020\021" +
      "\0221\n-MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP" +
      "_CAMPAIGN\020\022\022\036\n\032TOO_MANY_EXCLAMATION_MARK" +
      "S\020\023B\354\001\n\"com.google.ads.googleads.v2.erro" +
      "rsB\021SettingErrorProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V2.Errors\312\002\036Google\\Ads\\GoogleAds\\V2\\E" +
      "rrors\352\002\"Google::Ads::GoogleAds::V2::Erro" +
      "rsb\006proto3"
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
    internal_static_google_ads_googleads_v2_errors_SettingErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_errors_SettingErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_errors_SettingErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
