
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


@Parcel
public class Outlet implements Serializable
{

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = -8827811338603347307L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Outlet() {
    }

    /**
     * 
     * @param type
     * @param url
     */
    public Outlet(String url, String type) {
        super();
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
