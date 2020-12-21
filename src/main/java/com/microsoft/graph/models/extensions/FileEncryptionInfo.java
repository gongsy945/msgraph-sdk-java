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
 * The class for the File Encryption Info.
 */
public class FileEncryptionInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Encryption Key.
     * The key used to encrypt the file content.
     */
    @SerializedName(value = "encryptionKey", alternate = {"EncryptionKey"})
    @Expose
    public byte[] encryptionKey;

    /**
     * The File Digest.
     * The file digest prior to encryption.
     */
    @SerializedName(value = "fileDigest", alternate = {"FileDigest"})
    @Expose
    public byte[] fileDigest;

    /**
     * The File Digest Algorithm.
     * The file digest algorithm.
     */
    @SerializedName(value = "fileDigestAlgorithm", alternate = {"FileDigestAlgorithm"})
    @Expose
    public String fileDigestAlgorithm;

    /**
     * The Initialization Vector.
     * The initialization vector used for the encryption algorithm.
     */
    @SerializedName(value = "initializationVector", alternate = {"InitializationVector"})
    @Expose
    public byte[] initializationVector;

    /**
     * The Mac.
     * The hash of the encrypted file content + IV (content hash).
     */
    @SerializedName(value = "mac", alternate = {"Mac"})
    @Expose
    public byte[] mac;

    /**
     * The Mac Key.
     * The key used to get mac.
     */
    @SerializedName(value = "macKey", alternate = {"MacKey"})
    @Expose
    public byte[] macKey;

    /**
     * The Profile Identifier.
     * The profile identifier.
     */
    @SerializedName(value = "profileIdentifier", alternate = {"ProfileIdentifier"})
    @Expose
    public String profileIdentifier;


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
