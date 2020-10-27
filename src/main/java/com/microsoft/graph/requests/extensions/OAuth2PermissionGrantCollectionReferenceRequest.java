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

import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection Reference Request.
 */
public class OAuth2PermissionGrantCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<OAuth2PermissionGrant, OAuth2PermissionGrantWithReferenceRequest, OAuth2PermissionGrantReferenceRequestBuilder, OAuth2PermissionGrantWithReferenceRequestBuilder, OAuth2PermissionGrantCollectionResponse, OAuth2PermissionGrantCollectionWithReferencesPage, OAuth2PermissionGrantCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantCollectionResponse.class, OAuth2PermissionGrantCollectionWithReferencesPage.class, OAuth2PermissionGrantCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new OAuth2PermissionGrant
     * @param newOAuth2PermissionGrant the OAuth2PermissionGrant to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/oauth2PermissionGrants/" + newOAuth2PermissionGrant.id);
        new OAuth2PermissionGrantWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOAuth2PermissionGrant, body, callback);
    }

    /**
     * Creates a new OAuth2PermissionGrant
     * @param newOAuth2PermissionGrant the OAuth2PermissionGrant to create
     * @return the newly created object
     */
    public OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/oauth2PermissionGrants/" + newOAuth2PermissionGrant.id);
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newOAuth2PermissionGrant, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
}
