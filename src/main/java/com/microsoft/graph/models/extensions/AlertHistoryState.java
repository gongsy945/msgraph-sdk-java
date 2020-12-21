// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AlertFeedback;
import com.microsoft.graph.models.generated.AlertStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert History State.
 */
public class AlertHistoryState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The App Id.
     * 
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
    public String appId;

    /**
     * The Assigned To.
     * 
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
    public String assignedTo;

    /**
     * The Comments.
     * 
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
    public java.util.List<String> comments;

    /**
     * The Feedback.
     * 
     */
    @SerializedName(value = "feedback", alternate = {"Feedback"})
    @Expose
    public AlertFeedback feedback;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public AlertStatus status;

    /**
     * The Updated Date Time.
     * 
     */
    @SerializedName(value = "updatedDateTime", alternate = {"UpdatedDateTime"})
    @Expose
    public java.util.Calendar updatedDateTime;

    /**
     * The User.
     * 
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
    public String user;


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
