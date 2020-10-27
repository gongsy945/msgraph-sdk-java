// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Collection Request.
 */
public class IosManagedAppProtectionCollectionRequest extends BaseCollectionRequest<IosManagedAppProtection, IosManagedAppProtectionCollectionResponse, IosManagedAppProtectionCollectionPage> {

    /**
     * The request builder for this collection of IosManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppProtectionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosManagedAppProtectionCollectionResponse.class, IosManagedAppProtectionCollectionPage.class, IosManagedAppProtectionCollectionRequestBuilder.class);
    }

    /**
     * Creates a new IosManagedAppProtection
     * @param newIosManagedAppProtection the IosManagedAppProtection to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final IosManagedAppProtection newIosManagedAppProtection, final ICallback<? super IosManagedAppProtection> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new IosManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIosManagedAppProtection, callback);
    }

    /**
     * Creates a new IosManagedAppProtection
     * @param newIosManagedAppProtection the IosManagedAppProtection to create
     * @return the newly created object
     */
    public IosManagedAppProtection post(final IosManagedAppProtection newIosManagedAppProtection) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IosManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIosManagedAppProtection);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IosManagedAppProtectionCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
