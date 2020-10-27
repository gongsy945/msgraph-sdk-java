// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionResponse;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Collection Request.
 */
public class OnlineMeetingCollectionRequest extends BaseCollectionRequest<OnlineMeeting, OnlineMeetingCollectionResponse, OnlineMeetingCollectionPage> {

    /**
     * The request builder for this collection of OnlineMeeting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnlineMeetingCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnlineMeetingCollectionResponse.class, OnlineMeetingCollectionPage.class, OnlineMeetingCollectionRequestBuilder.class);
    }

    /**
     * Creates a new OnlineMeeting
     * @param newOnlineMeeting the OnlineMeeting to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final OnlineMeeting newOnlineMeeting, final ICallback<? super OnlineMeeting> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OnlineMeetingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnlineMeeting, callback);
    }

    /**
     * Creates a new OnlineMeeting
     * @param newOnlineMeeting the OnlineMeeting to create
     * @return the newly created object
     */
    public OnlineMeeting post(final OnlineMeeting newOnlineMeeting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OnlineMeetingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnlineMeeting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public OnlineMeetingCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
