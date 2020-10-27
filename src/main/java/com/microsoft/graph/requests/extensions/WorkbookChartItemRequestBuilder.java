// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookChartItemRequest;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Item Request Builder.
 */
public class WorkbookChartItemRequestBuilder extends BaseFunctionRequestBuilder<WorkbookChart> {

    /**
     * The request builder for this WorkbookChartItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     */
    public WorkbookChartItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String name) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("name", name));
    }

    /**
     * Creates the WorkbookChartItemRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartItemRequest instance
     */
    public WorkbookChartItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartItemRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartItemRequest instance
     */
    public WorkbookChartItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartItemRequest request = new WorkbookChartItemRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the WorkbookChartAxesRequestBuilder instance
     */
    public WorkbookChartAxesRequestBuilder axes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the WorkbookChartDataLabelsRequestBuilder instance
     */
    public WorkbookChartDataLabelsRequestBuilder dataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the WorkbookChartAreaFormatRequestBuilder instance
     */
    public WorkbookChartAreaFormatRequestBuilder format() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the WorkbookChartLegendRequestBuilder instance
     */
    public WorkbookChartLegendRequestBuilder legend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookChartSeries collection
     *
     * @return the collection request builder
     */
    public WorkbookChartSeriesCollectionRequestBuilder series() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookChartSeries item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WorkbookChartSeriesRequestBuilder series(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the WorkbookChartTitleRequestBuilder instance
     */
    public WorkbookChartTitleRequestBuilder title() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
