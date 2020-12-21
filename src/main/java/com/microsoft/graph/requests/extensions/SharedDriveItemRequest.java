// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharedDriveItem;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Drive Item Request.
 */
public class SharedDriveItemRequest extends BaseRequest implements ISharedDriveItemRequest {
	
    /**
     * The request for the SharedDriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedDriveItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharedDriveItem.class);
    }

    /**
     * Gets the SharedDriveItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SharedDriveItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharedDriveItem from the service
     *
     * @return the SharedDriveItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedDriveItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SharedDriveItem> callback) {
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
     * Patches this SharedDriveItem with a source
     *
     * @param sourceSharedDriveItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharedDriveItem sourceSharedDriveItem, final ICallback<? super SharedDriveItem> callback) {
        send(HttpMethod.PATCH, callback, sourceSharedDriveItem);
    }

    /**
     * Patches this SharedDriveItem with a source
     *
     * @param sourceSharedDriveItem the source object with updates
     * @return the updated SharedDriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedDriveItem patch(final SharedDriveItem sourceSharedDriveItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharedDriveItem);
    }

    /**
     * Creates a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharedDriveItem newSharedDriveItem, final ICallback<? super SharedDriveItem> callback) {
        send(HttpMethod.POST, callback, newSharedDriveItem);
    }

    /**
     * Creates a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the new object to create
     * @return the created SharedDriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedDriveItem post(final SharedDriveItem newSharedDriveItem) throws ClientException {
        return send(HttpMethod.POST, newSharedDriveItem);
    }

    /**
     * Creates a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SharedDriveItem newSharedDriveItem, final ICallback<? super SharedDriveItem> callback) {
        send(HttpMethod.PUT, callback, newSharedDriveItem);
    }

    /**
     * Creates a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the object to create/update
     * @return the created SharedDriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedDriveItem put(final SharedDriveItem newSharedDriveItem) throws ClientException {
        return send(HttpMethod.PUT, newSharedDriveItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharedDriveItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SharedDriveItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharedDriveItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SharedDriveItemRequest)this;
     }

}

