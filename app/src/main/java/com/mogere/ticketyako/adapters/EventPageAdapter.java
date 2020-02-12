package com.mogere.ticketyako.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mogere.ticketyako.models.Event;
import com.mogere.ticketyako.ui.EventDetailsFragment;

import java.util.List;

public class EventPageAdapter extends FragmentPagerAdapter {
    private List<Event> mEvent;

    public EventPageAdapter(FragmentManager fm, int behaviour, List<Event> events){
        super(fm, behaviour);

        mEvent = events;

    }

    @Override
    public Fragment getItem(int position) {
        return EventDetailsFragment.newInstance(mEvent.get(position));
    }

    @Override
    public int getCount() {
        return mEvent.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mEvent.get(position).getName();
    }
}
