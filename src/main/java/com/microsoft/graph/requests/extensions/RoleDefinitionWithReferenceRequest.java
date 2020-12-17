// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.requests.extensions.IRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition With Reference Request.
 */
public class RoleDefinitionWithReferenceRequest extends BaseRequest implements IRoleDefinitionWithReferenceRequest {

    /**
     * The request for the RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleDefinitionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleDefinition.class);
    }

    public void post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload, final ICallback<? super RoleDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public RoleDefinition post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newRoleDefinition;
        }
        return null;
    }

    public void get(final ICallback<? super RoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public RoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super RoleDefinition> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final RoleDefinition sourceRoleDefinition, final ICallback<? super RoleDefinition> callback) {
		send(HttpMethod.PATCH, callback, sourceRoleDefinition);
	}

	public RoleDefinition patch(final RoleDefinition sourceRoleDefinition) throws ClientException {
		return send(HttpMethod.PATCH, sourceRoleDefinition);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleDefinitionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IRoleDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleDefinitionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RoleDefinitionWithReferenceRequest)this;
    }
}
