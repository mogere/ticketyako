
package com.mogere.ticketyako.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketMasterSearchResponse {

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
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("sales")
    @Expose
    private Sales sales;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("classifications")
    @Expose
    private List<Classification> classifications = null;
    @SerializedName("pleaseNote")
    @Expose
    private String pleaseNote;
    @SerializedName("priceRanges")
    @Expose
    private List<PriceRange> priceRanges = null;
    @SerializedName("seatmap")
    @Expose
    private Seatmap seatmap;
    @SerializedName("ticketLimit")
    @Expose
    private TicketLimit ticketLimit;
    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketMasterSearchResponse() {
    }

    /**
     * 
     * @param images
     * @param test
     * @param seatmap
     * @param dates
     * @param priceRanges
     * @param type
     * @param locale
     * @param url
     * @param sales
     * @param classifications
     * @param ticketLimit
     * @param name
     * @param pleaseNote
     * @param links
     * @param id
     * @param embedded
     */
    public TicketMasterSearchResponse(String name, String type, String id, Boolean test, String url, String locale, List<Image> images, Sales sales, Dates dates, List<Classification> classifications, String pleaseNote, List<PriceRange> priceRanges, Seatmap seatmap, TicketLimit ticketLimit, Links links, Embedded embedded) {
        super();
        this.name = name;
        this.type = type;
        this.id = id;
        this.test = test;
        this.url = url;
        this.locale = locale;
        this.images = images;
        this.sales = sales;
        this.dates = dates;
        this.classifications = classifications;
        this.pleaseNote = pleaseNote;
        this.priceRanges = priceRanges;
        this.seatmap = seatmap;
        this.ticketLimit = ticketLimit;
        this.links = links;
        this.embedded = embedded;
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public List<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public String getPleaseNote() {
        return pleaseNote;
    }

    public void setPleaseNote(String pleaseNote) {
        this.pleaseNote = pleaseNote;
    }

    public List<PriceRange> getPriceRanges() {
        return priceRanges;
    }

    public void setPriceRanges(List<PriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    public Seatmap getSeatmap() {
        return seatmap;
    }

    public void setSeatmap(Seatmap seatmap) {
        this.seatmap = seatmap;
    }

    public TicketLimit getTicketLimit() {
        return ticketLimit;
    }

    public void setTicketLimit(TicketLimit ticketLimit) {
        this.ticketLimit = ticketLimit;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

}
