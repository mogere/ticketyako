package com.mogere.ticketyako.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import androidx.recyclerview.widget.RecyclerView;

import com.mogere.ticketyako.models.TicketMasterSearchResponse;

import java.util.List;

public class EventListAdapter {

    public List<TicketMasterSearchResponse> mEvents;
    private Context mContext;

    public EventListAdapter(Context context, List<TicketMasterSearchResponse> events){
        mContext = context;
        mEvents = events;
    }



}
