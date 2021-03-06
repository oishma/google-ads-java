/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.FeedItem;
import com.google.ads.googleads.v1.services.stub.FeedItemServiceStub;
import com.google.ads.googleads.v1.services.stub.FeedItemServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage feed items.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
 *   String formattedResourceName = FeedItemServiceClient.formatFeedItemName("[CUSTOMER]", "[FEED_ITEM]");
 *   FeedItem response = feedItemServiceClient.getFeedItem(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedItemServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of FeedItemServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedItemServiceSettings feedItemServiceSettings =
 *     FeedItemServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedItemServiceClient feedItemServiceClient =
 *     FeedItemServiceClient.create(feedItemServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedItemServiceSettings feedItemServiceSettings =
 *     FeedItemServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedItemServiceClient feedItemServiceClient =
 *     FeedItemServiceClient.create(feedItemServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedItemServiceClient implements BackgroundResource {
  private final FeedItemServiceSettings settings;
  private final FeedItemServiceStub stub;

  private static final PathTemplate FEED_ITEM_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/feedItems/{feed_item}");

  /**
   * Formats a string containing the fully-qualified path to represent a feed_item resource.
   *
   * @deprecated Use the {@link FeedItemName} class instead.
   */
  @Deprecated
  public static final String formatFeedItemName(String customer, String feedItem) {
    return FEED_ITEM_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "feed_item", feedItem);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a feed_item resource.
   *
   * @deprecated Use the {@link FeedItemName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromFeedItemName(String feedItemName) {
    return FEED_ITEM_PATH_TEMPLATE.parse(feedItemName).get("customer");
  }

  /**
   * Parses the feed_item from the given fully-qualified path which represents a feed_item resource.
   *
   * @deprecated Use the {@link FeedItemName} class instead.
   */
  @Deprecated
  public static final String parseFeedItemFromFeedItemName(String feedItemName) {
    return FEED_ITEM_PATH_TEMPLATE.parse(feedItemName).get("feed_item");
  }

  /** Constructs an instance of FeedItemServiceClient with default settings. */
  public static final FeedItemServiceClient create() throws IOException {
    return create(FeedItemServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedItemServiceClient create(FeedItemServiceSettings settings)
      throws IOException {
    return new FeedItemServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use FeedItemServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedItemServiceClient create(FeedItemServiceStub stub) {
    return new FeedItemServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected FeedItemServiceClient(FeedItemServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedItemServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedItemServiceClient(FeedItemServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedItemServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String formattedResourceName = FeedItemServiceClient.formatFeedItemName("[CUSTOMER]", "[FEED_ITEM]");
   *   FeedItem response = feedItemServiceClient.getFeedItem(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItem getFeedItem(String resourceName) {
    FEED_ITEM_PATH_TEMPLATE.validate(resourceName, "getFeedItem");
    GetFeedItemRequest request =
        GetFeedItemRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String formattedResourceName = FeedItemServiceClient.formatFeedItemName("[CUSTOMER]", "[FEED_ITEM]");
   *   GetFeedItemRequest request = GetFeedItemRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   FeedItem response = feedItemServiceClient.getFeedItem(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItem getFeedItem(GetFeedItemRequest request) {
    return getFeedItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String formattedResourceName = FeedItemServiceClient.formatFeedItemName("[CUSTOMER]", "[FEED_ITEM]");
   *   GetFeedItemRequest request = GetFeedItemRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;FeedItem&gt; future = feedItemServiceClient.getFeedItemCallable().futureCall(request);
   *   // Do something
   *   FeedItem response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedItemRequest, FeedItem> getFeedItemCallable() {
    return stub.getFeedItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateFeedItemsResponse response = feedItemServiceClient.mutateFeedItems(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose feed items are being modified.
   * @param operations The list of operations to perform on individual feed items.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemsResponse mutateFeedItems(
      String customerId,
      List<FeedItemOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateFeedItemsRequest request =
        MutateFeedItemsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateFeedItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemsResponse response = feedItemServiceClient.mutateFeedItems(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose feed items are being modified.
   * @param operations The list of operations to perform on individual feed items.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemsResponse mutateFeedItems(
      String customerId, List<FeedItemOperation> operations) {

    MutateFeedItemsRequest request =
        MutateFeedItemsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemsRequest request = MutateFeedItemsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateFeedItemsResponse response = feedItemServiceClient.mutateFeedItems(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemsResponse mutateFeedItems(MutateFeedItemsRequest request) {
    return mutateFeedItemsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemsRequest request = MutateFeedItemsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateFeedItemsResponse&gt; future = feedItemServiceClient.mutateFeedItemsCallable().futureCall(request);
   *   // Do something
   *   MutateFeedItemsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateFeedItemsRequest, MutateFeedItemsResponse>
      mutateFeedItemsCallable() {
    return stub.mutateFeedItemsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
