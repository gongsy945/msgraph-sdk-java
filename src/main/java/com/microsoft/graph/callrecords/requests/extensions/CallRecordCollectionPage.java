// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Collection Page.
 */
public class CallRecordCollectionPage extends BaseCollectionPage<CallRecord, ICallRecordCollectionRequestBuilder> implements ICallRecordCollectionPage {

    /**
     * A collection page for CallRecord
     *
     * @param response the serialized CallRecordCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CallRecordCollectionPage(final CallRecordCollectionResponse response, final ICallRecordCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
