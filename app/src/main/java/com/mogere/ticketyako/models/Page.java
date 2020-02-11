
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Page implements Serializable
{

    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("totalElements")
    @Expose
    private Integer totalElements;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("number")
    @Expose
    private Integer number;
    private final static long serialVersionUID = 2392861868286506859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Page() {
    }

    /**
     * 
     * @param number
     * @param size
     * @param totalPages
     * @param totalElements
     */
    public Page(Integer size, Integer totalElements, Integer totalPages, Integer number) {
        super();
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.number = number;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
