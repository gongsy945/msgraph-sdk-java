// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device And App Management Role Assignment Request.
 */
public interface IDeviceAndAppManagementRoleAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback);

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @return the DeviceAndAppManagementRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback);

    /**
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @return the updated DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleAssignment patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback);

    /**
     * Posts a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleAssignment post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback);

    /**
     * Posts a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleAssignment put(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleAssignmentRequest expand(final String value);

}

