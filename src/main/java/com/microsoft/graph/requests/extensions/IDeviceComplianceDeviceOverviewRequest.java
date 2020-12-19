// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceOverview;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Device Overview Request.
 */
public interface IDeviceComplianceDeviceOverviewRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceComplianceDeviceOverview> callback);

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @return the DeviceComplianceDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceComplianceDeviceOverview> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview, final ICallback<? super DeviceComplianceDeviceOverview> callback);

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @return the updated DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview patch(final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview) throws ClientException;

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview, final ICallback<? super DeviceComplianceDeviceOverview> callback);

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @return the created DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview post(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) throws ClientException;

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview, final ICallback<? super DeviceComplianceDeviceOverview> callback);

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the object to create/update
     * @return the created DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview put(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceDeviceOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceDeviceOverviewRequest expand(final String value);

}

