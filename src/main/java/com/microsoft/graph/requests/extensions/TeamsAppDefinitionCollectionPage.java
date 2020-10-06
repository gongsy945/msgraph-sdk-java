// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Collection Page.
 */
public class TeamsAppDefinitionCollectionPage extends BaseCollectionPage<TeamsAppDefinition, TeamsAppDefinitionCollectionRequestBuilder> {

    /**
     * A collection page for TeamsAppDefinition
     *
     * @param response the serialized TeamsAppDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsAppDefinitionCollectionPage(final TeamsAppDefinitionCollectionResponse response, final TeamsAppDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
