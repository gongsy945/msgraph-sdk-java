// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.SiteRemoveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionResponse;
import com.microsoft.graph.models.extensions.SiteRemoveBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Remove Collection Request.
 */
public class SiteRemoveCollectionRequest extends BaseCollectionRequest<SiteRemoveCollectionResponse, SiteRemoveCollectionPage> {


    protected final SiteRemoveBody body;


    /**
     * The request for this SiteRemove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteRemoveCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteRemoveCollectionResponse.class, SiteRemoveCollectionPage.class);
        body = new SiteRemoveBody();
    }


    public void post(final ICallback<? super SiteRemoveCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public SiteRemoveCollectionPage post() throws ClientException {
        final SiteRemoveCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public SiteRemoveCollectionPage buildFromResponse(final SiteRemoveCollectionResponse response) {
        final SiteRemoveCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SiteRemoveCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<Site>) null);
        } else {
            builder = null;
        }
        final SiteRemoveCollectionPage page = new SiteRemoveCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public SiteRemoveCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SiteRemoveCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public SiteRemoveCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (SiteRemoveCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public SiteRemoveCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SiteRemoveCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public SiteRemoveCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SiteRemoveCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public SiteRemoveCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SiteRemoveCollectionRequest)this;
    }

}
