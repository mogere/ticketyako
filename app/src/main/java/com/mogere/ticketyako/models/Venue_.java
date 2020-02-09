
package com.mogere.ticketyako.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue_ {

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
    private List<Image_> images = null;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("state")
    @Expose
    private State state;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;
    @SerializedName("dmas")
    @Expose
    private List<Dma> dmas = null;
    @SerializedName("boxOfficeInfo")
    @Expose
    private BoxOfficeInfo boxOfficeInfo;
    @SerializedName("parkingDetail")
    @Expose
    private String parkingDetail;
    @SerializedName("accessibleSeatingDetail")
    @Expose
    private String accessibleSeatingDetail;
    @SerializedName("generalInfo")
    @Expose
    private GeneralInfo generalInfo;
    @SerializedName("upcomingEvents")
    @Expose
    private UpcomingEvents upcomingEvents;
    @SerializedName("_links")
    @Expose
    private Links_ links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Venue_() {
    }

    /**
     * 
     * @param country
     * @param images
     * @param address
     * @param test
     * @param city
     * @param timezone
     * @param upcomingEvents
     * @param postalCode
     * @param generalInfo
     * @param type
     * @param locale
     * @param boxOfficeInfo
     * @param url
     * @param markets
     * @param dmas
     * @param accessibleSeatingDetail
     * @param name
     * @param parkingDetail
     * @param location
     * @param links
     * @param id
     * @param state
     */
    public Venue_(String name, String type, String id, Boolean test, String url, String locale, List<Image_> images, String postalCode, String timezone, City city, State state, Country country, Address address, Location location, List<Market> markets, List<Dma> dmas, BoxOfficeInfo boxOfficeInfo, String parkingDetail, String accessibleSeatingDetail, GeneralInfo generalInfo, UpcomingEvents upcomingEvents, Links_ links) {
        super();
        this.name = name;
        this.type = type;
        this.id = id;
        this.test = test;
        this.url = url;
        this.locale = locale;
        this.images = images;
        this.postalCode = postalCode;
        this.timezone = timezone;
        this.city = city;
        this.state = state;
        this.country = country;
        this.address = address;
        this.location = location;
        this.markets = markets;
        this.dmas = dmas;
        this.boxOfficeInfo = boxOfficeInfo;
        this.parkingDetail = parkingDetail;
        this.accessibleSeatingDetail = accessibleSeatingDetail;
        this.generalInfo = generalInfo;
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

    public List<Image_> getImages() {
        return images;
    }

    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public List<Dma> getDmas() {
        return dmas;
    }

    public void setDmas(List<Dma> dmas) {
        this.dmas = dmas;
    }

    public BoxOfficeInfo getBoxOfficeInfo() {
        return boxOfficeInfo;
    }

    public void setBoxOfficeInfo(BoxOfficeInfo boxOfficeInfo) {
        this.boxOfficeInfo = boxOfficeInfo;
    }

    public String getParkingDetail() {
        return parkingDetail;
    }

    public void setParkingDetail(String parkingDetail) {
        this.parkingDetail = parkingDetail;
    }

    public String getAccessibleSeatingDetail() {
        return accessibleSeatingDetail;
    }

    public void setAccessibleSeatingDetail(String accessibleSeatingDetail) {
        this.accessibleSeatingDetail = accessibleSeatingDetail;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public UpcomingEvents getUpcomingEvents() {
        return upcomingEvents;
    }

    public void setUpcomingEvents(UpcomingEvents upcomingEvents) {
        this.upcomingEvents = upcomingEvents;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

}
