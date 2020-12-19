// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Collection Page.
 */
public class OnlineMeetingCollectionPage extends BaseCollectionPage<OnlineMeeting, IOnlineMeetingCollectionRequestBuilder> implements IOnlineMeetingCollectionPage {

    /**
     * A collection page for OnlineMeeting
     *
     * @param response the serialized OnlineMeetingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnlineMeetingCollectionPage(final OnlineMeetingCollectionResponse response, final IOnlineMeetingCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
