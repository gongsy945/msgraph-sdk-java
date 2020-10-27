// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.DayOfWeek;
import com.microsoft.graph.models.extensions.TimeZoneBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Working Hours.
 */
public class WorkingHours implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Days Of Week.
     * The days of the week on which the user works.
     */
    @SerializedName(value = "daysOfWeek", alternate = {"DaysOfWeek"})
    @Expose
    public java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The End Time.
     * The time of the day that the user stops working.
     */
    @SerializedName(value = "endTime", alternate = {"EndTime"})
    @Expose
    public com.microsoft.graph.core.TimeOfDay endTime;

    /**
     * The Start Time.
     * The time of the day that the user starts working.
     */
    @SerializedName(value = "startTime", alternate = {"StartTime"})
    @Expose
    public com.microsoft.graph.core.TimeOfDay startTime;

    /**
     * The Time Zone.
     * The time zone to which the working hours apply.
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
    public TimeZoneBase timeZone;


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
	@Override
    public ISerializer getSerializer() {
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
