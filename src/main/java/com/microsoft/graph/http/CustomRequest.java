// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

public class CustomRequest<T> extends BaseRequest<T> {
	
	public CustomRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Class<T> responseClass) {
		super(requestUrl, client, requestOptions, responseClass);
    }
	
	public static CustomRequest<JsonObject> create(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        return new CustomRequest<JsonObject>(requestUrl, client, requestOptions, JsonObject.class);
    }

    public T get() throws ClientException {
        return send(HttpMethod.GET, null);
    }
    
    public void get(final ICallback<T> callback) {
    	send(HttpMethod.GET, callback, null);
    }
    
    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    @SuppressWarnings("unchecked")
    public void delete(final ICallback<Void> callback) {
        // the callback should called with the null object
        send(HttpMethod.DELETE, (ICallback<T>) callback, null);
    }

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this item with a source
     * @param sourceItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Class<T> sourceObject, final ICallback<T> callback) {
        send(HttpMethod.PATCH, callback, sourceObject);
    }

    /**
     * Patches this Attachment with a source
     * @param sourceAttachment The source object with updates
     * @return The updated Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public T patch(final Class<T> sourceObject) throws ClientException {
        return send(HttpMethod.PATCH, sourceObject);
    }

    /**
     * Creates a Attachment with a new object
     * @param newAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Class<T> newObject, final ICallback<T> callback) {
        send(HttpMethod.POST, callback, newObject);
    }

    /**
     * Creates a Attachment with a new object
     * @param newAttachment The new object to create
     * @return The created Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public T post(final Class<T> newObject) throws ClientException {
        return send(HttpMethod.POST, newObject);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public CustomRequest<T> select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public CustomRequest<T> expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return this;
     }
}
