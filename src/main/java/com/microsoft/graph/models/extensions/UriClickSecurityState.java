// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Uri Click Security State.
 */
public class UriClickSecurityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Click Action.
     * 
     */
    @SerializedName(value = "clickAction", alternate = {"ClickAction"})
    @Expose
    public String clickAction;

    /**
     * The Click Date Time.
     * 
     */
    @SerializedName(value = "clickDateTime", alternate = {"ClickDateTime"})
    @Expose
    public java.util.Calendar clickDateTime;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Source Id.
     * 
     */
    @SerializedName(value = "sourceId", alternate = {"SourceId"})
    @Expose
    public String sourceId;

    /**
     * The Uri Domain.
     * 
     */
    @SerializedName(value = "uriDomain", alternate = {"UriDomain"})
    @Expose
    public String uriDomain;

    /**
     * The Verdict.
     * 
     */
    @SerializedName(value = "verdict", alternate = {"Verdict"})
    @Expose
    public String verdict;


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
