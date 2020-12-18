// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Org Contact With Reference Request.
 */
public interface IOrgContactWithReferenceRequest extends IHttpRequest {

    void post(final OrgContact newOrgContact, final IJsonBackedObject payload, final ICallback<? super OrgContact> callback);

    OrgContact post(final OrgContact newOrgContact, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super OrgContact> callback);

    OrgContact get() throws ClientException;

	void delete(final ICallback<? super OrgContact> callback);

	void delete() throws ClientException;

	void patch(final OrgContact sourceOrgContact, final ICallback<? super OrgContact> callback);

	OrgContact patch(final OrgContact sourceOrgContact) throws ClientException;

    IOrgContactWithReferenceRequest select(final String value);

    IOrgContactWithReferenceRequest expand(final String value);

}
