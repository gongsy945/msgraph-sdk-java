// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection With References Request Builder.
 */
public class OAuth2PermissionGrantCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOAuth2PermissionGrantCollectionWithReferencesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOAuth2PermissionGrantCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OAuth2PermissionGrantCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOAuth2PermissionGrantWithReferenceRequestBuilder byId(final String id) {
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IOAuth2PermissionGrantCollectionReferenceRequestBuilder references(){
        return new OAuth2PermissionGrantCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
