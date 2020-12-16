// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EducationGender;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Student.
 */
public class EducationStudent implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Birth Date.
     * Birth date of the student.
     */
    @SerializedName(value = "birthDate", alternate = {"BirthDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly birthDate;

    /**
     * The External Id.
     * ID of the student in the source system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
    public String externalId;

    /**
     * The Gender.
     * The possible values are: female, male, other, unknownFutureValue.
     */
    @SerializedName(value = "gender", alternate = {"Gender"})
    @Expose
    public EducationGender gender;

    /**
     * The Grade.
     * Current grade level of the student.
     */
    @SerializedName(value = "grade", alternate = {"Grade"})
    @Expose
    public String grade;

    /**
     * The Graduation Year.
     * Year the student is graduating from the school.
     */
    @SerializedName(value = "graduationYear", alternate = {"GraduationYear"})
    @Expose
    public String graduationYear;

    /**
     * The Student Number.
     * Student Number.
     */
    @SerializedName(value = "studentNumber", alternate = {"StudentNumber"})
    @Expose
    public String studentNumber;


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
