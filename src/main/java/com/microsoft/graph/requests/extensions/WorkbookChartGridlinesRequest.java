// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartGridlines;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines Request.
 */
public class WorkbookChartGridlinesRequest extends BaseRequest implements IWorkbookChartGridlinesRequest {
	
    /**
     * The request for the WorkbookChartGridlines
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartGridlines.class);
    }

    /**
     * Gets the WorkbookChartGridlines from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartGridlines> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartGridlines from the service
     *
     * @return the WorkbookChartGridlines from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlines get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartGridlines> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartGridlines with a source
     *
     * @param sourceWorkbookChartGridlines the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartGridlines sourceWorkbookChartGridlines, final ICallback<? super WorkbookChartGridlines> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartGridlines);
    }

    /**
     * Patches this WorkbookChartGridlines with a source
     *
     * @param sourceWorkbookChartGridlines the source object with updates
     * @return the updated WorkbookChartGridlines
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlines patch(final WorkbookChartGridlines sourceWorkbookChartGridlines) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartGridlines);
    }

    /**
     * Creates a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartGridlines newWorkbookChartGridlines, final ICallback<? super WorkbookChartGridlines> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartGridlines);
    }

    /**
     * Creates a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the new object to create
     * @return the created WorkbookChartGridlines
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlines post(final WorkbookChartGridlines newWorkbookChartGridlines) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartGridlines);
    }

    /**
     * Creates a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartGridlines newWorkbookChartGridlines, final ICallback<? super WorkbookChartGridlines> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartGridlines);
    }

    /**
     * Creates a WorkbookChartGridlines with a new object
     *
     * @param newWorkbookChartGridlines the object to create/update
     * @return the created WorkbookChartGridlines
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartGridlines put(final WorkbookChartGridlines newWorkbookChartGridlines) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartGridlines);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartGridlinesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartGridlinesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartGridlinesRequest)this;
     }

}

