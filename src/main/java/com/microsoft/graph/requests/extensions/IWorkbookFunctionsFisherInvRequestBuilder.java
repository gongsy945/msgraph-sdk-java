// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFisherInvRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Fisher Inv Request Builder.
 */
public interface IWorkbookFunctionsFisherInvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    IWorkbookFunctionsFisherInvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    IWorkbookFunctionsFisherInvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
