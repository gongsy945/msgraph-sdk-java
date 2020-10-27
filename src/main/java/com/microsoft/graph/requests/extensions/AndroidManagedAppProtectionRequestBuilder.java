// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Request Builder.
 */
public class AndroidManagedAppProtectionRequestBuilder extends BaseRequestBuilder<AndroidManagedAppProtection> {

    /**
     * The request builder for the AndroidManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedAppProtectionRequest instance
     */
    public AndroidManagedAppProtectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedAppProtectionRequest instance
     */
    public AndroidManagedAppProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TargetedManagedAppPolicyAssignment collection
     *
     * @return the collection request builder
     */
    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public TargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedMobileApp collection
     *
     * @return the collection request builder
     */
    public ManagedMobileAppCollectionRequestBuilder apps() {
        return new ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedMobileApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ManagedMobileAppRequestBuilder apps(final String id) {
        return new ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the ManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    public ManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }
}
