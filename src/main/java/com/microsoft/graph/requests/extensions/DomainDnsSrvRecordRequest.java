// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsSrvRecord;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Srv Record Request.
 */
public class DomainDnsSrvRecordRequest extends BaseRequest {
	
    /**
     * The request for the DomainDnsSrvRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsSrvRecordRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsSrvRecord.class);
    }

    /**
     * Gets the DomainDnsSrvRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsSrvRecord from the service
     *
     * @return the DomainDnsSrvRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsSrvRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DomainDnsSrvRecord> callback) {
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
     * Patches this DomainDnsSrvRecord with a source
     *
     * @param sourceDomainDnsSrvRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DomainDnsSrvRecord sourceDomainDnsSrvRecord, final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsSrvRecord);
    }

    /**
     * Patches this DomainDnsSrvRecord with a source
     *
     * @param sourceDomainDnsSrvRecord the source object with updates
     * @return the updated DomainDnsSrvRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsSrvRecord patch(final DomainDnsSrvRecord sourceDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     *
     * @param newDomainDnsSrvRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DomainDnsSrvRecord newDomainDnsSrvRecord, final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     *
     * @param newDomainDnsSrvRecord the new object to create
     * @return the created DomainDnsSrvRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsSrvRecord post(final DomainDnsSrvRecord newDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     *
     * @param newDomainDnsSrvRecord the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DomainDnsSrvRecord newDomainDnsSrvRecord, final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.PUT, callback, newDomainDnsSrvRecord);
    }

    /**
     * Creates a DomainDnsSrvRecord with a new object
     *
     * @param newDomainDnsSrvRecord the object to create/update
     * @return the created DomainDnsSrvRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsSrvRecord put(final DomainDnsSrvRecord newDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsSrvRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DomainDnsSrvRecordRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DomainDnsSrvRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DomainDnsSrvRecordRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DomainDnsSrvRecordRequest)this;
     }

}

