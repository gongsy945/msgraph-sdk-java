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
 * The class for the Default User Role Permissions.
 */
public class DefaultUserRolePermissions implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allowed To Create Apps.
     * Indicates whether the default user role can create applications.
     */
    @SerializedName(value = "allowedToCreateApps", alternate = {"AllowedToCreateApps"})
    @Expose
    public Boolean allowedToCreateApps;

    /**
     * The Allowed To Create Security Groups.
     * Indicates whether the default user role can create security groups.
     */
    @SerializedName(value = "allowedToCreateSecurityGroups", alternate = {"AllowedToCreateSecurityGroups"})
    @Expose
    public Boolean allowedToCreateSecurityGroups;

    /**
     * The Allowed To Read Other Users.
     * Indicates whether the default user role can read other users.
     */
    @SerializedName(value = "allowedToReadOtherUsers", alternate = {"AllowedToReadOtherUsers"})
    @Expose
    public Boolean allowedToReadOtherUsers;

    /**
     * The Permission Grant Policies Assigned.
     * Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     */
    @SerializedName(value = "permissionGrantPoliciesAssigned", alternate = {"PermissionGrantPoliciesAssigned"})
    @Expose
    public java.util.List<String> permissionGrantPoliciesAssigned;


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
