// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationSetPriorityRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Enrollment Configuration Set Priority Request Builder.
 */
public interface IDeviceEnrollmentConfigurationSetPriorityRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceEnrollmentConfigurationSetPriorityRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceEnrollmentConfigurationSetPriorityRequest instance
     */
    IDeviceEnrollmentConfigurationSetPriorityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceEnrollmentConfigurationSetPriorityRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceEnrollmentConfigurationSetPriorityRequest instance
     */
    IDeviceEnrollmentConfigurationSetPriorityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
