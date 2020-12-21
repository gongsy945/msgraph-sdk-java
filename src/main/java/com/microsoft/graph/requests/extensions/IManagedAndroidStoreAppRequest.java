// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAndroidStoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Android Store App Request.
 */
public interface IManagedAndroidStoreAppRequest extends IHttpRequest {

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedAndroidStoreApp> callback);

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @return the ManagedAndroidStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAndroidStoreApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedAndroidStoreApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAndroidStoreApp sourceManagedAndroidStoreApp, final ICallback<? super ManagedAndroidStoreApp> callback);

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @return the updated ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAndroidStoreApp patch(final ManagedAndroidStoreApp sourceManagedAndroidStoreApp) throws ClientException;

    /**
     * Posts a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAndroidStoreApp newManagedAndroidStoreApp, final ICallback<? super ManagedAndroidStoreApp> callback);

    /**
     * Posts a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAndroidStoreApp post(final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException;

    /**
     * Posts a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedAndroidStoreApp newManagedAndroidStoreApp, final ICallback<? super ManagedAndroidStoreApp> callback);

    /**
     * Posts a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAndroidStoreApp put(final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAndroidStoreAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAndroidStoreAppRequest expand(final String value);

}

