
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Status implements Serializable
{

    @SerializedName("code")
    @Expose
    private String code;
    private final static long serialVersionUID = -3918777100551091593L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param code
     */
    public Status(String code) {
        super();
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
