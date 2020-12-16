// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Domain;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Request Builder.
 */
public interface IDomainRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDomainRequest instance
     */
    IDomainRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDomainRequest instance
     */
    IDomainRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDirectoryObjectCollectionWithReferencesRequestBuilder domainNameReferences();

    IDirectoryObjectWithReferenceRequestBuilder domainNameReferences(final String id);

    IDomainDnsRecordCollectionRequestBuilder serviceConfigurationRecords();

    IDomainDnsRecordRequestBuilder serviceConfigurationRecords(final String id);

    IDomainDnsRecordCollectionRequestBuilder verificationDnsRecords();

    IDomainDnsRecordRequestBuilder verificationDnsRecords(final String id);
    IDomainForceDeleteRequestBuilder forceDelete(final Boolean disableUserAccounts);
    IDomainVerifyRequestBuilder verify();

}