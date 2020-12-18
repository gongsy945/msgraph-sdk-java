// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BaseItemVersion;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Version Request.
 */
public class BaseItemVersionRequest extends BaseRequest implements IBaseItemVersionRequest {
	
    /**
     * The request for the BaseItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseItemVersionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends BaseItemVersion> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BaseItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseItemVersionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseItemVersion.class);
    }

    /**
     * Gets the BaseItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super BaseItemVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BaseItemVersion from the service
     *
     * @return the BaseItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BaseItemVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super BaseItemVersion> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BaseItemVersion with a source
     *
     * @param sourceBaseItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BaseItemVersion sourceBaseItemVersion, final ICallback<? super BaseItemVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceBaseItemVersion);
    }

    /**
     * Patches this BaseItemVersion with a source
     *
     * @param sourceBaseItemVersion the source object with updates
     * @return the updated BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BaseItemVersion patch(final BaseItemVersion sourceBaseItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceBaseItemVersion);
    }

    /**
     * Creates a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BaseItemVersion newBaseItemVersion, final ICallback<? super BaseItemVersion> callback) {
        send(HttpMethod.POST, callback, newBaseItemVersion);
    }

    /**
     * Creates a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the new object to create
     * @return the created BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BaseItemVersion post(final BaseItemVersion newBaseItemVersion) throws ClientException {
        return send(HttpMethod.POST, newBaseItemVersion);
    }

    /**
     * Creates a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BaseItemVersion newBaseItemVersion, final ICallback<? super BaseItemVersion> callback) {
        send(HttpMethod.PUT, callback, newBaseItemVersion);
    }

    /**
     * Creates a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the object to create/update
     * @return the created BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BaseItemVersion put(final BaseItemVersion newBaseItemVersion) throws ClientException {
        return send(HttpMethod.PUT, newBaseItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBaseItemVersionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BaseItemVersionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBaseItemVersionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BaseItemVersionRequest)this;
     }

}

