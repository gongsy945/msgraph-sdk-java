// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Item At Request Builder.
 */
public class WorkbookRangeViewItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRangeView> {

    /**
     * The request builder for this WorkbookRangeViewItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookRangeViewItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("index", index));
    }

    /**
     * Creates the WorkbookRangeViewItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeViewItemAtRequest instance
     */
    public WorkbookRangeViewItemAtRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeViewItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeViewItemAtRequest instance
     */
    public WorkbookRangeViewItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeViewItemAtRequest request = new WorkbookRangeViewItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
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
}
