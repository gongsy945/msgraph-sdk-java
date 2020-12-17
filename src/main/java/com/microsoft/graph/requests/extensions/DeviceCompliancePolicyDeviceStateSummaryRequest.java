// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyDeviceStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Device State Summary Request.
 */
public class DeviceCompliancePolicyDeviceStateSummaryRequest extends BaseRequest implements IDeviceCompliancePolicyDeviceStateSummaryRequest {
	
    /**
     * The request for the DeviceCompliancePolicyDeviceStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyDeviceStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyDeviceStateSummary.class);
    }

    /**
     * Gets the DeviceCompliancePolicyDeviceStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceCompliancePolicyDeviceStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyDeviceStateSummary from the service
     *
     * @return the DeviceCompliancePolicyDeviceStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyDeviceStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceCompliancePolicyDeviceStateSummary> callback) {
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
     * Patches this DeviceCompliancePolicyDeviceStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicyDeviceStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyDeviceStateSummary sourceDeviceCompliancePolicyDeviceStateSummary, final ICallback<? super DeviceCompliancePolicyDeviceStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Patches this DeviceCompliancePolicyDeviceStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicyDeviceStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicyDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyDeviceStateSummary patch(final DeviceCompliancePolicyDeviceStateSummary sourceDeviceCompliancePolicyDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary, final ICallback<? super DeviceCompliancePolicyDeviceStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the new object to create
     * @return the created DeviceCompliancePolicyDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyDeviceStateSummary post(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary, final ICallback<? super DeviceCompliancePolicyDeviceStateSummary> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the object to create/update
     * @return the created DeviceCompliancePolicyDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyDeviceStateSummary put(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicyDeviceStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyDeviceStateSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicyDeviceStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyDeviceStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicyDeviceStateSummaryRequest)this;
     }

}

