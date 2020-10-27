// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.IosNotificationAlertType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Notification Settings.
 */
public class IosNotificationSettings implements IJsonBackedObject {

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
     * The Alert Type.
     * Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
     */
    @SerializedName(value = "alertType", alternate = {"AlertType"})
    @Expose
    public IosNotificationAlertType alertType;

    /**
     * The App Name.
     * Application name to be associated with the bundleID.
     */
    @SerializedName(value = "appName", alternate = {"AppName"})
    @Expose
    public String appName;

    /**
     * The Badges Enabled.
     * Indicates whether badges are allowed for this app.
     */
    @SerializedName(value = "badgesEnabled", alternate = {"BadgesEnabled"})
    @Expose
    public Boolean badgesEnabled;

    /**
     * The Bundle ID.
     * Bundle id of app to which to apply these notification settings.
     */
    @SerializedName(value = "bundleID", alternate = {"BundleID"})
    @Expose
    public String bundleID;

    /**
     * The Enabled.
     * Indicates whether notifications are allowed for this app.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
    public Boolean enabled;

    /**
     * The Publisher.
     * Publisher to be associated with the bundleID.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
    public String publisher;

    /**
     * The Show In Notification Center.
     * Indicates whether notifications can be shown in notification center.
     */
    @SerializedName(value = "showInNotificationCenter", alternate = {"ShowInNotificationCenter"})
    @Expose
    public Boolean showInNotificationCenter;

    /**
     * The Show On Lock Screen.
     * Indicates whether notifications can be shown on the lock screen.
     */
    @SerializedName(value = "showOnLockScreen", alternate = {"ShowOnLockScreen"})
    @Expose
    public Boolean showOnLockScreen;

    /**
     * The Sounds Enabled.
     * Indicates whether sounds are allowed for this app.
     */
    @SerializedName(value = "soundsEnabled", alternate = {"SoundsEnabled"})
    @Expose
    public Boolean soundsEnabled;


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
