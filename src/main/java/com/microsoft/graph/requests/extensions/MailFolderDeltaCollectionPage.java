// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailFolder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Delta Collection Page.
 */
public class MailFolderDeltaCollectionPage extends BaseCollectionPage<MailFolder, MailFolderDeltaCollectionRequestBuilder> {

    /**
     * The opaque link to query delta after the 
     * initial request
     */
    public String deltaLink;

    /**
     * A collection page for MailFolder.
     *
     * @param response The serialized MailFolderDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public MailFolderDeltaCollectionPage(final MailFolderDeltaCollectionResponse response, final MailFolderDeltaCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());

        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    public String deltaLink() {
        return deltaLink;
    }
}
