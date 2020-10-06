// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Planner;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Request Builder.
 */
public class PlannerRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PlannerRequest instance
     */
    public PlannerRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PlannerRequest instance
     */
    public PlannerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public PlannerBucketCollectionRequestBuilder buckets() {
        return new PlannerBucketCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("buckets"), getClient(), null);
    }

    public PlannerBucketRequestBuilder buckets(final String id) {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment("buckets") + "/" + id, getClient(), null);
    }
    public PlannerPlanCollectionRequestBuilder plans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public PlannerPlanRequestBuilder plans(final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
    public PlannerTaskCollectionRequestBuilder tasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public PlannerTaskRequestBuilder tasks(final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}
