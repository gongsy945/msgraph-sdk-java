// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Request Builder.
 */
public class SiteRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SiteRequest instance
     */
    public SiteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SiteRequest instance
     */
    public SiteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SiteRequest(getRequestUrl(), getClient(), requestOptions);
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
    public ColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public ColumnDefinitionRequestBuilder columns(final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public ContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    public ContentTypeRequestBuilder contentTypes(final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public DriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public BaseItemCollectionRequestBuilder items() {
        return new BaseItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public BaseItemRequestBuilder items(final String id) {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public ListCollectionRequestBuilder lists() {
        return new ListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    public ListRequestBuilder lists(final String id) {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public SiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    public SiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new SiteGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    public SiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval) {
        return new SiteGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, startDateTime, endDateTime, interval);
    }

    public SiteGetByPathRequestBuilder getByPath(final String path) {
        return new SiteGetByPathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByPath"), getClient(), null, path);
    }
}
