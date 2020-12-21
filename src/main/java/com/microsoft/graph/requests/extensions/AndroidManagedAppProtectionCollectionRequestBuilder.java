// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Collection Request Builder.
 */
public class AndroidManagedAppProtectionCollectionRequestBuilder extends BaseRequestBuilder implements IAndroidManagedAppProtectionCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppProtectionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAndroidManagedAppProtectionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAndroidManagedAppProtectionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AndroidManagedAppProtectionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAndroidManagedAppProtectionRequestBuilder byId(final String id) {
        return new AndroidManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
