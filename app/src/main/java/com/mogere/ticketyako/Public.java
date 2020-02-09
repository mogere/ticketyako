
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Public {

    @SerializedName("startDateTime")
    @Expose
    private String startDateTime;
    @SerializedName("startTBD")
    @Expose
    private Boolean startTBD;
    @SerializedName("endDateTime")
    @Expose
    private String endDateTime;

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
