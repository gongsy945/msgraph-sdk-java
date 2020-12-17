// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.LinkedResource;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionPage;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource Collection Page.
 */
public class LinkedResourceCollectionPage extends BaseCollectionPage<LinkedResource, ILinkedResourceCollectionRequestBuilder> implements ILinkedResourceCollectionPage {

    /**
     * A collection page for LinkedResource
     *
     * @param response the serialized LinkedResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public LinkedResourceCollectionPage(final LinkedResourceCollectionResponse response, final ILinkedResourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
