// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education School Reference Request.
 */
public interface IEducationSchoolReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super EducationSchool> callback);

    EducationSchool delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationSchoolReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationSchoolReferenceRequest expand(final String value);

    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(EducationSchool srcEducationSchool, final ICallback<? super EducationSchool> callback);

    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool to PUT
     * @return the EducationSchool
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    EducationSchool put(EducationSchool srcEducationSchool) throws ClientException;
}
