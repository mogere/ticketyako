
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Image_ implements Serializable
{

    @SerializedName("ratio")
    @Expose
    private String ratio;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("fallback")
    @Expose
    private Boolean fallback;
    @SerializedName("attribution")
    @Expose
    private String attribution;
    private final static long serialVersionUID = -7739344596645505686L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image_() {
    }

    /**
     * 
     * @param width
     * @param attribution
     * @param fallback
     * @param url
     * @param ratio
     * @param height
     */
    public Image_(String ratio, String url, Integer width, Integer height, Boolean fallback, String attribution) {
        super();
        this.ratio = ratio;
        this.url = url;
        this.width = width;
        this.height = height;
        this.fallback = fallback;
        this.attribution = attribution;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getFallback() {
        return fallback;
    }

    public void setFallback(Boolean fallback) {
        this.fallback = fallback;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

}
