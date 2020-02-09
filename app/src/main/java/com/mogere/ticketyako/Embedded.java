
package com.mogere.ticketyako;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Embedded {

    @SerializedName("venues")
    @Expose
    private List<Venue_> venues = null;
    @SerializedName("attractions")
    @Expose
    private List<Attraction_> attractions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Embedded() {
    }

    /**
     * 
     * @param venues
     * @param attractions
     */
    public Embedded(List<Venue_> venues, List<Attraction_> attractions) {
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
