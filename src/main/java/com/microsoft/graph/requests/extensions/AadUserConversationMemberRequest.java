// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AadUserConversationMember;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aad User Conversation Member Request.
 */
public class AadUserConversationMemberRequest extends BaseRequest implements IAadUserConversationMemberRequest {
	
    /**
     * The request for the AadUserConversationMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AadUserConversationMemberRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AadUserConversationMember.class);
    }

    /**
     * Gets the AadUserConversationMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AadUserConversationMember> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AadUserConversationMember from the service
     *
     * @return the AadUserConversationMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AadUserConversationMember get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AadUserConversationMember> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AadUserConversationMember with a source
     *
     * @param sourceAadUserConversationMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AadUserConversationMember sourceAadUserConversationMember, final ICallback<? super AadUserConversationMember> callback) {
        send(HttpMethod.PATCH, callback, sourceAadUserConversationMember);
    }

    /**
     * Patches this AadUserConversationMember with a source
     *
     * @param sourceAadUserConversationMember the source object with updates
     * @return the updated AadUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AadUserConversationMember patch(final AadUserConversationMember sourceAadUserConversationMember) throws ClientException {
        return send(HttpMethod.PATCH, sourceAadUserConversationMember);
    }

    /**
     * Creates a AadUserConversationMember with a new object
     *
     * @param newAadUserConversationMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AadUserConversationMember newAadUserConversationMember, final ICallback<? super AadUserConversationMember> callback) {
        send(HttpMethod.POST, callback, newAadUserConversationMember);
    }

    /**
     * Creates a AadUserConversationMember with a new object
     *
     * @param newAadUserConversationMember the new object to create
     * @return the created AadUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AadUserConversationMember post(final AadUserConversationMember newAadUserConversationMember) throws ClientException {
        return send(HttpMethod.POST, newAadUserConversationMember);
    }

    /**
     * Creates a AadUserConversationMember with a new object
     *
     * @param newAadUserConversationMember the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AadUserConversationMember newAadUserConversationMember, final ICallback<? super AadUserConversationMember> callback) {
        send(HttpMethod.PUT, callback, newAadUserConversationMember);
    }

    /**
     * Creates a AadUserConversationMember with a new object
     *
     * @param newAadUserConversationMember the object to create/update
     * @return the created AadUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AadUserConversationMember put(final AadUserConversationMember newAadUserConversationMember) throws ClientException {
        return send(HttpMethod.PUT, newAadUserConversationMember);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAadUserConversationMemberRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AadUserConversationMemberRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAadUserConversationMemberRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AadUserConversationMemberRequest)this;
     }

}

