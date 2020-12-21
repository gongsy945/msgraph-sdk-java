// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBoundingRectRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Bounding Rect Request Builder.
 */
public interface IWorkbookRangeBoundingRectRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeBoundingRectRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeBoundingRectRequest instance
     */
    IWorkbookRangeBoundingRectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookRangeBoundingRectRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeBoundingRectRequest instance
     */
    IWorkbookRangeBoundingRectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    IWorkbookRangeFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    IWorkbookRangeSortRequestBuilder sort();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
}
