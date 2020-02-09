
package com.mogere.ticketyako;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sales {

    @SerializedName("public")
    @Expose
    private Public _public;

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
