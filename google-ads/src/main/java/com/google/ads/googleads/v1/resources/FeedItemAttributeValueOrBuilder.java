// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed_item.proto

package com.google.ads.googleads.v1.resources;

public interface FeedItemAttributeValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.FeedItemAttributeValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the feed attribute for which the value is associated with.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1;</code>
   */
  boolean hasFeedAttributeId();
  /**
   * <pre>
   * Id of the feed attribute for which the value is associated with.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1;</code>
   */
  com.google.protobuf.Int64Value getFeedAttributeId();
  /**
   * <pre>
   * Id of the feed attribute for which the value is associated with.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_attribute_id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFeedAttributeIdOrBuilder();

  /**
   * <pre>
   * Int64 value. Should be set if feed_attribute_id refers to a feed attribute
   * of type INT64.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value integer_value = 2;</code>
   */
  boolean hasIntegerValue();
  /**
   * <pre>
   * Int64 value. Should be set if feed_attribute_id refers to a feed attribute
   * of type INT64.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value integer_value = 2;</code>
   */
  com.google.protobuf.Int64Value getIntegerValue();
  /**
   * <pre>
   * Int64 value. Should be set if feed_attribute_id refers to a feed attribute
   * of type INT64.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value integer_value = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIntegerValueOrBuilder();

  /**
   * <pre>
   * Bool value. Should be set if feed_attribute_id refers to a feed attribute
   * of type BOOLEAN.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue boolean_value = 3;</code>
   */
  boolean hasBooleanValue();
  /**
   * <pre>
   * Bool value. Should be set if feed_attribute_id refers to a feed attribute
   * of type BOOLEAN.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue boolean_value = 3;</code>
   */
  com.google.protobuf.BoolValue getBooleanValue();
  /**
   * <pre>
   * Bool value. Should be set if feed_attribute_id refers to a feed attribute
   * of type BOOLEAN.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue boolean_value = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getBooleanValueOrBuilder();

  /**
   * <pre>
   * String value. Should be set if feed_attribute_id refers to a feed attribute
   * of type STRING, URL or DATE_TIME.
   * For STRING the maximum length is 1500 characters. For URL the maximum
   * length is 2076 characters. For DATE_TIME the format of the string must
   * be the same as start and end time for the feed item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue string_value = 4;</code>
   */
  boolean hasStringValue();
  /**
   * <pre>
   * String value. Should be set if feed_attribute_id refers to a feed attribute
   * of type STRING, URL or DATE_TIME.
   * For STRING the maximum length is 1500 characters. For URL the maximum
   * length is 2076 characters. For DATE_TIME the format of the string must
   * be the same as start and end time for the feed item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue string_value = 4;</code>
   */
  com.google.protobuf.StringValue getStringValue();
  /**
   * <pre>
   * String value. Should be set if feed_attribute_id refers to a feed attribute
   * of type STRING, URL or DATE_TIME.
   * For STRING the maximum length is 1500 characters. For URL the maximum
   * length is 2076 characters. For DATE_TIME the format of the string must
   * be the same as start and end time for the feed item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue string_value = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStringValueOrBuilder();

  /**
   * <pre>
   * Double value. Should be set if feed_attribute_id refers to a feed attribute
   * of type DOUBLE.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue double_value = 5;</code>
   */
  boolean hasDoubleValue();
  /**
   * <pre>
   * Double value. Should be set if feed_attribute_id refers to a feed attribute
   * of type DOUBLE.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue double_value = 5;</code>
   */
  com.google.protobuf.DoubleValue getDoubleValue();
  /**
   * <pre>
   * Double value. Should be set if feed_attribute_id refers to a feed attribute
   * of type DOUBLE.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue double_value = 5;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getDoubleValueOrBuilder();

  /**
   * <pre>
   * Price value. Should be set if feed_attribute_id refers to a feed attribute
   * of type PRICE.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price_value = 6;</code>
   */
  boolean hasPriceValue();
  /**
   * <pre>
   * Price value. Should be set if feed_attribute_id refers to a feed attribute
   * of type PRICE.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price_value = 6;</code>
   */
  com.google.ads.googleads.v1.common.Money getPriceValue();
  /**
   * <pre>
   * Price value. Should be set if feed_attribute_id refers to a feed attribute
   * of type PRICE.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price_value = 6;</code>
   */
  com.google.ads.googleads.v1.common.MoneyOrBuilder getPriceValueOrBuilder();

  /**
   * <pre>
   * Repeated int64 value. Should be set if feed_attribute_id refers to a feed
   * attribute of type INT64_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value integer_values = 7;</code>
   */
  java.util.List<com.google.protobuf.Int64Value> 
      getIntegerValuesList();
  /**
   * <pre>
   * Repeated int64 value. Should be set if feed_attribute_id refers to a feed
   * attribute of type INT64_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value integer_values = 7;</code>
   */
  com.google.protobuf.Int64Value getIntegerValues(int index);
  /**
   * <pre>
   * Repeated int64 value. Should be set if feed_attribute_id refers to a feed
   * attribute of type INT64_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value integer_values = 7;</code>
   */
  int getIntegerValuesCount();
  /**
   * <pre>
   * Repeated int64 value. Should be set if feed_attribute_id refers to a feed
   * attribute of type INT64_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value integer_values = 7;</code>
   */
  java.util.List<? extends com.google.protobuf.Int64ValueOrBuilder> 
      getIntegerValuesOrBuilderList();
  /**
   * <pre>
   * Repeated int64 value. Should be set if feed_attribute_id refers to a feed
   * attribute of type INT64_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value integer_values = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIntegerValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Repeated bool value. Should be set if feed_attribute_id refers to a feed
   * attribute of type BOOLEAN_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.BoolValue boolean_values = 8;</code>
   */
  java.util.List<com.google.protobuf.BoolValue> 
      getBooleanValuesList();
  /**
   * <pre>
   * Repeated bool value. Should be set if feed_attribute_id refers to a feed
   * attribute of type BOOLEAN_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.BoolValue boolean_values = 8;</code>
   */
  com.google.protobuf.BoolValue getBooleanValues(int index);
  /**
   * <pre>
   * Repeated bool value. Should be set if feed_attribute_id refers to a feed
   * attribute of type BOOLEAN_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.BoolValue boolean_values = 8;</code>
   */
  int getBooleanValuesCount();
  /**
   * <pre>
   * Repeated bool value. Should be set if feed_attribute_id refers to a feed
   * attribute of type BOOLEAN_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.BoolValue boolean_values = 8;</code>
   */
  java.util.List<? extends com.google.protobuf.BoolValueOrBuilder> 
      getBooleanValuesOrBuilderList();
  /**
   * <pre>
   * Repeated bool value. Should be set if feed_attribute_id refers to a feed
   * attribute of type BOOLEAN_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.BoolValue boolean_values = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getBooleanValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Repeated string value. Should be set if feed_attribute_id refers to a feed
   * attribute of type STRING_LIST, URL_LIST or DATE_TIME_LIST.
   * For STRING_LIST and URL_LIST the total size of the list in bytes may not
   * exceed 3000. For DATE_TIME_LIST the number of elements may not exceed 200.
   * For STRING_LIST the maximum length of each string element is 1500
   * characters. For URL_LIST the maximum length is 2076 characters. For
   * DATE_TIME the format of the string must be the same as start and end time
   * for the feed item.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue string_values = 9;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getStringValuesList();
  /**
   * <pre>
   * Repeated string value. Should be set if feed_attribute_id refers to a feed
   * attribute of type STRING_LIST, URL_LIST or DATE_TIME_LIST.
   * For STRING_LIST and URL_LIST the total size of the list in bytes may not
   * exceed 3000. For DATE_TIME_LIST the number of elements may not exceed 200.
   * For STRING_LIST the maximum length of each string element is 1500
   * characters. For URL_LIST the maximum length is 2076 characters. For
   * DATE_TIME the format of the string must be the same as start and end time
   * for the feed item.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue string_values = 9;</code>
   */
  com.google.protobuf.StringValue getStringValues(int index);
  /**
   * <pre>
   * Repeated string value. Should be set if feed_attribute_id refers to a feed
   * attribute of type STRING_LIST, URL_LIST or DATE_TIME_LIST.
   * For STRING_LIST and URL_LIST the total size of the list in bytes may not
   * exceed 3000. For DATE_TIME_LIST the number of elements may not exceed 200.
   * For STRING_LIST the maximum length of each string element is 1500
   * characters. For URL_LIST the maximum length is 2076 characters. For
   * DATE_TIME the format of the string must be the same as start and end time
   * for the feed item.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue string_values = 9;</code>
   */
  int getStringValuesCount();
  /**
   * <pre>
   * Repeated string value. Should be set if feed_attribute_id refers to a feed
   * attribute of type STRING_LIST, URL_LIST or DATE_TIME_LIST.
   * For STRING_LIST and URL_LIST the total size of the list in bytes may not
   * exceed 3000. For DATE_TIME_LIST the number of elements may not exceed 200.
   * For STRING_LIST the maximum length of each string element is 1500
   * characters. For URL_LIST the maximum length is 2076 characters. For
   * DATE_TIME the format of the string must be the same as start and end time
   * for the feed item.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue string_values = 9;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getStringValuesOrBuilderList();
  /**
   * <pre>
   * Repeated string value. Should be set if feed_attribute_id refers to a feed
   * attribute of type STRING_LIST, URL_LIST or DATE_TIME_LIST.
   * For STRING_LIST and URL_LIST the total size of the list in bytes may not
   * exceed 3000. For DATE_TIME_LIST the number of elements may not exceed 200.
   * For STRING_LIST the maximum length of each string element is 1500
   * characters. For URL_LIST the maximum length is 2076 characters. For
   * DATE_TIME the format of the string must be the same as start and end time
   * for the feed item.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue string_values = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStringValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Repeated double value. Should be set if feed_attribute_id refers to a feed
   * attribute of type DOUBLE_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.DoubleValue double_values = 10;</code>
   */
  java.util.List<com.google.protobuf.DoubleValue> 
      getDoubleValuesList();
  /**
   * <pre>
   * Repeated double value. Should be set if feed_attribute_id refers to a feed
   * attribute of type DOUBLE_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.DoubleValue double_values = 10;</code>
   */
  com.google.protobuf.DoubleValue getDoubleValues(int index);
  /**
   * <pre>
   * Repeated double value. Should be set if feed_attribute_id refers to a feed
   * attribute of type DOUBLE_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.DoubleValue double_values = 10;</code>
   */
  int getDoubleValuesCount();
  /**
   * <pre>
   * Repeated double value. Should be set if feed_attribute_id refers to a feed
   * attribute of type DOUBLE_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.DoubleValue double_values = 10;</code>
   */
  java.util.List<? extends com.google.protobuf.DoubleValueOrBuilder> 
      getDoubleValuesOrBuilderList();
  /**
   * <pre>
   * Repeated double value. Should be set if feed_attribute_id refers to a feed
   * attribute of type DOUBLE_LIST.
   * </pre>
   *
   * <code>repeated .google.protobuf.DoubleValue double_values = 10;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getDoubleValuesOrBuilder(
      int index);
}
