
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceRange {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("min")
    @Expose
    private Double min;
    @SerializedName("max")
    @Expose
    private Double max;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceRange() {
    }

    /**
     * 
     * @param min
     * @param max
     * @param currency
     * @param type
     */
    public PriceRange(String type, String currency, Double min, Double max) {
        super();
        this.type = type;
        this.currency = currency;
        this.min = min;
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

}
