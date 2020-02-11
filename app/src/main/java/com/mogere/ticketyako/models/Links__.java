
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Links__ implements Serializable
{

    @SerializedName("self")
    @Expose
    private Self__ self;
    private final static long serialVersionUID = -3583801887818547867L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links__() {
    }

    /**
     * 
     * @param self
     */
    public Links__(Self__ self) {
        super();
        this.self = self;
    }

    public Self__ getSelf() {
        return self;
    }

    public void setSelf(Self__ self) {
        this.self = self;
    }

}
