// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.EducationExternalSource;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.generated.EducationUserRole;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.EducationStudent;
import com.microsoft.graph.models.extensions.EducationTeacher;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User.
 */
public class EducationUser extends Entity implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
    public Boolean accountEnabled;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the user. Not nullable.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * The plans that are assigned to the user. Read-only. Not nullable.
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The Created By.
     * Entity who created the user.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Department.
     * The name for the department in which the user works. Supports $filter.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The External Source.
     * Where this user was created from. The possible values are: sis, manual.
     */
    @SerializedName(value = "externalSource", alternate = {"ExternalSource"})
    @Expose
    public EducationExternalSource externalSource;

    /**
     * The Given Name.
     * The given name (first name) of the user. Supports $filter.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
    public String givenName;

    /**
     * The Mail.
     * The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
    public String mail;

    /**
     * The Mailing Address.
     * Mail address of user.
     */
    @SerializedName(value = "mailingAddress", alternate = {"MailingAddress"})
    @Expose
    public PhysicalAddress mailingAddress;

    /**
     * The Mail Nickname.
     * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
    public String mailNickname;

    /**
     * The Middle Name.
     * The middle name of user.
     */
    @SerializedName(value = "middleName", alternate = {"MiddleName"})
    @Expose
    public String middleName;

    /**
     * The Mobile Phone.
     * The primary cellular telephone number for the user.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
    public String mobilePhone;

    /**
     * The Office Location.
     * 
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
    public String officeLocation;

    /**
     * The Password Policies.
     * Specifies password policies for the user. This value is an enumeration with one possible value being 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified. 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example: 'DisablePasswordExpiration, DisableStrongPassword'.
     */
    @SerializedName(value = "passwordPolicies", alternate = {"PasswordPolicies"})
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
     * Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName(value = "passwordProfile", alternate = {"PasswordProfile"})
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Preferred Language.
     * The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
    public String preferredLanguage;

    /**
     * The Primary Role.
     * Default role for a user. The user's role might be different in an individual class. The possible values are: student, teacher. Supports $filter.
     */
    @SerializedName(value = "primaryRole", alternate = {"PrimaryRole"})
    @Expose
    public EducationUserRole primaryRole;

    /**
     * The Provisioned Plans.
     * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Refresh Tokens Valid From Date Time.
     * 
     */
    @SerializedName(value = "refreshTokensValidFromDateTime", alternate = {"RefreshTokensValidFromDateTime"})
    @Expose
    public java.util.Calendar refreshTokensValidFromDateTime;

    /**
     * The Residence Address.
     * Address where user lives.
     */
    @SerializedName(value = "residenceAddress", alternate = {"ResidenceAddress"})
    @Expose
    public PhysicalAddress residenceAddress;

    /**
     * The Show In Address List.
     * 
     */
    @SerializedName(value = "showInAddressList", alternate = {"ShowInAddressList"})
    @Expose
    public Boolean showInAddressList;

    /**
     * The Student.
     * If the primary role is student, this block will contain student specific data.
     */
    @SerializedName(value = "student", alternate = {"Student"})
    @Expose
    public EducationStudent student;

    /**
     * The Surname.
     * The user's surname (family name or last name). Supports $filter.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
    public String surname;

    /**
     * The Teacher.
     * If the primary role is teacher, this block will contain teacher specific data.
     */
    @SerializedName(value = "teacher", alternate = {"Teacher"})
    @Expose
    public EducationTeacher teacher;

    /**
     * The Usage Location.
     * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not nullable. Supports $filter.
     */
    @SerializedName(value = "usageLocation", alternate = {"UsageLocation"})
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization. Supports $filter and $orderby.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
     * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports $filter.
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
    public String userType;

    /**
     * The Classes.
     * Classes to which the user belongs. Nullable.
     */
    public EducationClassCollectionPage classes;

    /**
     * The Schools.
     * Schools to which the user belongs. Nullable.
     */
    public EducationSchoolCollectionPage schools;

    /**
     * The User.
     * The directory user corresponding to this user.
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
    public User user;


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


        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes").toString(), EducationClassCollectionPage.class);
        }

        if (json.has("schools")) {
            schools = serializer.deserializeObject(json.get("schools").toString(), EducationSchoolCollectionPage.class);
        }
    }
}
