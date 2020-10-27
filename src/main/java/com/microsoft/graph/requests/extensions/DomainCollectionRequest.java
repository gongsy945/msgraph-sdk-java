// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Domain;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DomainCollectionResponse;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Collection Request.
 */
public class DomainCollectionRequest extends BaseCollectionRequest<Domain, DomainCollectionResponse, DomainCollectionPage> {

    /**
     * The request builder for this collection of Domain
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainCollectionResponse.class, DomainCollectionPage.class, DomainCollectionRequestBuilder.class);
    }

    /**
     * Creates a new Domain
     * @param newDomain the Domain to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final Domain newDomain, final ICallback<? super Domain> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DomainRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDomain, callback);
    }

    /**
     * Creates a new Domain
     * @param newDomain the Domain to create
     * @return the newly created object
     */
    public Domain post(final Domain newDomain) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DomainRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDomain);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DomainCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DomainCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DomainCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DomainCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DomainCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public DomainCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public DomainCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
