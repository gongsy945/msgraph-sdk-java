// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Request.
 */
public class WorkbookChartPointRequest extends BaseRequest implements IWorkbookChartPointRequest {
	
    /**
     * The request for the WorkbookChartPoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartPoint.class);
    }

    /**
     * Gets the WorkbookChartPoint from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartPoint> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartPoint from the service
     *
     * @return the WorkbookChartPoint from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPoint get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartPoint> callback) {
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
     * Patches this WorkbookChartPoint with a source
     *
     * @param sourceWorkbookChartPoint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartPoint sourceWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartPoint);
    }

    /**
     * Patches this WorkbookChartPoint with a source
     *
     * @param sourceWorkbookChartPoint the source object with updates
     * @return the updated WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPoint patch(final WorkbookChartPoint sourceWorkbookChartPoint) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartPoint);
    }

    /**
     * Creates a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartPoint);
    }

    /**
     * Creates a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the new object to create
     * @return the created WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPoint post(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartPoint);
    }

    /**
     * Creates a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartPoint);
    }

    /**
     * Creates a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the object to create/update
     * @return the created WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPoint put(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartPoint);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartPointRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartPointRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartPointRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartPointRequest)this;
     }

}

