// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppDataStorageLocation;
import com.microsoft.graph.models.generated.ManagedAppDataTransferLevel;
import com.microsoft.graph.models.generated.ManagedAppClipboardSharingLevel;
import com.microsoft.graph.models.generated.ManagedBrowserType;
import com.microsoft.graph.models.generated.ManagedAppPinCharacterSet;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection.
 */
public class ManagedAppProtection extends ManagedAppPolicy implements IJsonBackedObject {


    /**
     * The Allowed Data Storage Locations.
     * Data storage locations where a user may store managed data.
     */
    @SerializedName(value = "allowedDataStorageLocations", alternate = {"AllowedDataStorageLocations"})
    @Expose
    public java.util.List<ManagedAppDataStorageLocation> allowedDataStorageLocations;

    /**
     * The Allowed Inbound Data Transfer Sources.
     * Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName(value = "allowedInboundDataTransferSources", alternate = {"AllowedInboundDataTransferSources"})
    @Expose
    public ManagedAppDataTransferLevel allowedInboundDataTransferSources;

    /**
     * The Allowed Outbound Clipboard Sharing Level.
     * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps, managedAppsWithPasteIn, managedApps, blocked.
     */
    @SerializedName(value = "allowedOutboundClipboardSharingLevel", alternate = {"AllowedOutboundClipboardSharingLevel"})
    @Expose
    public ManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;

    /**
     * The Allowed Outbound Data Transfer Destinations.
     * Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName(value = "allowedOutboundDataTransferDestinations", alternate = {"AllowedOutboundDataTransferDestinations"})
    @Expose
    public ManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;

    /**
     * The Contact Sync Blocked.
     * Indicates whether contacts can be synced to the user's device.
     */
    @SerializedName(value = "contactSyncBlocked", alternate = {"ContactSyncBlocked"})
    @Expose
    public Boolean contactSyncBlocked;

    /**
     * The Data Backup Blocked.
     * Indicates whether the backup of a managed app's data is blocked.
     */
    @SerializedName(value = "dataBackupBlocked", alternate = {"DataBackupBlocked"})
    @Expose
    public Boolean dataBackupBlocked;

    /**
     * The Device Compliance Required.
     * Indicates whether device compliance is required.
     */
    @SerializedName(value = "deviceComplianceRequired", alternate = {"DeviceComplianceRequired"})
    @Expose
    public Boolean deviceComplianceRequired;

    /**
     * The Disable App Pin If Device Pin Is Set.
     * Indicates whether use of the app pin is required if the device pin is set.
     */
    @SerializedName(value = "disableAppPinIfDevicePinIsSet", alternate = {"DisableAppPinIfDevicePinIsSet"})
    @Expose
    public Boolean disableAppPinIfDevicePinIsSet;

    /**
     * The Fingerprint Blocked.
     * Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName(value = "fingerprintBlocked", alternate = {"FingerprintBlocked"})
    @Expose
    public Boolean fingerprintBlocked;

    /**
     * The Managed Browser.
     * Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Possible values are: notConfigured, microsoftEdge.
     */
    @SerializedName(value = "managedBrowser", alternate = {"ManagedBrowser"})
    @Expose
    public EnumSet<ManagedBrowserType> managedBrowser;

    /**
     * The Managed Browser To Open Links Required.
     * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     */
    @SerializedName(value = "managedBrowserToOpenLinksRequired", alternate = {"ManagedBrowserToOpenLinksRequired"})
    @Expose
    public Boolean managedBrowserToOpenLinksRequired;

    /**
     * The Maximum Pin Retries.
     * Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     */
    @SerializedName(value = "maximumPinRetries", alternate = {"MaximumPinRetries"})
    @Expose
    public Integer maximumPinRetries;

    /**
     * The Minimum Pin Length.
     * Minimum pin length required for an app-level pin if PinRequired is set to True
     */
    @SerializedName(value = "minimumPinLength", alternate = {"MinimumPinLength"})
    @Expose
    public Integer minimumPinLength;

    /**
     * The Minimum Required App Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumRequiredAppVersion", alternate = {"MinimumRequiredAppVersion"})
    @Expose
    public String minimumRequiredAppVersion;

    /**
     * The Minimum Required Os Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumRequiredOsVersion", alternate = {"MinimumRequiredOsVersion"})
    @Expose
    public String minimumRequiredOsVersion;

    /**
     * The Minimum Warning App Version.
     * Versions less than the specified version will result in warning message on the managed app.
     */
    @SerializedName(value = "minimumWarningAppVersion", alternate = {"MinimumWarningAppVersion"})
    @Expose
    public String minimumWarningAppVersion;

    /**
     * The Minimum Warning Os Version.
     * Versions less than the specified version will result in warning message on the managed app from accessing company data.
     */
    @SerializedName(value = "minimumWarningOsVersion", alternate = {"MinimumWarningOsVersion"})
    @Expose
    public String minimumWarningOsVersion;

    /**
     * The Organizational Credentials Required.
     * Indicates whether organizational credentials are required for app use.
     */
    @SerializedName(value = "organizationalCredentialsRequired", alternate = {"OrganizationalCredentialsRequired"})
    @Expose
    public Boolean organizationalCredentialsRequired;

    /**
     * The Period Before Pin Reset.
     * TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     */
    @SerializedName(value = "periodBeforePinReset", alternate = {"PeriodBeforePinReset"})
    @Expose
    public javax.xml.datatype.Duration periodBeforePinReset;

    /**
     * The Period Offline Before Access Check.
     * The period after which access is checked when the device is not connected to the internet.
     */
    @SerializedName(value = "periodOfflineBeforeAccessCheck", alternate = {"PeriodOfflineBeforeAccessCheck"})
    @Expose
    public javax.xml.datatype.Duration periodOfflineBeforeAccessCheck;

    /**
     * The Period Offline Before Wipe Is Enforced.
     * The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     */
    @SerializedName(value = "periodOfflineBeforeWipeIsEnforced", alternate = {"PeriodOfflineBeforeWipeIsEnforced"})
    @Expose
    public javax.xml.datatype.Duration periodOfflineBeforeWipeIsEnforced;

    /**
     * The Period Online Before Access Check.
     * The period after which access is checked when the device is connected to the internet.
     */
    @SerializedName(value = "periodOnlineBeforeAccessCheck", alternate = {"PeriodOnlineBeforeAccessCheck"})
    @Expose
    public javax.xml.datatype.Duration periodOnlineBeforeAccessCheck;

    /**
     * The Pin Character Set.
     * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric, alphanumericAndSymbol.
     */
    @SerializedName(value = "pinCharacterSet", alternate = {"PinCharacterSet"})
    @Expose
    public ManagedAppPinCharacterSet pinCharacterSet;

    /**
     * The Pin Required.
     * Indicates whether an app-level pin is required.
     */
    @SerializedName(value = "pinRequired", alternate = {"PinRequired"})
    @Expose
    public Boolean pinRequired;

    /**
     * The Print Blocked.
     * Indicates whether printing is allowed from managed apps.
     */
    @SerializedName(value = "printBlocked", alternate = {"PrintBlocked"})
    @Expose
    public Boolean printBlocked;

    /**
     * The Save As Blocked.
     * Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     */
    @SerializedName(value = "saveAsBlocked", alternate = {"SaveAsBlocked"})
    @Expose
    public Boolean saveAsBlocked;

    /**
     * The Simple Pin Blocked.
     * Indicates whether simplePin is blocked.
     */
    @SerializedName(value = "simplePinBlocked", alternate = {"SimplePinBlocked"})
    @Expose
    public Boolean simplePinBlocked;


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
