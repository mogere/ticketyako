
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stateCode")
    @Expose
    private String stateCode;
    private final static long serialVersionUID = 6042778577320114889L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public State() {
    }

    /**
     * 
     * @param name
     * @param stateCode
     */
    public State(String name, String stateCode) {
        super();
        this.name = name;
        this.stateCode = stateCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}
