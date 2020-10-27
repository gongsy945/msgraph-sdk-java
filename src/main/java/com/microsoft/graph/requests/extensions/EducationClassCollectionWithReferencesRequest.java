// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequest;
import com.microsoft.graph.requests.extensions.EducationClassReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Collection With References Request.
 */
public class EducationClassCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<EducationClass, EducationClassWithReferenceRequest, EducationClassReferenceRequestBuilder, EducationClassWithReferenceRequestBuilder, EducationClassCollectionResponse, EducationClassCollectionWithReferencesPage, EducationClassCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClassCollectionResponse.class, EducationClassCollectionWithReferencesPage.class, EducationClassCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public EducationClassCollectionWithReferencesRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public EducationClassCollectionWithReferencesRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public EducationClassCollectionWithReferencesRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public EducationClassCollectionWithReferencesRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public EducationClassCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

}
