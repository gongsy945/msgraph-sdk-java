// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDatevalueRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDatevalueRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Datevalue Request Builder.
 */
public class WorkbookFunctionsDatevalueRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDatevalueRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDatevalue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param dateText the dateText
     */
    public WorkbookFunctionsDatevalueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement dateText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("dateText", dateText);
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDatevalueRequest request = new WorkbookFunctionsDatevalueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("dateText")) {
            request.body.dateText = getParameter("dateText");
        }

        return request;
    }
}
