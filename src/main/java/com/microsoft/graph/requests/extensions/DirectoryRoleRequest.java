// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRole;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Request.
 */
public class DirectoryRoleRequest extends BaseRequest {
	
    /**
     * The request for the DirectoryRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRoleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryRole.class);
    }

    /**
     * Gets the DirectoryRole from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DirectoryRole> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryRole from the service
     *
     * @return the DirectoryRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DirectoryRole> callback) {
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
     * Patches this DirectoryRole with a source
     *
     * @param sourceDirectoryRole the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryRole sourceDirectoryRole, final ICallback<? super DirectoryRole> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryRole);
    }

    /**
     * Patches this DirectoryRole with a source
     *
     * @param sourceDirectoryRole the source object with updates
     * @return the updated DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRole patch(final DirectoryRole sourceDirectoryRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryRole newDirectoryRole, final ICallback<? super DirectoryRole> callback) {
        send(HttpMethod.POST, callback, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the new object to create
     * @return the created DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRole post(final DirectoryRole newDirectoryRole) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DirectoryRole newDirectoryRole, final ICallback<? super DirectoryRole> callback) {
        send(HttpMethod.PUT, callback, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the object to create/update
     * @return the created DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRole put(final DirectoryRole newDirectoryRole) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DirectoryRoleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectoryRoleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DirectoryRoleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectoryRoleRequest)this;
     }

}

