
package com.mogere.ticketyako.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sales implements Serializable
{

    @SerializedName("public")
    @Expose
    private Public _public;
    private final static long serialVersionUID = -4655405675421100918L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sales() {
    }

    /**
     * 
     * @param _public
     */
    public Sales(Public _public) {
        super();
        this._public = _public;
    }

    public Public getPublic() {
        return _public;
    }

    public void setPublic(Public _public) {
        this._public = _public;
    }

}
