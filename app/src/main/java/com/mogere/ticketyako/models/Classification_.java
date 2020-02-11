
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Classification_ implements Serializable
{

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
    private Type type;
    @SerializedName("subType")
    @Expose
    private SubType subType;
    @SerializedName("family")
    @Expose
    private Boolean family;
    private final static long serialVersionUID = 206930738484676391L;

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
    public Classification_(Boolean primary, Segment_ segment, Genre_ genre, SubGenre_ subGenre, Type type, SubType subType, Boolean family) {
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
