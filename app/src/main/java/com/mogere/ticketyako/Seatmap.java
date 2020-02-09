
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seatmap {

    @SerializedName("staticUrl")
    @Expose
    private String staticUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seatmap() {
    }

    /**
     * 
     * @param staticUrl
     */
    public Seatmap(String staticUrl) {
        super();
        this.staticUrl = staticUrl;
    }

    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }

}
