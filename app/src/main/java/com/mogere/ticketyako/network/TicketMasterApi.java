package com.mogere.ticketyako.network;

import com.mogere.ticketyako.models.TicketMasterSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TicketMasterApi {

    @GET("events.json?apikey=Xqft3u5SqlBSELkbihJjgyKsKNUiCPLJ")
    Call<TicketMasterSearchResponse> getEvents(
            @Query("type") String event,
            @Query("term") String term
    );
}
