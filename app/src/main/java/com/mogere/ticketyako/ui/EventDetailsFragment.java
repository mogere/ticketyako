package com.mogere.ticketyako.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mogere.ticketyako.R;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventDetailsFragment extends Fragment implements View.OnClickListener {


    @BindView(R.id.eventImageView)ImageView mEventImage;
    @BindView(R.id.ticketNameTextView)TextView mTicketName;
    @BindView(R.id.typeTextView)TextView mType;
    @BindView(R.id.localeTextView)TextView mLocale;
    @BindView(R.id.urlTextView)TextView mUrl;


    public EventDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_details, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
