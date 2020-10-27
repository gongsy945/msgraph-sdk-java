// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.GroupType;
import com.microsoft.graph.models.extensions.ModifiedProperty;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Target Resource.
 */
public class TargetResource implements IJsonBackedObject {

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
     * The Display Name.
     * Indicates the visible name defined for the resource. Typically specified when the resource is created.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Group Type.
     * When type is set to Group, this indicates the group type.
     */
    @SerializedName(value = "groupType", alternate = {"GroupType"})
    @Expose
    public GroupType groupType;

    /**
     * The Id.
     * Indicates the unique ID of the resource.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Modified Properties.
     * Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
     */
    @SerializedName(value = "modifiedProperties", alternate = {"ModifiedProperties"})
    @Expose
    public java.util.List<ModifiedProperty> modifiedProperties;

    /**
     * The Type.
     * Describes the resource type.  Example values include Application, Group, ServicePrincipal, and User.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public String type;

    /**
     * The User Principal Name.
     * When type is set to User, this includes the user name that initiated the action; null for other types.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;


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
