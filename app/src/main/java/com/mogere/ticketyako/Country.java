
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Country() {
    }

    /**
     * 
     * @param countryCode
     * @param name
     */
    public Country(String name, String countryCode) {
        super();
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
