package com.mogere.ticketyako.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mogere.ticketyako.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.textView)TextView mTextView;
    @BindView(R.id.eventEditText) EditText mEvent;
    @BindView(R.id.search) Button mSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==mSearch) {
            String event = mEvent.getText().toString();
            Intent intent = new Intent(MainActivity.this, EventListActivity.class);
            intent.putExtra("event", event);
            startActivity(intent);
        }
    }
}
