
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class TicketMasterSearchResponse implements Serializable
{

    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;
    @SerializedName("_links")
    @Expose
    private Links___ links;
    @SerializedName("page")
    @Expose
    private Page page;
    private final static long serialVersionUID = 488636357037970754L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicketMasterSearchResponse() {
    }

    /**
     * 
     * @param links
     * @param page
     * @param embedded
     */
    public TicketMasterSearchResponse(Embedded embedded, Links___ links, Page page) {
        super();
        this.embedded = embedded;
        this.links = links;
        this.page = page;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
