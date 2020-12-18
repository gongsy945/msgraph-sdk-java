// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFill;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Fill Request Builder.
 */
public class WorkbookRangeFillRequestBuilder extends BaseRequestBuilder implements IWorkbookRangeFillRequestBuilder {

    /**
     * The request builder for the WorkbookRangeFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFillRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeFillRequest instance
     */
    public IWorkbookRangeFillRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeFillRequest instance
     */
    public IWorkbookRangeFillRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookRangeFillRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IWorkbookRangeFillClearRequestBuilder clear() {
        return new WorkbookRangeFillClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}
