// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat Message Hosted Content Request.
 */
public interface IChatMessageHostedContentRequest extends IHttpRequest {

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ChatMessageHostedContent> callback);

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @return the ChatMessageHostedContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ChatMessageHostedContent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ChatMessageHostedContent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ChatMessageHostedContent sourceChatMessageHostedContent, final ICallback<? super ChatMessageHostedContent> callback);

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @return the updated ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ChatMessageHostedContent patch(final ChatMessageHostedContent sourceChatMessageHostedContent) throws ClientException;

    /**
     * Posts a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ChatMessageHostedContent newChatMessageHostedContent, final ICallback<? super ChatMessageHostedContent> callback);

    /**
     * Posts a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @return the created ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ChatMessageHostedContent post(final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException;

    /**
     * Posts a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ChatMessageHostedContent newChatMessageHostedContent, final ICallback<? super ChatMessageHostedContent> callback);

    /**
     * Posts a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the object to create/update
     * @return the created ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ChatMessageHostedContent put(final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IChatMessageHostedContentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IChatMessageHostedContentRequest expand(final String value);

}

