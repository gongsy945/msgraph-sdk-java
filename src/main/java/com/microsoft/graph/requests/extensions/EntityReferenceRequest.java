// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Entity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Reference Request.
 */
public class EntityReferenceRequest extends BaseRequest implements IEntityReferenceRequest {

    /**
     * The request for the Entity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Entity.class);
    }

    public void delete(final ICallback<? super Entity> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Entity delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEntityReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EntityReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEntityReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EntityReferenceRequest)this;
    }
    /**
     * Puts the Entity
     *
     * @param srcEntity the Entity reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Entity srcEntity, final ICallback<? super Entity> callback) {
        send(HttpMethod.PUT, callback, srcEntity);
    }

    /**
     * Puts the Entity
     *
     * @param srcEntity the Entity reference to PUT
     * @return the Entity
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Entity put(Entity srcEntity) throws ClientException {
        return send(HttpMethod.PUT, srcEntity);
    }
}
