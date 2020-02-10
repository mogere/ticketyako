
package com.mogere.ticketyako.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attraction_ implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("test")
    @Expose
    private Boolean test;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("aliases")
    @Expose
    private List<String> aliases = null;
    @SerializedName("images")
    @Expose
    private List<Image_> images = null;
    @SerializedName("classifications")
    @Expose
    private List<Classification_> classifications = null;
    @SerializedName("upcomingEvents")
    @Expose
    private UpcomingEvents_ upcomingEvents;
    @SerializedName("_links")
    @Expose
    private Links__ links;
    private final static long serialVersionUID = -1179634367791094914L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attraction_() {
    }

    /**
     * 
     * @param classifications
     * @param images
     * @param aliases
     * @param test
     * @param upcomingEvents
     * @param name
     * @param links
     * @param id
     * @param type
     * @param locale
     * @param url
     */
    public Attraction_(String name, String type, String id, Boolean test, String url, String locale, List<String> aliases, List<Image_> images, List<Classification_> classifications, UpcomingEvents_ upcomingEvents, Links__ links) {
        super();
        this.name = name;
        this.type = type;
        this.id = id;
        this.test = test;
        this.url = url;
        this.locale = locale;
        this.aliases = aliases;
        this.images = images;
        this.classifications = classifications;
        this.upcomingEvents = upcomingEvents;
        this.links = links;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public List<Image_> getImages() {
        return images;
    }

    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public List<Classification_> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification_> classifications) {
        this.classifications = classifications;
    }

    public UpcomingEvents_ getUpcomingEvents() {
        return upcomingEvents;
    }

    public void setUpcomingEvents(UpcomingEvents_ upcomingEvents) {
        this.upcomingEvents = upcomingEvents;
    }

    public Links__ getLinks() {
        return links;
    }

    public void setLinks(Links__ links) {
        this.links = links;
    }

}
