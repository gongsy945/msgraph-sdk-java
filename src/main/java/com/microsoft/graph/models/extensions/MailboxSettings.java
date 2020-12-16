// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AutomaticRepliesSetting;
import com.microsoft.graph.models.generated.DelegateMeetingMessageDeliveryOptions;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.WorkingHours;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mailbox Settings.
 */
public class MailboxSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Archive Folder.
     * Folder ID of an archive folder for the user.
     */
    @SerializedName(value = "archiveFolder", alternate = {"ArchiveFolder"})
    @Expose
    public String archiveFolder;

    /**
     * The Automatic Replies Setting.
     * Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     */
    @SerializedName(value = "automaticRepliesSetting", alternate = {"AutomaticRepliesSetting"})
    @Expose
    public AutomaticRepliesSetting automaticRepliesSetting;

    /**
     * The Date Format.
     * The date format for the user's mailbox.
     */
    @SerializedName(value = "dateFormat", alternate = {"DateFormat"})
    @Expose
    public String dateFormat;

    /**
     * The Delegate Meeting Message Delivery Options.
     * If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     */
    @SerializedName(value = "delegateMeetingMessageDeliveryOptions", alternate = {"DelegateMeetingMessageDeliveryOptions"})
    @Expose
    public DelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions;

    /**
     * The Language.
     * The locale information for the user, including the preferred language and country/region.
     */
    @SerializedName(value = "language", alternate = {"Language"})
    @Expose
    public LocaleInfo language;

    /**
     * The Time Format.
     * The time format for the user's mailbox.
     */
    @SerializedName(value = "timeFormat", alternate = {"TimeFormat"})
    @Expose
    public String timeFormat;

    /**
     * The Time Zone.
     * The default time zone for the user's mailbox.
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
    public String timeZone;

    /**
     * The Working Hours.
     * The days of the week and hours in a specific time zone that the user works.
     */
    @SerializedName(value = "workingHours", alternate = {"WorkingHours"})
    @Expose
    public WorkingHours workingHours;


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
