// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppContentFile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Content File Request.
 */
public interface IMobileAppContentFileRequest extends IHttpRequest {

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MobileAppContentFile> callback);

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @return the MobileAppContentFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContentFile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MobileAppContentFile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppContentFile sourceMobileAppContentFile, final ICallback<? super MobileAppContentFile> callback);

    /**
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @return the updated MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContentFile patch(final MobileAppContentFile sourceMobileAppContentFile) throws ClientException;

    /**
     * Posts a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppContentFile newMobileAppContentFile, final ICallback<? super MobileAppContentFile> callback);

    /**
     * Posts a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @return the created MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContentFile post(final MobileAppContentFile newMobileAppContentFile) throws ClientException;

    /**
     * Posts a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileAppContentFile newMobileAppContentFile, final ICallback<? super MobileAppContentFile> callback);

    /**
     * Posts a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the object to create/update
     * @return the created MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContentFile put(final MobileAppContentFile newMobileAppContentFile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppContentFileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppContentFileRequest expand(final String value);

}

