
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Classification implements Serializable
{

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
    @SerializedName("family")
    @Expose
    private Boolean family;
    private final static long serialVersionUID = -4280279388658604466L;

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
     * @param family
     * @param primary
     */
    public Classification(Boolean primary, Segment segment, Genre genre, SubGenre subGenre, Boolean family) {
        super();
        this.primary = primary;
        this.segment = segment;
        this.genre = genre;
        this.subGenre = subGenre;
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

    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

}
