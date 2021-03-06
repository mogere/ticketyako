
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Public implements Serializable
{

    @SerializedName("startDateTime")
    @Expose
    private String startDateTime;
    @SerializedName("startTBD")
    @Expose
    private Boolean startTBD;
    @SerializedName("endDateTime")
    @Expose
    private String endDateTime;
    private final static long serialVersionUID = 8792211983963319607L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Public() {
    }

    /**
     * 
     * @param startDateTime
     * @param startTBD
     * @param endDateTime
     */
    public Public(String startDateTime, Boolean startTBD, String endDateTime) {
        super();
        this.startDateTime = startDateTime;
        this.startTBD = startTBD;
        this.endDateTime = endDateTime;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Boolean getStartTBD() {
        return startTBD;
    }

    public void setStartTBD(Boolean startTBD) {
        this.startTBD = startTBD;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

}
