
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Classification {

    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("segment")
    @Expose
    private Segment segment;
    @SerializedName("genre")
    @Expose
    private Genre genre;
    @SerializedName("subGenre")
    @Expose
    private SubGenre subGenre;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("subType")
    @Expose
    private SubType subType;
    @SerializedName("family")
    @Expose
    private Boolean family;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Classification() {
    }

    /**
     * 
     * @param subGenre
     * @param segment
     * @param genre
     * @param subType
     * @param type
     * @param family
     * @param primary
     */
    public Classification(Boolean primary, Segment segment, Genre genre, SubGenre subGenre, Type type, SubType subType, Boolean family) {
        super();
        this.primary = primary;
        this.segment = segment;
        this.genre = genre;
        this.subGenre = subGenre;
        this.type = type;
        this.subType = subType;
        this.family = family;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public SubGenre getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(SubGenre subGenre) {
        this.subGenre = subGenre;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SubType getSubType() {
        return subType;
    }

    public void setSubType(SubType subType) {
        this.subType = subType;
    }

    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

}
