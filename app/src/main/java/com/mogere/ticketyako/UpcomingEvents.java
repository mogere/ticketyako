
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpcomingEvents {

    @SerializedName("_total")
    @Expose
    private Integer total;
    @SerializedName("ticketmaster")
    @Expose
    private Integer ticketmaster;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpcomingEvents() {
    }

    /**
     * 
     * @param total
     * @param ticketmaster
     */
    public UpcomingEvents(Integer total, Integer ticketmaster) {
        super();
        this.total = total;
        this.ticketmaster = ticketmaster;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTicketmaster() {
        return ticketmaster;
    }

    public void setTicketmaster(Integer ticketmaster) {
        this.ticketmaster = ticketmaster;
    }

}
