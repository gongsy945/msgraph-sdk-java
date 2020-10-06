// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.models.extensions.Session;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Collection Page.
 */
public class SessionCollectionPage extends BaseCollectionPage<Session, SessionCollectionRequestBuilder> {

    /**
     * A collection page for Session
     *
     * @param response the serialized SessionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SessionCollectionPage(final SessionCollectionResponse response, final SessionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
