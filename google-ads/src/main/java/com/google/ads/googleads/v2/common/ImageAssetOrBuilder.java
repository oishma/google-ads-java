// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/asset_types.proto

package com.google.ads.googleads.v2.common;

public interface ImageAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.ImageAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  com.google.protobuf.BytesValue getData();
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  boolean hasFileSize();
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  com.google.protobuf.Int64Value getFileSize();
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFileSizeOrBuilder();

  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   */
  int getMimeTypeValue();
  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   */
  com.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType getMimeType();

  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ImageDimension full_size = 4;</code>
   */
  boolean hasFullSize();
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ImageDimension full_size = 4;</code>
   */
  com.google.ads.googleads.v2.common.ImageDimension getFullSize();
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ImageDimension full_size = 4;</code>
   */
  com.google.ads.googleads.v2.common.ImageDimensionOrBuilder getFullSizeOrBuilder();
}
