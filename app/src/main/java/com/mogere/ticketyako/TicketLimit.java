
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketLimit {

    @SerializedName("info")
    @Expose
    private String info;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketLimit() {
    }

    /**
     * 
     * @param info
     */
    public TicketLimit(String info) {
        super();
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
