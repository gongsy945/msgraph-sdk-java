// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Amor Degrc Body.
 */
public class WorkbookFunctionsAmorDegrcBody {

    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
    public com.google.gson.JsonElement cost;

    /**
     * The date Purchased.
     * 
     */
    @SerializedName(value = "datePurchased", alternate = {"DatePurchased"})
    @Expose
    public com.google.gson.JsonElement datePurchased;

    /**
     * The first Period.
     * 
     */
    @SerializedName(value = "firstPeriod", alternate = {"FirstPeriod"})
    @Expose
    public com.google.gson.JsonElement firstPeriod;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
    public com.google.gson.JsonElement salvage;

    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
    public com.google.gson.JsonElement period;

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
    public com.google.gson.JsonElement rate;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
    public com.google.gson.JsonElement basis;


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
