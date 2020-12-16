// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Collection Page.
 */
public class WorkbookRangeBorderCollectionPage extends BaseCollectionPage<WorkbookRangeBorder, IWorkbookRangeBorderCollectionRequestBuilder> implements IWorkbookRangeBorderCollectionPage {

    /**
     * A collection page for WorkbookRangeBorder
     *
     * @param response the serialized WorkbookRangeBorderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookRangeBorderCollectionPage(final WorkbookRangeBorderCollectionResponse response, final IWorkbookRangeBorderCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
