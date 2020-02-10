
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links___ implements Serializable
{

    @SerializedName("first")
    @Expose
    private First first;
    @SerializedName("self")
    @Expose
    private Self___ self;
    @SerializedName("next")
    @Expose
    private Next next;
    @SerializedName("last")
    @Expose
    private Last last;
    private final static long serialVersionUID = -6782284843507649709L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links___() {
    }

    /**
     * 
     * @param next
     * @param last
     * @param self
     * @param first
     */
    public Links___(First first, Self___ self, Next next, Last last) {
        super();
        this.first = first;
        this.self = self;
        this.next = next;
        this.last = last;
    }

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Self___ getSelf() {
        return self;
    }

    public void setSelf(Self___ self) {
        this.self = self;
    }

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }

    public Last getLast() {
        return last;
    }

    public void setLast(Last last) {
        this.last = last;
    }

}
