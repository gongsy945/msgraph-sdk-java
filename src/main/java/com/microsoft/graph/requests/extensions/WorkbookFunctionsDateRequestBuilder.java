// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDateRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Date Request Builder.
 */
public class WorkbookFunctionsDateRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param year the year
     * @param month the month
     * @param day the day
     */
    public WorkbookFunctionsDateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement year, final com.google.gson.JsonElement month, final com.google.gson.JsonElement day) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("year", year);
        bodyParams.put("month", month);
        bodyParams.put("day", day);
    }

    /**
     * Creates the WorkbookFunctionsDateRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDateRequest instance
     */
    public WorkbookFunctionsDateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsDateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDateRequest instance
     */
    public WorkbookFunctionsDateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDateRequest request = new WorkbookFunctionsDateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("year")) {
            request.body.year = getParameter("year");
        }

        if (hasParameter("month")) {
            request.body.month = getParameter("month");
        }

        if (hasParameter("day")) {
            request.body.day = getParameter("day");
        }

        return request;
    }
}
