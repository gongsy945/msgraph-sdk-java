// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Request Request.
 */
public class ThreatAssessmentRequestRequest extends BaseRequest {
	
    /**
     * The request for the ThreatAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ThreatAssessmentRequestRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ThreatAssessmentRequest> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ThreatAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentRequest.class);
    }

    /**
     * Gets the ThreatAssessmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ThreatAssessmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ThreatAssessmentRequest from the service
     *
     * @return the ThreatAssessmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ThreatAssessmentRequest> callback) {
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
     * Patches this ThreatAssessmentRequest with a source
     *
     * @param sourceThreatAssessmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ThreatAssessmentRequest sourceThreatAssessmentRequest, final ICallback<? super ThreatAssessmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceThreatAssessmentRequest);
    }

    /**
     * Patches this ThreatAssessmentRequest with a source
     *
     * @param sourceThreatAssessmentRequest the source object with updates
     * @return the updated ThreatAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentRequest patch(final ThreatAssessmentRequest sourceThreatAssessmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceThreatAssessmentRequest);
    }

    /**
     * Creates a ThreatAssessmentRequest with a new object
     *
     * @param newThreatAssessmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ThreatAssessmentRequest newThreatAssessmentRequest, final ICallback<? super ThreatAssessmentRequest> callback) {
        send(HttpMethod.POST, callback, newThreatAssessmentRequest);
    }

    /**
     * Creates a ThreatAssessmentRequest with a new object
     *
     * @param newThreatAssessmentRequest the new object to create
     * @return the created ThreatAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentRequest post(final ThreatAssessmentRequest newThreatAssessmentRequest) throws ClientException {
        return send(HttpMethod.POST, newThreatAssessmentRequest);
    }

    /**
     * Creates a ThreatAssessmentRequest with a new object
     *
     * @param newThreatAssessmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ThreatAssessmentRequest newThreatAssessmentRequest, final ICallback<? super ThreatAssessmentRequest> callback) {
        send(HttpMethod.PUT, callback, newThreatAssessmentRequest);
    }

    /**
     * Creates a ThreatAssessmentRequest with a new object
     *
     * @param newThreatAssessmentRequest the object to create/update
     * @return the created ThreatAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThreatAssessmentRequest put(final ThreatAssessmentRequest newThreatAssessmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newThreatAssessmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ThreatAssessmentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ThreatAssessmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ThreatAssessmentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ThreatAssessmentRequestRequest)this;
     }

}

