// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.generated.CalendarRoleType;
import com.microsoft.graph.requests.extensions.ICalendarPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Request.
 */
public class CalendarRequest extends BaseRequest implements ICalendarRequest {
	
    /**
     * The request for the Calendar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Calendar.class);
    }

    /**
     * Gets the Calendar from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Calendar> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Calendar from the service
     *
     * @return the Calendar from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Calendar get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Calendar> callback) {
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
     * Patches this Calendar with a source
     *
     * @param sourceCalendar the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Calendar sourceCalendar, final ICallback<? super Calendar> callback) {
        send(HttpMethod.PATCH, callback, sourceCalendar);
    }

    /**
     * Patches this Calendar with a source
     *
     * @param sourceCalendar the source object with updates
     * @return the updated Calendar
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Calendar patch(final Calendar sourceCalendar) throws ClientException {
        return send(HttpMethod.PATCH, sourceCalendar);
    }

    /**
     * Creates a Calendar with a new object
     *
     * @param newCalendar the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Calendar newCalendar, final ICallback<? super Calendar> callback) {
        send(HttpMethod.POST, callback, newCalendar);
    }

    /**
     * Creates a Calendar with a new object
     *
     * @param newCalendar the new object to create
     * @return the created Calendar
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Calendar post(final Calendar newCalendar) throws ClientException {
        return send(HttpMethod.POST, newCalendar);
    }

    /**
     * Creates a Calendar with a new object
     *
     * @param newCalendar the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Calendar newCalendar, final ICallback<? super Calendar> callback) {
        send(HttpMethod.PUT, callback, newCalendar);
    }

    /**
     * Creates a Calendar with a new object
     *
     * @param newCalendar the object to create/update
     * @return the created Calendar
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Calendar put(final Calendar newCalendar) throws ClientException {
        return send(HttpMethod.PUT, newCalendar);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICalendarRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CalendarRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICalendarRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CalendarRequest)this;
     }

}

