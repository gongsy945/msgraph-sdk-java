// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Shift;
import com.microsoft.graph.requests.extensions.ShiftCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ShiftCollectionPage;
import com.microsoft.graph.requests.extensions.ShiftCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift Collection Page.
 */
public class ShiftCollectionPage extends BaseCollectionPage<Shift, ShiftCollectionRequestBuilder> {

    /**
     * A collection page for Shift
     *
     * @param response the serialized ShiftCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ShiftCollectionPage(final ShiftCollectionResponse response, final ShiftCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
