// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Default Managed App Protection Request.
 */
public interface IDefaultManagedAppProtectionRequest extends IHttpRequest {

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DefaultManagedAppProtection> callback);

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @return the DefaultManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultManagedAppProtection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DefaultManagedAppProtection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DefaultManagedAppProtection sourceDefaultManagedAppProtection, final ICallback<? super DefaultManagedAppProtection> callback);

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @return the updated DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultManagedAppProtection patch(final DefaultManagedAppProtection sourceDefaultManagedAppProtection) throws ClientException;

    /**
     * Posts a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DefaultManagedAppProtection newDefaultManagedAppProtection, final ICallback<? super DefaultManagedAppProtection> callback);

    /**
     * Posts a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @return the created DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultManagedAppProtection post(final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException;

    /**
     * Posts a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DefaultManagedAppProtection newDefaultManagedAppProtection, final ICallback<? super DefaultManagedAppProtection> callback);

    /**
     * Posts a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the object to create/update
     * @return the created DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultManagedAppProtection put(final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDefaultManagedAppProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDefaultManagedAppProtectionRequest expand(final String value);

}

