
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dates {

    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("spanMultipleDays")
    @Expose
    private Boolean spanMultipleDays;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dates() {
    }

    /**
     * 
     * @param timezone
     * @param start
     * @param status
     * @param spanMultipleDays
     */
    public Dates(Start start, String timezone, Status status, Boolean spanMultipleDays) {
        super();
        this.start = start;
        this.timezone = timezone;
        this.status = status;
        this.spanMultipleDays = spanMultipleDays;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
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
