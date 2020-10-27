// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.LocalizedNotificationMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Localized Notification Message Collection Request.
 */
public class LocalizedNotificationMessageCollectionRequest extends BaseCollectionRequest<LocalizedNotificationMessage, LocalizedNotificationMessageCollectionResponse, LocalizedNotificationMessageCollectionPage> {

    /**
     * The request builder for this collection of LocalizedNotificationMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LocalizedNotificationMessageCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LocalizedNotificationMessageCollectionResponse.class, LocalizedNotificationMessageCollectionPage.class, LocalizedNotificationMessageCollectionRequestBuilder.class);
    }

    /**
     * Creates a new LocalizedNotificationMessage
     * @param newLocalizedNotificationMessage the LocalizedNotificationMessage to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final LocalizedNotificationMessage newLocalizedNotificationMessage, final ICallback<? super LocalizedNotificationMessage> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLocalizedNotificationMessage, callback);
    }

    /**
     * Creates a new LocalizedNotificationMessage
     * @param newLocalizedNotificationMessage the LocalizedNotificationMessage to create
     * @return the newly created object
     */
    public LocalizedNotificationMessage post(final LocalizedNotificationMessage newLocalizedNotificationMessage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLocalizedNotificationMessage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public LocalizedNotificationMessageCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
