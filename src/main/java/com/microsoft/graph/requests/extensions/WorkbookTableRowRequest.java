// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Request.
 */
public class WorkbookTableRowRequest extends BaseRequest {
	
    /**
     * The request for the WorkbookTableRow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRow.class);
    }

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @return the WorkbookTableRow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableRow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookTableRow> callback) {
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
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookTableRow sourceWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTableRow);
    }

    /**
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @return the updated WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableRow patch(final WorkbookTableRow sourceWorkbookTableRow) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.POST, callback, newWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @return the created WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookTableRow newWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PUT, callback, newWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the object to create/update
     * @return the created WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableRow put(final WorkbookTableRow newWorkbookTableRow) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookTableRow);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookTableRowRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookTableRowRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookTableRowRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookTableRowRequest)this;
     }

}

