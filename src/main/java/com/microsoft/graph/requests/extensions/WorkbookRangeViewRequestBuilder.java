// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Request Builder.
 */
public class WorkbookRangeViewRequestBuilder extends BaseRequestBuilder<WorkbookRangeView> {

    /**
     * The request builder for the WorkbookRangeView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeViewRequest instance
     */
    public WorkbookRangeViewRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeViewRequest instance
     */
    public WorkbookRangeViewRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookRangeViewRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WorkbookRangeView collection
     *
     * @return the collection request builder
     */
    public WorkbookRangeViewCollectionRequestBuilder rows() {
        return new WorkbookRangeViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookRangeView item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookRangeViewRequestBuilder rows(final String id) {
        return new WorkbookRangeViewRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public WorkbookRangeViewRangeRequestBuilder range() {
        return new WorkbookRangeViewRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }
}
