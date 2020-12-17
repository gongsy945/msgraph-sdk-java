// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionResponse;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Collection With References Page.
 */
public class ClaimsMappingPolicyCollectionWithReferencesPage extends BaseCollectionPage<ClaimsMappingPolicy, IClaimsMappingPolicyCollectionWithReferencesRequestBuilder> implements IClaimsMappingPolicyCollectionWithReferencesPage {

    /**
     * A collection page for ClaimsMappingPolicy
     *
     * @param response the serialized ClaimsMappingPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ClaimsMappingPolicyCollectionWithReferencesPage(final ClaimsMappingPolicyCollectionResponse response, final IClaimsMappingPolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
