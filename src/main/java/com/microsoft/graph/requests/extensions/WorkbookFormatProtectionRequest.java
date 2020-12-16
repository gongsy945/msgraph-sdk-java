// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookFormatProtection;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Format Protection Request.
 */
public class WorkbookFormatProtectionRequest extends BaseRequest implements IWorkbookFormatProtectionRequest {
	
    /**
     * The request for the WorkbookFormatProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFormatProtectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFormatProtection.class);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookFormatProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     *
     * @return the WorkbookFormatProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFormatProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookFormatProtection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookFormatProtection with a source
     *
     * @param sourceWorkbookFormatProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookFormatProtection sourceWorkbookFormatProtection, final ICallback<? super WorkbookFormatProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFormatProtection);
    }

    /**
     * Patches this WorkbookFormatProtection with a source
     *
     * @param sourceWorkbookFormatProtection the source object with updates
     * @return the updated WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFormatProtection patch(final WorkbookFormatProtection sourceWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookFormatProtection newWorkbookFormatProtection, final ICallback<? super WorkbookFormatProtection> callback) {
        send(HttpMethod.POST, callback, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the new object to create
     * @return the created WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFormatProtection post(final WorkbookFormatProtection newWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookFormatProtection newWorkbookFormatProtection, final ICallback<? super WorkbookFormatProtection> callback) {
        send(HttpMethod.PUT, callback, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the object to create/update
     * @return the created WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFormatProtection put(final WorkbookFormatProtection newWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookFormatProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookFormatProtectionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookFormatProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookFormatProtectionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookFormatProtectionRequest)this;
     }

}

