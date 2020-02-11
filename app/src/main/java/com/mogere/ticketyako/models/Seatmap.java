
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Seatmap implements Serializable
{

    @SerializedName("staticUrl")
    @Expose
    private String staticUrl;
    private final static long serialVersionUID = -9015070522982542508L;

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
