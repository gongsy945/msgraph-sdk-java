// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Multi Value Legacy Extended Property Request.
 */
public interface IMultiValueLegacyExtendedPropertyRequest extends IHttpRequest {

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MultiValueLegacyExtendedProperty> callback);

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @return the MultiValueLegacyExtendedProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MultiValueLegacyExtendedProperty get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MultiValueLegacyExtendedProperty> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty, final ICallback<? super MultiValueLegacyExtendedProperty> callback);

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @return the updated MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MultiValueLegacyExtendedProperty patch(final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty) throws ClientException;

    /**
     * Posts a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, final ICallback<? super MultiValueLegacyExtendedProperty> callback);

    /**
     * Posts a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MultiValueLegacyExtendedProperty post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException;

    /**
     * Posts a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, final ICallback<? super MultiValueLegacyExtendedProperty> callback);

    /**
     * Posts a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MultiValueLegacyExtendedProperty put(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMultiValueLegacyExtendedPropertyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMultiValueLegacyExtendedPropertyRequest expand(final String value);

}

