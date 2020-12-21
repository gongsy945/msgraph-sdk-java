// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Teamwork Request.
 */
public class UserTeamworkRequest extends BaseRequest implements IUserTeamworkRequest {
	
    /**
     * The request for the UserTeamwork
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserTeamworkRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserTeamwork.class);
    }

    /**
     * Gets the UserTeamwork from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserTeamwork> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserTeamwork from the service
     *
     * @return the UserTeamwork from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserTeamwork get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserTeamwork> callback) {
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
     * Patches this UserTeamwork with a source
     *
     * @param sourceUserTeamwork the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserTeamwork sourceUserTeamwork, final ICallback<? super UserTeamwork> callback) {
        send(HttpMethod.PATCH, callback, sourceUserTeamwork);
    }

    /**
     * Patches this UserTeamwork with a source
     *
     * @param sourceUserTeamwork the source object with updates
     * @return the updated UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserTeamwork patch(final UserTeamwork sourceUserTeamwork) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserTeamwork);
    }

    /**
     * Creates a UserTeamwork with a new object
     *
     * @param newUserTeamwork the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserTeamwork newUserTeamwork, final ICallback<? super UserTeamwork> callback) {
        send(HttpMethod.POST, callback, newUserTeamwork);
    }

    /**
     * Creates a UserTeamwork with a new object
     *
     * @param newUserTeamwork the new object to create
     * @return the created UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserTeamwork post(final UserTeamwork newUserTeamwork) throws ClientException {
        return send(HttpMethod.POST, newUserTeamwork);
    }

    /**
     * Creates a UserTeamwork with a new object
     *
     * @param newUserTeamwork the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserTeamwork newUserTeamwork, final ICallback<? super UserTeamwork> callback) {
        send(HttpMethod.PUT, callback, newUserTeamwork);
    }

    /**
     * Creates a UserTeamwork with a new object
     *
     * @param newUserTeamwork the object to create/update
     * @return the created UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserTeamwork put(final UserTeamwork newUserTeamwork) throws ClientException {
        return send(HttpMethod.PUT, newUserTeamwork);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserTeamworkRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserTeamworkRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserTeamworkRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserTeamworkRequest)this;
     }

}

