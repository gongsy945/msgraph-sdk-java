// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanDetailsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Request.
 */
public class PlannerPlanRequest extends BaseRequest implements IPlannerPlanRequest {
	
    /**
     * The request for the PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerPlan.class);
    }

    /**
     * Gets the PlannerPlan from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerPlan> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerPlan from the service
     *
     * @return the PlannerPlan from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerPlan> callback) {
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
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerPlan sourcePlannerPlan, final ICallback<? super PlannerPlan> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerPlan);
    }

    /**
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @return the updated PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerPlan newPlannerPlan, final ICallback<? super PlannerPlan> callback) {
        send(HttpMethod.POST, callback, newPlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @return the created PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException {
        return send(HttpMethod.POST, newPlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerPlan newPlannerPlan, final ICallback<? super PlannerPlan> callback) {
        send(HttpMethod.PUT, callback, newPlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the object to create/update
     * @return the created PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan put(final PlannerPlan newPlannerPlan) throws ClientException {
        return send(HttpMethod.PUT, newPlannerPlan);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerPlanRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerPlanRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerPlanRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerPlanRequest)this;
     }

}

