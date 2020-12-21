// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Reference Request.
 */
public interface ISiteReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Site> callback);

    Site delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISiteReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISiteReferenceRequest expand(final String value);

    /**
     * Puts the Site
     *
     * @param srcSite the Site to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Site srcSite, final ICallback<? super Site> callback);

    /**
     * Puts the Site
     *
     * @param srcSite the Site to PUT
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Site put(Site srcSite) throws ClientException;
}
