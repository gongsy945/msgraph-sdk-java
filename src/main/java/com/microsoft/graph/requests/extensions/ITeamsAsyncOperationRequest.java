// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams Async Operation Request.
 */
public interface ITeamsAsyncOperationRequest extends IHttpRequest {

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsAsyncOperation> callback);

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @return the TeamsAsyncOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAsyncOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsAsyncOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsAsyncOperation sourceTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback);

    /**
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @return the updated TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAsyncOperation patch(final TeamsAsyncOperation sourceTeamsAsyncOperation) throws ClientException;

    /**
     * Posts a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsAsyncOperation newTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback);

    /**
     * Posts a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAsyncOperation post(final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException;

    /**
     * Posts a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsAsyncOperation newTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback);

    /**
     * Posts a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAsyncOperation put(final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsAsyncOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsAsyncOperationRequest expand(final String value);

}

