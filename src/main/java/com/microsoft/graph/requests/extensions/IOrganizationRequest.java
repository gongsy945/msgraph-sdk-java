// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Organization;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Organization Request.
 */
public interface IOrganizationRequest extends IHttpRequest {

    /**
     * Gets the Organization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Organization> callback);

    /**
     * Gets the Organization from the service
     *
     * @return the Organization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Organization get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Organization> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Organization sourceOrganization, final ICallback<? super Organization> callback);

    /**
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @return the updated Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Organization patch(final Organization sourceOrganization) throws ClientException;

    /**
     * Posts a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Organization newOrganization, final ICallback<? super Organization> callback);

    /**
     * Posts a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Organization post(final Organization newOrganization) throws ClientException;

    /**
     * Posts a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Organization newOrganization, final ICallback<? super Organization> callback);

    /**
     * Posts a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Organization put(final Organization newOrganization) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOrganizationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOrganizationRequest expand(final String value);

}

