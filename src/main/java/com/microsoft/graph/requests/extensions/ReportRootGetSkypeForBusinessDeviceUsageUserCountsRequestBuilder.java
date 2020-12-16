// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Device Usage User Counts Request Builder.
 */
public class ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest request = new ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
