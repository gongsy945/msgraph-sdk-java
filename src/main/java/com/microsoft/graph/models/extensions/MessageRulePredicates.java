// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.generated.Importance;
import com.microsoft.graph.models.generated.MessageActionFlag;
import com.microsoft.graph.models.generated.Sensitivity;
import com.microsoft.graph.models.extensions.SizeRange;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Rule Predicates.
 */
public class MessageRulePredicates implements IJsonBackedObject {

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
     * The Body Contains.
     * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "bodyContains", alternate = {"BodyContains"})
    @Expose
    public java.util.List<String> bodyContains;

    /**
     * The Body Or Subject Contains.
     * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "bodyOrSubjectContains", alternate = {"BodyOrSubjectContains"})
    @Expose
    public java.util.List<String> bodyOrSubjectContains;

    /**
     * The Categories.
     * Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply.
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
    public java.util.List<String> categories;

    /**
     * The From Addresses.
     * Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "fromAddresses", alternate = {"FromAddresses"})
    @Expose
    public java.util.List<Recipient> fromAddresses;

    /**
     * The Has Attachments.
     * Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
    public Boolean hasAttachments;

    /**
     * The Header Contains.
     * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "headerContains", alternate = {"HeaderContains"})
    @Expose
    public java.util.List<String> headerContains;

    /**
     * The Importance.
     * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high.
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
    public Importance importance;

    /**
     * The Is Approval Request.
     * Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
     */
    @SerializedName(value = "isApprovalRequest", alternate = {"IsApprovalRequest"})
    @Expose
    public Boolean isApprovalRequest;

    /**
     * The Is Automatic Forward.
     * Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
     */
    @SerializedName(value = "isAutomaticForward", alternate = {"IsAutomaticForward"})
    @Expose
    public Boolean isAutomaticForward;

    /**
     * The Is Automatic Reply.
     * Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
     */
    @SerializedName(value = "isAutomaticReply", alternate = {"IsAutomaticReply"})
    @Expose
    public Boolean isAutomaticReply;

    /**
     * The Is Encrypted.
     * Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
    public Boolean isEncrypted;

    /**
     * The Is Meeting Request.
     * Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
     */
    @SerializedName(value = "isMeetingRequest", alternate = {"IsMeetingRequest"})
    @Expose
    public Boolean isMeetingRequest;

    /**
     * The Is Meeting Response.
     * Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
     */
    @SerializedName(value = "isMeetingResponse", alternate = {"IsMeetingResponse"})
    @Expose
    public Boolean isMeetingResponse;

    /**
     * The Is Non Delivery Report.
     * Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
     */
    @SerializedName(value = "isNonDeliveryReport", alternate = {"IsNonDeliveryReport"})
    @Expose
    public Boolean isNonDeliveryReport;

    /**
     * The Is Permission Controlled.
     * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply.
     */
    @SerializedName(value = "isPermissionControlled", alternate = {"IsPermissionControlled"})
    @Expose
    public Boolean isPermissionControlled;

    /**
     * The Is Read Receipt.
     * Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
     */
    @SerializedName(value = "isReadReceipt", alternate = {"IsReadReceipt"})
    @Expose
    public Boolean isReadReceipt;

    /**
     * The Is Signed.
     * Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
     */
    @SerializedName(value = "isSigned", alternate = {"IsSigned"})
    @Expose
    public Boolean isSigned;

    /**
     * The Is Voicemail.
     * Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
     */
    @SerializedName(value = "isVoicemail", alternate = {"IsVoicemail"})
    @Expose
    public Boolean isVoicemail;

    /**
     * The Message Action Flag.
     * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review.
     */
    @SerializedName(value = "messageActionFlag", alternate = {"MessageActionFlag"})
    @Expose
    public MessageActionFlag messageActionFlag;

    /**
     * The Not Sent To Me.
     * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "notSentToMe", alternate = {"NotSentToMe"})
    @Expose
    public Boolean notSentToMe;

    /**
     * The Recipient Contains.
     * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "recipientContains", alternate = {"RecipientContains"})
    @Expose
    public java.util.List<String> recipientContains;

    /**
     * The Sender Contains.
     * Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "senderContains", alternate = {"SenderContains"})
    @Expose
    public java.util.List<String> senderContains;

    /**
     * The Sensitivity.
     * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential.
     */
    @SerializedName(value = "sensitivity", alternate = {"Sensitivity"})
    @Expose
    public Sensitivity sensitivity;

    /**
     * The Sent Cc Me.
     * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "sentCcMe", alternate = {"SentCcMe"})
    @Expose
    public Boolean sentCcMe;

    /**
     * The Sent Only To Me.
     * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "sentOnlyToMe", alternate = {"SentOnlyToMe"})
    @Expose
    public Boolean sentOnlyToMe;

    /**
     * The Sent To Addresses.
     * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply.
     */
    @SerializedName(value = "sentToAddresses", alternate = {"SentToAddresses"})
    @Expose
    public java.util.List<Recipient> sentToAddresses;

    /**
     * The Sent To Me.
     * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "sentToMe", alternate = {"SentToMe"})
    @Expose
    public Boolean sentToMe;

    /**
     * The Sent To Or Cc Me.
     * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "sentToOrCcMe", alternate = {"SentToOrCcMe"})
    @Expose
    public Boolean sentToOrCcMe;

    /**
     * The Subject Contains.
     * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply.
     */
    @SerializedName(value = "subjectContains", alternate = {"SubjectContains"})
    @Expose
    public java.util.List<String> subjectContains;

    /**
     * The Within Size Range.
     * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply.
     */
    @SerializedName(value = "withinSizeRange", alternate = {"WithinSizeRange"})
    @Expose
    public SizeRange withinSizeRange;


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
