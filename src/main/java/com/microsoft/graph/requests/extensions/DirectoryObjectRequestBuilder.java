// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Request Builder.
 */
public class DirectoryObjectRequestBuilder extends BaseRequestBuilder<DirectoryObject> {

    /**
     * The request builder for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectRequest instance
     */
    public DirectoryObjectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectRequest instance
     */
    public DirectoryObjectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DirectoryObjectRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param groupIds the groupIds
     */
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(final java.util.List<String> groupIds) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, groupIds);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param ids the ids
     */
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(final java.util.List<String> ids) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, ids);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param securityEnabledOnly the securityEnabledOnly
     */
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, securityEnabledOnly);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param securityEnabledOnly the securityEnabledOnly
     */
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, securityEnabledOnly);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
