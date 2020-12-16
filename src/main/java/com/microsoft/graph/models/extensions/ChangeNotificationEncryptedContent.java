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
 * The class for the Change Notification Encrypted Content.
 */
public class ChangeNotificationEncryptedContent implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Data.
     * Base64-encoded encrypted data that produces a full resource respresented as JSON. The data has been encrypted with the provided dataKey using an AES/CBC/PKCS5PADDING cipher suite.
     */
    @SerializedName(value = "data", alternate = {"Data"})
    @Expose
    public String data;

    /**
     * The Data Key.
     * Base64-encoded symmetric key generated by Microsoft Graph to encrypt the data value and to generate the data signature. This key is encrypted with the certificate public key that was provided during the subscription. It must be decrypted with the certificate private key before it can be used to decrypt the data or verify the signature. This key has been encrypted with the following cipher suite: RSA/ECB/OAEPWithSHA1AndMGF1Padding.
     */
    @SerializedName(value = "dataKey", alternate = {"DataKey"})
    @Expose
    public String dataKey;

    /**
     * The Data Signature.
     * Base64-encoded HMAC-SHA256 hash of the data for validation purposes.
     */
    @SerializedName(value = "dataSignature", alternate = {"DataSignature"})
    @Expose
    public String dataSignature;

    /**
     * The Encryption Certificate Id.
     * ID of the certificate used to encrypt the dataKey.
     */
    @SerializedName(value = "encryptionCertificateId", alternate = {"EncryptionCertificateId"})
    @Expose
    public String encryptionCertificateId;

    /**
     * The Encryption Certificate Thumbprint.
     * Hexadecimal representation of the thumbprint of the certificate used to encrypt the dataKey.
     */
    @SerializedName(value = "encryptionCertificateThumbprint", alternate = {"EncryptionCertificateThumbprint"})
    @Expose
    public String encryptionCertificateThumbprint;


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
