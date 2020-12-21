// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNetworkDays_IntlRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Network Days_Intl Request Builder.
 */
public interface IWorkbookFunctionsNetworkDays_IntlRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    IWorkbookFunctionsNetworkDays_IntlRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    IWorkbookFunctionsNetworkDays_IntlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
