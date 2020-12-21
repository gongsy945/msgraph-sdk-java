// Template Source: IBaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Certificate Based Auth Configuration Collection With References Request Builder.
 */
public interface ICertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICertificateBasedAuthConfigurationCollectionWithReferencesRequest instance
     */
    ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICertificateBasedAuthConfigurationCollectionWithReferencesRequest instance
     */
    ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ICertificateBasedAuthConfigurationWithReferenceRequestBuilder byId(final String id);

    ICertificateBasedAuthConfigurationCollectionReferenceRequestBuilder references();
}
