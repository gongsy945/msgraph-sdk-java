// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Request.
 */
public class OnenoteRequest extends BaseRequest implements IOnenoteRequest {
	
    /**
     * The request for the Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Onenote.class);
    }

    /**
     * Gets the Onenote from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Onenote> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Onenote from the service
     *
     * @return the Onenote from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Onenote get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Onenote> callback) {
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
     * Patches this Onenote with a source
     *
     * @param sourceOnenote the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Onenote sourceOnenote, final ICallback<? super Onenote> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenote);
    }

    /**
     * Patches this Onenote with a source
     *
     * @param sourceOnenote the source object with updates
     * @return the updated Onenote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Onenote patch(final Onenote sourceOnenote) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenote);
    }

    /**
     * Creates a Onenote with a new object
     *
     * @param newOnenote the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Onenote newOnenote, final ICallback<? super Onenote> callback) {
        send(HttpMethod.POST, callback, newOnenote);
    }

    /**
     * Creates a Onenote with a new object
     *
     * @param newOnenote the new object to create
     * @return the created Onenote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Onenote post(final Onenote newOnenote) throws ClientException {
        return send(HttpMethod.POST, newOnenote);
    }

    /**
     * Creates a Onenote with a new object
     *
     * @param newOnenote the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Onenote newOnenote, final ICallback<? super Onenote> callback) {
        send(HttpMethod.PUT, callback, newOnenote);
    }

    /**
     * Creates a Onenote with a new object
     *
     * @param newOnenote the object to create/update
     * @return the created Onenote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Onenote put(final Onenote newOnenote) throws ClientException {
        return send(HttpMethod.PUT, newOnenote);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOnenoteRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OnenoteRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOnenoteRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OnenoteRequest)this;
     }

}

