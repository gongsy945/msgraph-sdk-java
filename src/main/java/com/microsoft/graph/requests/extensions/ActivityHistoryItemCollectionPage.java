// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.requests.extensions.IActivityHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionPage;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Collection Page.
 */
public class ActivityHistoryItemCollectionPage extends BaseCollectionPage<ActivityHistoryItem, IActivityHistoryItemCollectionRequestBuilder> implements IActivityHistoryItemCollectionPage {

    /**
     * A collection page for ActivityHistoryItem
     *
     * @param response the serialized ActivityHistoryItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ActivityHistoryItemCollectionPage(final ActivityHistoryItemCollectionResponse response, final IActivityHistoryItemCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
