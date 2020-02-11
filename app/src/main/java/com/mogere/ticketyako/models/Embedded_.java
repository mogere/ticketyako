
package com.mogere.ticketyako.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Embedded_ implements Serializable
{

    @SerializedName("venues")
    @Expose
    private List<Venue_> venues = null;
    @SerializedName("attractions")
    @Expose
    private List<Attraction_> attractions = null;
    private final static long serialVersionUID = 4094424480631410262L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Embedded_() {
    }

    /**
     * 
     * @param venues
     * @param attractions
     */
    public Embedded_(List<Venue_> venues, List<Attraction_> attractions) {
        super();
        this.venues = venues;
        this.attractions = attractions;
    }

    public List<Venue_> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue_> venues) {
        this.venues = venues;
    }

    public List<Attraction_> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction_> attractions) {
        this.attractions = attractions;
    }

}
