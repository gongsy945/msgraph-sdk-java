// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LicenseDetails;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the License Details Request.
 */
public class LicenseDetailsRequest extends BaseRequest implements ILicenseDetailsRequest {
	
    /**
     * The request for the LicenseDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LicenseDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LicenseDetails.class);
    }

    /**
     * Gets the LicenseDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the LicenseDetails from the service
     *
     * @return the LicenseDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LicenseDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super LicenseDetails> callback) {
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
     * Patches this LicenseDetails with a source
     *
     * @param sourceLicenseDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final LicenseDetails sourceLicenseDetails, final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.PATCH, callback, sourceLicenseDetails);
    }

    /**
     * Patches this LicenseDetails with a source
     *
     * @param sourceLicenseDetails the source object with updates
     * @return the updated LicenseDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LicenseDetails patch(final LicenseDetails sourceLicenseDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourceLicenseDetails);
    }

    /**
     * Creates a LicenseDetails with a new object
     *
     * @param newLicenseDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final LicenseDetails newLicenseDetails, final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.POST, callback, newLicenseDetails);
    }

    /**
     * Creates a LicenseDetails with a new object
     *
     * @param newLicenseDetails the new object to create
     * @return the created LicenseDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LicenseDetails post(final LicenseDetails newLicenseDetails) throws ClientException {
        return send(HttpMethod.POST, newLicenseDetails);
    }

    /**
     * Creates a LicenseDetails with a new object
     *
     * @param newLicenseDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final LicenseDetails newLicenseDetails, final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.PUT, callback, newLicenseDetails);
    }

    /**
     * Creates a LicenseDetails with a new object
     *
     * @param newLicenseDetails the object to create/update
     * @return the created LicenseDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LicenseDetails put(final LicenseDetails newLicenseDetails) throws ClientException {
        return send(HttpMethod.PUT, newLicenseDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ILicenseDetailsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (LicenseDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ILicenseDetailsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (LicenseDetailsRequest)this;
     }

}

