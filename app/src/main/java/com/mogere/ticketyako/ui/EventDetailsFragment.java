package com.mogere.ticketyako.ui;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mogere.ticketyako.R;
import com.mogere.ticketyako.models.Constants;
import com.mogere.ticketyako.models.Event;

import org.parceler.Parcels;

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
    @BindView(R.id.saveEventButton)Button mSaveEventButton;

    private Event mEvent;

    public EventDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEvent = Parcels.unwrap(getArguments().getParcelable("events"));
    }

    public static EventDetailsFragment newInstance(Event events) {
        EventDetailsFragment eventDetailFragment = new EventDetailsFragment();
        Bundle args = new Bundle();
        args.putParcelable("events", Parcels.wrap(events));
        eventDetailFragment.setArguments(args);
        return eventDetailFragment;
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
        if (v == mSaveEventButton) {
            DatabaseReference restaurantRef = FirebaseDatabase
                    .getInstance()
                    .getReference(Constants.FIREBASE_CHILD_EVENTS);
            restaurantRef.push().setValue(mEvent);
            Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
        }
    }
}
