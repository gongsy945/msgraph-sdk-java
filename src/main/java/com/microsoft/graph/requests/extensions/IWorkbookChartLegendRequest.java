// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartLegend;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Legend Request.
 */
public interface IWorkbookChartLegendRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartLegend> callback);

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @return the WorkbookChartLegend from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartLegend get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartLegend> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartLegend sourceWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback);

    /**
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @return the updated WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartLegend patch(final WorkbookChartLegend sourceWorkbookChartLegend) throws ClientException;

    /**
     * Posts a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartLegend newWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback);

    /**
     * Posts a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartLegend post(final WorkbookChartLegend newWorkbookChartLegend) throws ClientException;

    /**
     * Posts a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartLegend newWorkbookChartLegend, final ICallback<? super WorkbookChartLegend> callback);

    /**
     * Posts a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartLegend put(final WorkbookChartLegend newWorkbookChartLegend) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartLegendRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartLegendRequest expand(final String value);

}

