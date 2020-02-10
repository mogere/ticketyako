package com.mogere.ticketyako.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mogere.ticketyako.R;
import com.mogere.ticketyako.adapters.EventListAdapter;
import com.mogere.ticketyako.models.Event;
import com.mogere.ticketyako.models.TicketMasterSearchResponse;
import com.mogere.ticketyako.network.TicketMasterApi;
import com.mogere.ticketyako.network.TicketMasterClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventListActivity extends AppCompatActivity {

//    @BindView(R.id.recyclerView)
//    RecyclerView mRecyclerView;
//    @BindView(R.id.errorTextView)
//    TextView mErrorTextView;
//    @BindView(R.id.progressBar)
//    ProgressBar mProgressBar;

    private  RecyclerView mRecyclerView;
    private TextView mErrorTextView;
    private ProgressBar mProgressBar;

    private EventListAdapter mAdapter;

    public static final String TAG = EventListActivity.class.getSimpleName();

    public List<Event> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
//        ButterKnife.bind(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mErrorTextView = (TextView)findViewById(R.id.errorTextView);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        Intent intent = getIntent();
        String event = intent.getStringExtra("event");

        TicketMasterApi client = TicketMasterClient.getClient();
        Call<TicketMasterSearchResponse> call = client.getEvents(event, "Events");


        call.enqueue(new Callback<TicketMasterSearchResponse>() {
            @Override
            public void onResponse(Call<TicketMasterSearchResponse> call, Response<TicketMasterSearchResponse> response) {

                hideProgressBar();
                if (response.isSuccessful()) {

                    hideProgressBar();

                    events = response.body().getEmbedded().getEvents();
                    mAdapter = new EventListAdapter(EventListActivity.this, events);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(EventListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    showEvents();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<TicketMasterSearchResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }

        });
    }
    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showEvents() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}

