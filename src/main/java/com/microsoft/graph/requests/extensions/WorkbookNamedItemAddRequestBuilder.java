// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemAddRequest;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Named Item Add Request Builder.
 */
public class WorkbookNamedItemAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param reference the reference
     * @param comment the comment
     */
    public WorkbookNamedItemAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String name, final com.google.gson.JsonElement reference, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
        bodyParams.put("reference", reference);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the WorkbookNamedItemAddRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookNamedItemAddRequest instance
     */
    public WorkbookNamedItemAddRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookNamedItemAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookNamedItemAddRequest instance
     */
    public WorkbookNamedItemAddRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookNamedItemAddRequest request = new WorkbookNamedItemAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
