
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class UpcomingEvents_ implements Serializable
{

    @SerializedName("_total")
    @Expose
    private Integer total;
    @SerializedName("tmr")
    @Expose
    private Integer tmr;
    @SerializedName("ticketmaster")
    @Expose
    private Integer ticketmaster;
    private final static long serialVersionUID = -8101693419038149939L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpcomingEvents_() {
    }

    /**
     * 
     * @param total
     * @param tmr
     * @param ticketmaster
     */
    public UpcomingEvents_(Integer total, Integer tmr, Integer ticketmaster) {
        super();
        this.total = total;
        this.tmr = tmr;
        this.ticketmaster = ticketmaster;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTmr() {
        return tmr;
    }

    public void setTmr(Integer tmr) {
        this.tmr = tmr;
    }

    public Integer getTicketmaster() {
        return ticketmaster;
    }

    public void setTicketmaster(Integer ticketmaster) {
        this.ticketmaster = ticketmaster;
    }

}
