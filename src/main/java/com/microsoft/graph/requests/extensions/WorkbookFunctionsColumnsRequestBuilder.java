// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsColumnsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsColumnsRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Columns Request Builder.
 */
public class WorkbookFunctionsColumnsRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsColumnsRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsColumns
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     */
    public WorkbookFunctionsColumnsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement array) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
    }

    /**
     * Creates the IWorkbookFunctionsColumnsRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsColumnsRequest instance
     */
    public IWorkbookFunctionsColumnsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsColumnsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsColumnsRequest instance
     */
    public IWorkbookFunctionsColumnsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsColumnsRequest request = new WorkbookFunctionsColumnsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        return request;
    }
}
