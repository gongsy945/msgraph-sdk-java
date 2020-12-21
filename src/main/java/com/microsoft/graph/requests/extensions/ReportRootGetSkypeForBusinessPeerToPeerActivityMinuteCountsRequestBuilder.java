// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Peer To Peer Activity Minute Counts Request Builder.
 */
public class ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest request = new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest(
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
