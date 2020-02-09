
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubType_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubType_() {
    }

    /**
     * 
     * @param name
     * @param id
     */
    public SubType_(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
