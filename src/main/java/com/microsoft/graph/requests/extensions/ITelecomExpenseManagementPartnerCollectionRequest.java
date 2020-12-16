// Template Source: IBaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Telecom Expense Management Partner Collection Request.
 */
public interface ITelecomExpenseManagementPartnerCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super ITelecomExpenseManagementPartnerCollectionPage> callback);

    ITelecomExpenseManagementPartnerCollectionPage get() throws ClientException;

    void post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner, final ICallback<? super TelecomExpenseManagementPartner> callback);

    TelecomExpenseManagementPartner post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    ITelecomExpenseManagementPartnerCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	ITelecomExpenseManagementPartnerCollectionRequest skipToken(final String skipToken);
}
