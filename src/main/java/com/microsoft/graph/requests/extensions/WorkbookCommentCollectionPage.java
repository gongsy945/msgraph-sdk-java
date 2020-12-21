// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookComment;
import com.microsoft.graph.requests.extensions.IWorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookCommentCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookCommentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Collection Page.
 */
public class WorkbookCommentCollectionPage extends BaseCollectionPage<WorkbookComment, IWorkbookCommentCollectionRequestBuilder> implements IWorkbookCommentCollectionPage {

    /**
     * A collection page for WorkbookComment
     *
     * @param response the serialized WorkbookCommentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookCommentCollectionPage(final WorkbookCommentCollectionResponse response, final IWorkbookCommentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
