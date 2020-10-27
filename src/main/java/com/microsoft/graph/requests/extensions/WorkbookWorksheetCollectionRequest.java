// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Collection Request.
 */
public class WorkbookWorksheetCollectionRequest extends BaseCollectionRequest<WorkbookWorksheet, WorkbookWorksheetCollectionResponse, WorkbookWorksheetCollectionPage> {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookWorksheetCollectionResponse.class, WorkbookWorksheetCollectionPage.class, WorkbookWorksheetCollectionRequestBuilder.class);
    }

    /**
     * Creates a new WorkbookWorksheet
     * @param newWorkbookWorksheet the WorkbookWorksheet to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final WorkbookWorksheet newWorkbookWorksheet, final ICallback<? super WorkbookWorksheet> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookWorksheetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookWorksheet, callback);
    }

    /**
     * Creates a new WorkbookWorksheet
     * @param newWorkbookWorksheet the WorkbookWorksheet to create
     * @return the newly created object
     */
    public WorkbookWorksheet post(final WorkbookWorksheet newWorkbookWorksheet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookWorksheetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookWorksheet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public WorkbookWorksheetCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
