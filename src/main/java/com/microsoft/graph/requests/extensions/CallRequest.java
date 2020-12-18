// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceQuality;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Request.
 */
public class CallRequest extends BaseRequest implements ICallRequest {
	
    /**
     * The request for the Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Call.class);
    }

    /**
     * Gets the Call from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Call> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Call from the service
     *
     * @return the Call from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Call get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Call> callback) {
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
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Call sourceCall, final ICallback<? super Call> callback) {
        send(HttpMethod.PATCH, callback, sourceCall);
    }

    /**
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @return the updated Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Call patch(final Call sourceCall) throws ClientException {
        return send(HttpMethod.PATCH, sourceCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Call newCall, final ICallback<? super Call> callback) {
        send(HttpMethod.POST, callback, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the new object to create
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Call post(final Call newCall) throws ClientException {
        return send(HttpMethod.POST, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Call newCall, final ICallback<? super Call> callback) {
        send(HttpMethod.PUT, callback, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the object to create/update
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Call put(final Call newCall) throws ClientException {
        return send(HttpMethod.PUT, newCall);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICallRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CallRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICallRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CallRequest)this;
     }

}

