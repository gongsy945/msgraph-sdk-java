// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get By Ids Collection Page.
 */
public class DirectoryObjectGetByIdsCollectionPage extends BaseCollectionPage<DirectoryObject, IDirectoryObjectGetByIdsCollectionRequestBuilder> implements IDirectoryObjectGetByIdsCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response The serialized DirectoryObjectGetByIdsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DirectoryObjectGetByIdsCollectionPage(final DirectoryObjectGetByIdsCollectionResponse response, final IDirectoryObjectGetByIdsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
