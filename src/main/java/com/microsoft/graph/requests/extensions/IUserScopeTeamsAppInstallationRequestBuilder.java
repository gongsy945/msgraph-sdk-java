// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Scope Teams App Installation Request Builder.
 */
public interface IUserScopeTeamsAppInstallationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserScopeTeamsAppInstallationRequest instance
     */
    IUserScopeTeamsAppInstallationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUserScopeTeamsAppInstallationRequest instance
     */
    IUserScopeTeamsAppInstallationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for TeamsApp
     *
     * @return the ITeamsAppWithReferenceRequestBuilder instance
     */
    ITeamsAppWithReferenceRequestBuilder teamsApp();

    /**
     * Gets the request builder for TeamsAppDefinition
     *
     * @return the ITeamsAppDefinitionWithReferenceRequestBuilder instance
     */
    ITeamsAppDefinitionWithReferenceRequestBuilder teamsAppDefinition();

    /**
     * Gets the request builder for Chat
     *
     * @return the IChatWithReferenceRequestBuilder instance
     */
    IChatWithReferenceRequestBuilder chat();

}