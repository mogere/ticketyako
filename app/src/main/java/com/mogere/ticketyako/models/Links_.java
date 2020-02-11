
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Links_ implements Serializable
{

    @SerializedName("self")
    @Expose
    private Self_ self;
    private final static long serialVersionUID = -584319033325134419L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links_() {
    }

    /**
     * 
     * @param self
     */
    public Links_(Self_ self) {
        super();
        this.self = self;
    }

    public Self_ getSelf() {
        return self;
    }

    public void setSelf(Self_ self) {
        this.self = self;
    }

}
