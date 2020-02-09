package com.mogere.ticketyako.network;

import com.mogere.ticketyako.models.TicketMasterSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface    TicketMasterApi {

    @GET("events/")
    Call<TicketMasterSearchResponse> getEvents(
            @Query("event") String event,
            @Query("term") String term
    );
}
