// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Sort Apply Body.
 */
public class WorkbookRangeSortApplyBody {

    /**
     * The fields.
     * 
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
    public java.util.List<WorkbookSortField> fields;

    /**
     * The match Case.
     * 
     */
    @SerializedName(value = "matchCase", alternate = {"MatchCase"})
    @Expose
    public Boolean matchCase;

    /**
     * The has Headers.
     * 
     */
    @SerializedName(value = "hasHeaders", alternate = {"HasHeaders"})
    @Expose
    public Boolean hasHeaders;

    /**
     * The orientation.
     * 
     */
    @SerializedName(value = "orientation", alternate = {"Orientation"})
    @Expose
    public String orientation;

    /**
     * The method.
     * 
     */
    @SerializedName(value = "method", alternate = {"Method"})
    @Expose
    public String method;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
