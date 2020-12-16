// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventDismissReminderRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Dismiss Reminder Request Builder.
 */
public interface IEventDismissReminderRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEventDismissReminderRequest
     *
     * @param requestOptions the options for the request
     * @return the IEventDismissReminderRequest instance
     */
    IEventDismissReminderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IEventDismissReminderRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEventDismissReminderRequest instance
     */
    IEventDismissReminderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
