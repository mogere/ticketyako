
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Classification_ {

    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("segment")
    @Expose
    private Segment_ segment;
    @SerializedName("genre")
    @Expose
    private Genre_ genre;
    @SerializedName("subGenre")
    @Expose
    private SubGenre_ subGenre;
    @SerializedName("type")
    @Expose
    private Type_ type;
    @SerializedName("subType")
    @Expose
    private SubType_ subType;
    @SerializedName("family")
    @Expose
    private Boolean family;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Classification_() {
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
    public Classification_(Boolean primary, Segment_ segment, Genre_ genre, SubGenre_ subGenre, Type_ type, SubType_ subType, Boolean family) {
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

    public Segment_ getSegment() {
        return segment;
    }

    public void setSegment(Segment_ segment) {
        this.segment = segment;
    }

    public Genre_ getGenre() {
        return genre;
    }

    public void setGenre(Genre_ genre) {
        this.genre = genre;
    }

    public SubGenre_ getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(SubGenre_ subGenre) {
        this.subGenre = subGenre;
    }

    public Type_ getType() {
        return type;
    }

    public void setType(Type_ type) {
        this.type = type;
    }

    public SubType_ getSubType() {
        return subType;
    }

    public void setSubType(SubType_ subType) {
        this.subType = subType;
    }

    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

}
