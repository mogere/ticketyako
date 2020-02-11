package com.mogere.ticketyako.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.mogere.ticketyako.EventPageAdapter;
import com.mogere.ticketyako.R;
import com.mogere.ticketyako.models.Event;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventDetailActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)ViewPager mViewPager;
    private EventPageAdapter adapterViewPager;
    List<Event> mEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        ButterKnife.bind(this);

        mEvent = Parcels.unwrap(getIntent().getParcelableExtra("events"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new EventPageAdapter(getSupportFragmentManager(),  mEvent);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
