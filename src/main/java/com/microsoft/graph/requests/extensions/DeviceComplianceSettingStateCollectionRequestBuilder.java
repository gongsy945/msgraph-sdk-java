// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Setting State Collection Request Builder.
 */
public class DeviceComplianceSettingStateCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceSettingStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public DeviceComplianceSettingStateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public DeviceComplianceSettingStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceComplianceSettingStateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public DeviceComplianceSettingStateRequestBuilder byId(final String id) {
        return new DeviceComplianceSettingStateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
