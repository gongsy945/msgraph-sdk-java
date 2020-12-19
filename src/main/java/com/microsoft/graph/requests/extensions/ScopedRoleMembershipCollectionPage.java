// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scoped Role Membership Collection Page.
 */
public class ScopedRoleMembershipCollectionPage extends BaseCollectionPage<ScopedRoleMembership, IScopedRoleMembershipCollectionRequestBuilder> implements IScopedRoleMembershipCollectionPage {

    /**
     * A collection page for ScopedRoleMembership
     *
     * @param response the serialized ScopedRoleMembershipCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ScopedRoleMembershipCollectionPage(final ScopedRoleMembershipCollectionResponse response, final IScopedRoleMembershipCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
