// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/offline_user_data.proto

package com.google.ads.googleads.v3.common;

public interface TransactionAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.TransactionAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>.google.protobuf.StringValue transaction_date_time = 1;</code>
   */
  boolean hasTransactionDateTime();
  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>.google.protobuf.StringValue transaction_date_time = 1;</code>
   */
  com.google.protobuf.StringValue getTransactionDateTime();
  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>.google.protobuf.StringValue transaction_date_time = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTransactionDateTimeOrBuilder();

  /**
   * <pre>
   * Transaction amount in micros. Required.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue transaction_amount_micros = 2;</code>
   */
  boolean hasTransactionAmountMicros();
  /**
   * <pre>
   * Transaction amount in micros. Required.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue transaction_amount_micros = 2;</code>
   */
  com.google.protobuf.DoubleValue getTransactionAmountMicros();
  /**
   * <pre>
   * Transaction amount in micros. Required.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue transaction_amount_micros = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getTransactionAmountMicrosOrBuilder();

  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3;</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 4;</code>
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 4;</code>
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * Transaction order id.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 5;</code>
   */
  boolean hasOrderId();
  /**
   * <pre>
   * Transaction order id.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 5;</code>
   */
  com.google.protobuf.StringValue getOrderId();
  /**
   * <pre>
   * Transaction order id.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue order_id = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getOrderIdOrBuilder();

  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.StoreAttribute store_attribute = 6;</code>
   */
  boolean hasStoreAttribute();
  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.StoreAttribute store_attribute = 6;</code>
   */
  com.google.ads.googleads.v3.common.StoreAttribute getStoreAttribute();
  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.StoreAttribute store_attribute = 6;</code>
   */
  com.google.ads.googleads.v3.common.StoreAttributeOrBuilder getStoreAttributeOrBuilder();

  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_value = 7;</code>
   */
  boolean hasCustomValue();
  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_value = 7;</code>
   */
  com.google.protobuf.StringValue getCustomValue();
  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_value = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCustomValueOrBuilder();
}
