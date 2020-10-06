// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Single Value Legacy Extended Property Collection Page.
 */
public class SingleValueLegacyExtendedPropertyCollectionPage extends BaseCollectionPage<SingleValueLegacyExtendedProperty, SingleValueLegacyExtendedPropertyCollectionRequestBuilder> {

    /**
     * A collection page for SingleValueLegacyExtendedProperty
     *
     * @param response the serialized SingleValueLegacyExtendedPropertyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SingleValueLegacyExtendedPropertyCollectionPage(final SingleValueLegacyExtendedPropertyCollectionResponse response, final SingleValueLegacyExtendedPropertyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
