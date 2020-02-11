
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Venue implements Serializable
{

    @SerializedName("href")
    @Expose
    private String href;
    private final static long serialVersionUID = -1687819275804377046L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Venue() {
    }

    /**
     * 
     * @param href
     */
    public Venue(String href) {
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
