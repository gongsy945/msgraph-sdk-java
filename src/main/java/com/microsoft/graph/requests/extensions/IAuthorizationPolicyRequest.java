// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthorizationPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authorization Policy Request.
 */
public interface IAuthorizationPolicyRequest extends IHttpRequest {

    /**
     * Gets the AuthorizationPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AuthorizationPolicy> callback);

    /**
     * Gets the AuthorizationPolicy from the service
     *
     * @return the AuthorizationPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthorizationPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AuthorizationPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AuthorizationPolicy with a source
     *
     * @param sourceAuthorizationPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AuthorizationPolicy sourceAuthorizationPolicy, final ICallback<? super AuthorizationPolicy> callback);

    /**
     * Patches this AuthorizationPolicy with a source
     *
     * @param sourceAuthorizationPolicy the source object with updates
     * @return the updated AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthorizationPolicy patch(final AuthorizationPolicy sourceAuthorizationPolicy) throws ClientException;

    /**
     * Posts a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AuthorizationPolicy newAuthorizationPolicy, final ICallback<? super AuthorizationPolicy> callback);

    /**
     * Posts a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the new object to create
     * @return the created AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthorizationPolicy post(final AuthorizationPolicy newAuthorizationPolicy) throws ClientException;

    /**
     * Posts a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AuthorizationPolicy newAuthorizationPolicy, final ICallback<? super AuthorizationPolicy> callback);

    /**
     * Posts a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the object to create/update
     * @return the created AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthorizationPolicy put(final AuthorizationPolicy newAuthorizationPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthorizationPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthorizationPolicyRequest expand(final String value);

}

