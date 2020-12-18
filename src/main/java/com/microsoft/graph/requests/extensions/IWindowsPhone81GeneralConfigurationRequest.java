// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhone81GeneralConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81General Configuration Request.
 */
public interface IWindowsPhone81GeneralConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhone81GeneralConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Gets the WindowsPhone81GeneralConfiguration from the service
     *
     * @return the WindowsPhone81GeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81GeneralConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhone81GeneralConfiguration with a source
     *
     * @param sourceWindowsPhone81GeneralConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhone81GeneralConfiguration sourceWindowsPhone81GeneralConfiguration, final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Patches this WindowsPhone81GeneralConfiguration with a source
     *
     * @param sourceWindowsPhone81GeneralConfiguration the source object with updates
     * @return the updated WindowsPhone81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81GeneralConfiguration patch(final WindowsPhone81GeneralConfiguration sourceWindowsPhone81GeneralConfiguration) throws ClientException;

    /**
     * Posts a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration, final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Posts a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the new object to create
     * @return the created WindowsPhone81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81GeneralConfiguration post(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration) throws ClientException;

    /**
     * Posts a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration, final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Posts a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the object to create/update
     * @return the created WindowsPhone81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81GeneralConfiguration put(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81GeneralConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81GeneralConfigurationRequest expand(final String value);

}

