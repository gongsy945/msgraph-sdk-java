// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SchemaExtension;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schema Extension Collection Page.
 */
public class SchemaExtensionCollectionPage extends BaseCollectionPage<SchemaExtension, ISchemaExtensionCollectionRequestBuilder> implements ISchemaExtensionCollectionPage {

    /**
     * A collection page for SchemaExtension
     *
     * @param response the serialized SchemaExtensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SchemaExtensionCollectionPage(final SchemaExtensionCollectionResponse response, final ISchemaExtensionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
