// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartFill;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Fill Request.
 */
public interface IWorkbookChartFillRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartFill> callback);

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @return the WorkbookChartFill from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFill get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartFill> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartFill sourceWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback);

    /**
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @return the updated WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFill patch(final WorkbookChartFill sourceWorkbookChartFill) throws ClientException;

    /**
     * Posts a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartFill newWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback);

    /**
     * Posts a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFill post(final WorkbookChartFill newWorkbookChartFill) throws ClientException;

    /**
     * Posts a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartFill newWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback);

    /**
     * Posts a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartFill put(final WorkbookChartFill newWorkbookChartFill) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartFillRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartFillRequest expand(final String value);

}

