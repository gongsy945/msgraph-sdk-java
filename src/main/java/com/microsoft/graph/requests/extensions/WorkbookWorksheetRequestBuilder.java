// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Request Builder.
 */
public class WorkbookWorksheetRequestBuilder extends BaseRequestBuilder<WorkbookWorksheet> {

    /**
     * The request builder for the WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookWorksheetRequest instance
     */
    public WorkbookWorksheetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookWorksheetRequest instance
     */
    public WorkbookWorksheetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookWorksheetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WorkbookChart collection
     *
     * @return the collection request builder
     */
    public WorkbookChartCollectionRequestBuilder charts() {
        return new WorkbookChartCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("charts"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookChart item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookChartRequestBuilder charts(final String id) {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment("charts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookNamedItem collection
     *
     * @return the collection request builder
     */
    public WorkbookNamedItemCollectionRequestBuilder names() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookNamedItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookNamedItemRequestBuilder names(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookPivotTable collection
     *
     * @return the collection request builder
     */
    public WorkbookPivotTableCollectionRequestBuilder pivotTables() {
        return new WorkbookPivotTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookPivotTable item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookPivotTableRequestBuilder pivotTables(final String id) {
        return new WorkbookPivotTableRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheetProtection
     *
     * @return the WorkbookWorksheetProtectionRequestBuilder instance
     */
    public WorkbookWorksheetProtectionRequestBuilder protection() {
        return new WorkbookWorksheetProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("protection"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookTable collection
     *
     * @return the collection request builder
     */
    public WorkbookTableCollectionRequestBuilder tables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookTable item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookTableRequestBuilder tables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param row the row
     * @param column the column
     */
    public WorkbookWorksheetCellRequestBuilder cell(final Integer row, final Integer column) {
        return new WorkbookWorksheetCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cell"), getClient(), null, row, column);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public WorkbookWorksheetUsedRangeRequestBuilder usedRange() {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param valuesOnly the valuesOnly
     */
    public WorkbookWorksheetUsedRangeRequestBuilder usedRange(final Boolean valuesOnly) {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null, valuesOnly);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public WorkbookWorksheetRangeRequestBuilder range() {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param address the address
     */
    public WorkbookWorksheetRangeRequestBuilder range(final String address) {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null, address);
    }
}
