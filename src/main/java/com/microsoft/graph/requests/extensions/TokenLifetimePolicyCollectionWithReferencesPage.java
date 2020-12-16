// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Collection With References Page.
 */
public class TokenLifetimePolicyCollectionWithReferencesPage extends BaseCollectionPage<TokenLifetimePolicy, ITokenLifetimePolicyCollectionWithReferencesRequestBuilder> implements ITokenLifetimePolicyCollectionWithReferencesPage {

    /**
     * A collection page for TokenLifetimePolicy
     *
     * @param response the serialized TokenLifetimePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenLifetimePolicyCollectionWithReferencesPage(final TokenLifetimePolicyCollectionResponse response, final ITokenLifetimePolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
