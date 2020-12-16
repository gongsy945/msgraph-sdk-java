// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupRemoveFavoriteRequest;
import com.microsoft.graph.requests.extensions.GroupRemoveFavoriteRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Remove Favorite Request Builder.
 */
public class GroupRemoveFavoriteRequestBuilder extends BaseActionRequestBuilder implements IGroupRemoveFavoriteRequestBuilder {

    /**
     * The request builder for this GroupRemoveFavorite
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRemoveFavoriteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupRemoveFavoriteRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupRemoveFavoriteRequest instance
     */
    public IGroupRemoveFavoriteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IGroupRemoveFavoriteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupRemoveFavoriteRequest instance
     */
    public IGroupRemoveFavoriteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupRemoveFavoriteRequest request = new GroupRemoveFavoriteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
