// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OrgContact;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.OrgContactWithReferenceRequest;
import com.microsoft.graph.requests.extensions.OrgContactReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.OrgContactCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Reference Request.
 */
public class OrgContactCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<OrgContact, OrgContactWithReferenceRequest, OrgContactReferenceRequestBuilder, OrgContactWithReferenceRequestBuilder, OrgContactCollectionResponse, OrgContactCollectionWithReferencesPage, OrgContactCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrgContactCollectionResponse.class, OrgContactCollectionWithReferencesPage.class, OrgContactCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new OrgContact
     * @param newOrgContact the OrgContact to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(final OrgContact newOrgContact, final ICallback<? super OrgContact> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/contacts/" + newOrgContact.id);
        new OrgContactWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOrgContact, body, callback);
    }

    /**
     * Creates a new OrgContact
     * @param newOrgContact the OrgContact to create
     * @return the newly created object
     */
    public OrgContact post(final OrgContact newOrgContact) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/contacts/" + newOrgContact.id);
        return new OrgContactWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newOrgContact, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public OrgContactCollectionReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public OrgContactCollectionReferenceRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public OrgContactCollectionReferenceRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public OrgContactCollectionReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public OrgContactCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
}
