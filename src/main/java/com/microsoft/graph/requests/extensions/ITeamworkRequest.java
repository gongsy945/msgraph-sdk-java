// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Teamwork;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teamwork Request.
 */
public interface ITeamworkRequest extends IHttpRequest {

    /**
     * Gets the Teamwork from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Teamwork> callback);

    /**
     * Gets the Teamwork from the service
     *
     * @return the Teamwork from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Teamwork get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Teamwork> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Teamwork with a source
     *
     * @param sourceTeamwork the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Teamwork sourceTeamwork, final ICallback<? super Teamwork> callback);

    /**
     * Patches this Teamwork with a source
     *
     * @param sourceTeamwork the source object with updates
     * @return the updated Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Teamwork patch(final Teamwork sourceTeamwork) throws ClientException;

    /**
     * Posts a Teamwork with a new object
     *
     * @param newTeamwork the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Teamwork newTeamwork, final ICallback<? super Teamwork> callback);

    /**
     * Posts a Teamwork with a new object
     *
     * @param newTeamwork the new object to create
     * @return the created Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Teamwork post(final Teamwork newTeamwork) throws ClientException;

    /**
     * Posts a Teamwork with a new object
     *
     * @param newTeamwork the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Teamwork newTeamwork, final ICallback<? super Teamwork> callback);

    /**
     * Posts a Teamwork with a new object
     *
     * @param newTeamwork the object to create/update
     * @return the created Teamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Teamwork put(final Teamwork newTeamwork) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamworkRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamworkRequest expand(final String value);

}

