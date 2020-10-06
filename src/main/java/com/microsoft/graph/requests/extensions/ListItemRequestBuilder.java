// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.FieldValueSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Request Builder.
 */
public class ListItemRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ListItemRequest instance
     */
    public ListItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ListItemRequest instance
     */
    public ListItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ListItemRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    public UserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    public UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    public ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    public DriveItemRequestBuilder driveItem() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }

    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the FieldValueSetRequestBuilder instance
     */
    public FieldValueSetRequestBuilder fields() {
        return new FieldValueSetRequestBuilder(getRequestUrlWithAdditionalSegment("fields"), getClient(), null);
    }
    public ListItemVersionCollectionRequestBuilder versions() {
        return new ListItemVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("versions"), getClient(), null);
    }

    public ListItemVersionRequestBuilder versions(final String id) {
        return new ListItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("versions") + "/" + id, getClient(), null);
    }

    public ListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new ListItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    public ListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval) {
        return new ListItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, startDateTime, endDateTime, interval);
    }
}
