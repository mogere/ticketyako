
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Dma implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    private final static long serialVersionUID = -7126497057962767996L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dma() {
    }

    /**
     * 
     * @param id
     */
    public Dma(Integer id) {
        super();
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
