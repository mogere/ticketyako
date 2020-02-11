
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Dates implements Serializable
{

    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("spanMultipleDays")
    @Expose
    private Boolean spanMultipleDays;
    private final static long serialVersionUID = -1264212459087992634L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dates() {
    }

    /**
     * 
     * @param start
     * @param status
     * @param spanMultipleDays
     */
    public Dates(Start start, Status status, Boolean spanMultipleDays) {
        super();
        this.start = start;
        this.status = status;
        this.spanMultipleDays = spanMultipleDays;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean getSpanMultipleDays() {
        return spanMultipleDays;
    }

    public void setSpanMultipleDays(Boolean spanMultipleDays) {
        this.spanMultipleDays = spanMultipleDays;
    }

}
