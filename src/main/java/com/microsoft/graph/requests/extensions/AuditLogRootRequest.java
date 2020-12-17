// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root Request.
 */
public class AuditLogRootRequest extends BaseRequest implements IAuditLogRootRequest {
	
    /**
     * The request for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditLogRoot.class);
    }

    /**
     * Gets the AuditLogRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AuditLogRoot from the service
     *
     * @return the AuditLogRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuditLogRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AuditLogRoot> callback) {
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
     * Patches this AuditLogRoot with a source
     *
     * @param sourceAuditLogRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AuditLogRoot sourceAuditLogRoot, final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceAuditLogRoot);
    }

    /**
     * Patches this AuditLogRoot with a source
     *
     * @param sourceAuditLogRoot the source object with updates
     * @return the updated AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuditLogRoot patch(final AuditLogRoot sourceAuditLogRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AuditLogRoot newAuditLogRoot, final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.POST, callback, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the new object to create
     * @return the created AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuditLogRoot post(final AuditLogRoot newAuditLogRoot) throws ClientException {
        return send(HttpMethod.POST, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AuditLogRoot newAuditLogRoot, final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.PUT, callback, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the object to create/update
     * @return the created AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuditLogRoot put(final AuditLogRoot newAuditLogRoot) throws ClientException {
        return send(HttpMethod.PUT, newAuditLogRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAuditLogRootRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AuditLogRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAuditLogRootRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AuditLogRootRequest)this;
     }

}

