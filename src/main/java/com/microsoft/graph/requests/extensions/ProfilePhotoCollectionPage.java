// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Photo Collection Page.
 */
public class ProfilePhotoCollectionPage extends BaseCollectionPage<ProfilePhoto, IProfilePhotoCollectionRequestBuilder> implements IProfilePhotoCollectionPage {

    /**
     * A collection page for ProfilePhoto
     *
     * @param response the serialized ProfilePhotoCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProfilePhotoCollectionPage(final ProfilePhotoCollectionResponse response, final IProfilePhotoCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
