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

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mogere.ticketyako.R;
import com.mogere.ticketyako.models.Event;
import com.mogere.ticketyako.models.TicketMasterSearchResponse;
import com.mogere.ticketyako.ui.EventDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder>{

    public List<Event> mEvents;
    private Context mContext;

    public EventListAdapter(Context context, List<Event> events){
        mContext = context;
        mEvents = events;
    }

    @Override
    public EventListAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventListAdapter.EventViewHolder holder, int position) {
        holder.bindEvent(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.eventImageView) ImageView mEventImageView;
        @BindView(R.id.eventNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.urlTextView) TextView mUrlTextView;

        private Context mContext;

        public EventViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, EventDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("events", Parcels.wrap(mEvents));
            mContext.startActivity(intent);

        }

        public void bindEvent(Event event){
            //Picasso.get().load(event.getImages()).into(mEventImageView);
            mNameTextView.setText(event.getName());
            mCategoryTextView.setText(event.getType());
            mUrlTextView.setText("Url: " + event.getUrl());
        }
    }
}
