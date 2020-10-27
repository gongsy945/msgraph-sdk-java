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
 * The class for the Win32Lob App Restart Settings.
 */
public class Win32LobAppRestartSettings implements IJsonBackedObject {

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
     * The Countdown Display Before Restart In Minutes.
     * The number of minutes before the restart time to display the countdown dialog for pending restarts.
     */
    @SerializedName(value = "countdownDisplayBeforeRestartInMinutes", alternate = {"CountdownDisplayBeforeRestartInMinutes"})
    @Expose
    public Integer countdownDisplayBeforeRestartInMinutes;

    /**
     * The Grace Period In Minutes.
     * The number of minutes to wait before restarting the device after an app installation.
     */
    @SerializedName(value = "gracePeriodInMinutes", alternate = {"GracePeriodInMinutes"})
    @Expose
    public Integer gracePeriodInMinutes;

    /**
     * The Restart Notification Snooze Duration In Minutes.
     * The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     */
    @SerializedName(value = "restartNotificationSnoozeDurationInMinutes", alternate = {"RestartNotificationSnoozeDurationInMinutes"})
    @Expose
    public Integer restartNotificationSnoozeDurationInMinutes;


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
