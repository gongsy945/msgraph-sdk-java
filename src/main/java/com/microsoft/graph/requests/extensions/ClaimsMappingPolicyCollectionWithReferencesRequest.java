// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Collection With References Request.
 */
public class ClaimsMappingPolicyCollectionWithReferencesRequest extends BaseCollectionRequest<ClaimsMappingPolicyCollectionResponse, ClaimsMappingPolicyCollectionPage> {

    /**
     * The request builder for this collection of ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicyCollectionResponse.class, ClaimsMappingPolicyCollectionPage.class);
    }

    public void get(final ICallback<? super ClaimsMappingPolicyCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ClaimsMappingPolicyCollectionWithReferencesPage get() throws ClientException {
        final ClaimsMappingPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public ClaimsMappingPolicyCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public ClaimsMappingPolicyCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public ClaimsMappingPolicyCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public ClaimsMappingPolicyCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public ClaimsMappingPolicyCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public ClaimsMappingPolicyCollectionWithReferencesPage buildFromResponse(final ClaimsMappingPolicyCollectionResponse response) {
        final ClaimsMappingPolicyCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ClaimsMappingPolicyCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ClaimsMappingPolicyCollectionWithReferencesPage page = new ClaimsMappingPolicyCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
