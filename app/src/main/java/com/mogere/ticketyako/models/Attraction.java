
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attraction {

    @SerializedName("href")
    @Expose
    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attraction() {
    }

    /**
     * 
     * @param href
     */
    public Attraction(String href) {
        super();
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
