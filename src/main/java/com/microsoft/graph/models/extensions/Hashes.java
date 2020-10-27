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
 * The class for the Hashes.
 */
public class Hashes implements IJsonBackedObject {

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
     * The Crc32Hash.
     * The CRC32 value of the file in little endian (if available). Read-only.
     */
    @SerializedName(value = "crc32Hash", alternate = {"Crc32Hash"})
    @Expose
    public String crc32Hash;

    /**
     * The Quick Xor Hash.
     * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available). Read-only.
     */
    @SerializedName(value = "quickXorHash", alternate = {"QuickXorHash"})
    @Expose
    public String quickXorHash;

    /**
     * The Sha1Hash.
     * SHA1 hash for the contents of the file (if available). Read-only.
     */
    @SerializedName(value = "sha1Hash", alternate = {"Sha1Hash"})
    @Expose
    public String sha1Hash;

    /**
     * The Sha256Hash.
     * SHA256 hash for the contents of the file (if available). Read-only.
     */
    @SerializedName(value = "sha256Hash", alternate = {"Sha256Hash"})
    @Expose
    public String sha256Hash;


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
