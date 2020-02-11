package com.mogere.ticketyako.ui;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mogere.ticketyako.R;
import com.mogere.ticketyako.models.Event;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventDetailsFragment extends Fragment implements View.OnClickListener {


    @BindView(R.id.eventImageView)ImageView mEventImage;
    @BindView(R.id.ticketNameTextView)TextView mTicketName;
    @BindView(R.id.typeTextView)TextView mType;
    @BindView(R.id.localeTextView)TextView mLocale;
    @BindView(R.id.urlTextView)TextView mUrl;

    private Event mEvent;

    public EventDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_details, container, false);
        ButterKnife.bind(this, view);

        mTicketName.setText(mEvent.getName());
        mLocale.setText(mEvent.getLocale());
        mType.setText(mEvent.getType());
        mUrl.setText(mEvent.getUrl());

        mUrl.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if(v==mUrl){
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(mEvent.getUrl()));
            startActivity(webIntent);
        }
    }
}
