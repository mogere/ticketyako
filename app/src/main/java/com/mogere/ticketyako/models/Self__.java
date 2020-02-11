
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Self__ implements Serializable
{

    @SerializedName("href")
    @Expose
    private String href;
    private final static long serialVersionUID = 6487960992814456690L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Self__() {
    }

    /**
     * 
     * @param href
     */
    public Self__(String href) {
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
