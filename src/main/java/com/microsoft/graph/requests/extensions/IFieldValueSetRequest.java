// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.FieldValueSet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Field Value Set Request.
 */
public interface IFieldValueSetRequest extends IHttpRequest {

    /**
     * Gets the FieldValueSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super FieldValueSet> callback);

    /**
     * Gets the FieldValueSet from the service
     *
     * @return the FieldValueSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FieldValueSet get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super FieldValueSet> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final FieldValueSet sourceFieldValueSet, final ICallback<? super FieldValueSet> callback);

    /**
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @return the updated FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FieldValueSet patch(final FieldValueSet sourceFieldValueSet) throws ClientException;

    /**
     * Posts a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final FieldValueSet newFieldValueSet, final ICallback<? super FieldValueSet> callback);

    /**
     * Posts a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FieldValueSet post(final FieldValueSet newFieldValueSet) throws ClientException;

    /**
     * Posts a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final FieldValueSet newFieldValueSet, final ICallback<? super FieldValueSet> callback);

    /**
     * Posts a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FieldValueSet put(final FieldValueSet newFieldValueSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IFieldValueSetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IFieldValueSetRequest expand(final String value);

}

