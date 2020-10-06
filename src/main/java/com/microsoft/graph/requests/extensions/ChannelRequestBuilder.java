// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Request Builder.
 */
public class ChannelRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the Channel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ChannelRequest instance
     */
    public ChannelRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ChannelRequest instance
     */
    public ChannelRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ChannelRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    public DriveItemRequestBuilder filesFolder() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("filesFolder"), getClient(), null);
    }
    public ConversationMemberCollectionRequestBuilder members() {
        return new ConversationMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public ConversationMemberRequestBuilder members(final String id) {
        return new ConversationMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public ChatMessageCollectionRequestBuilder messages() {
        return new ChatMessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    public ChatMessageRequestBuilder messages(final String id) {
        return new ChatMessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    public TeamsTabCollectionRequestBuilder tabs() {
        return new TeamsTabCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tabs"), getClient(), null);
    }

    public TeamsTabRequestBuilder tabs(final String id) {
        return new TeamsTabRequestBuilder(getRequestUrlWithAdditionalSegment("tabs") + "/" + id, getClient(), null);
    }
}
