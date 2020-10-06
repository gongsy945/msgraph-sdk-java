// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ScheduleShareRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Share Request Builder.
 */
public class ScheduleShareRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ScheduleShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param notifyTeam the notifyTeam
     * @param startDateTime the startDateTime
     * @param endDateTime the endDateTime
     */
    public ScheduleShareRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean notifyTeam, final java.util.Calendar startDateTime, final java.util.Calendar endDateTime) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("notifyTeam", notifyTeam);
        bodyParams.put("startDateTime", startDateTime);
        bodyParams.put("endDateTime", endDateTime);
    }

    /**
     * Creates the ScheduleShareRequest
     *
     * @param requestOptions the options for the request
     * @return the ScheduleShareRequest instance
     */
    public ScheduleShareRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ScheduleShareRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ScheduleShareRequest instance
     */
    public ScheduleShareRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ScheduleShareRequest request = new ScheduleShareRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("notifyTeam")) {
            request.body.notifyTeam = getParameter("notifyTeam");
        }

        if (hasParameter("startDateTime")) {
            request.body.startDateTime = getParameter("startDateTime");
        }

        if (hasParameter("endDateTime")) {
            request.body.endDateTime = getParameter("endDateTime");
        }

        return request;
    }
}
