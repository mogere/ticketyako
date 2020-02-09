
package com.mogere.ticketyako.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeneralInfo {

    @SerializedName("generalRule")
    @Expose
    private String generalRule;
    @SerializedName("childRule")
    @Expose
    private String childRule;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeneralInfo() {
    }

    /**
     * 
     * @param generalRule
     * @param childRule
     */
    public GeneralInfo(String generalRule, String childRule) {
        super();
        this.generalRule = generalRule;
        this.childRule = childRule;
    }

    public String getGeneralRule() {
        return generalRule;
    }

    public void setGeneralRule(String generalRule) {
        this.generalRule = generalRule;
    }

    public String getChildRule() {
        return childRule;
    }

    public void setChildRule(String childRule) {
        this.childRule = childRule;
    }

}
