
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Genre_ {

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
    public Genre_() {
    }

    /**
     * 
     * @param name
     * @param id
     */
    public Genre_(String id, String name) {
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
