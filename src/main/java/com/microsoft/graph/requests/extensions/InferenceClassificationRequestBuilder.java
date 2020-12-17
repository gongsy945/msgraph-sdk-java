// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationOverrideRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification Request Builder.
 */
public class InferenceClassificationRequestBuilder extends BaseRequestBuilder implements IInferenceClassificationRequestBuilder {

    /**
     * The request builder for the InferenceClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IInferenceClassificationRequest instance
     */
    public IInferenceClassificationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IInferenceClassificationRequest instance
     */
    public IInferenceClassificationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.InferenceClassificationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IInferenceClassificationOverrideCollectionRequestBuilder overrides() {
        return new InferenceClassificationOverrideCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("overrides"), getClient(), null);
    }

    public IInferenceClassificationOverrideRequestBuilder overrides(final String id) {
        return new InferenceClassificationOverrideRequestBuilder(getRequestUrlWithAdditionalSegment("overrides") + "/" + id, getClient(), null);
    }
}
