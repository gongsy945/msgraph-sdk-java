// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IosDeviceType;
import com.microsoft.graph.models.extensions.IosMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App.
 */
public class IosStoreApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Applicable Device Type.
     * The iOS architecture for which this app can run on.
     */
    @SerializedName(value = "applicableDeviceType", alternate = {"ApplicableDeviceType"})
    @Expose
    public IosDeviceType applicableDeviceType;

    /**
     * The App Store Url.
     * The Apple App Store URL
     */
    @SerializedName(value = "appStoreUrl", alternate = {"AppStoreUrl"})
    @Expose
    public String appStoreUrl;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName(value = "bundleId", alternate = {"BundleId"})
    @Expose
    public String bundleId;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
    public IosMinimumOperatingSystem minimumSupportedOperatingSystem;


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
