package com.mogere.ticketyako.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mogere.ticketyako.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
        if(v== mSearch) {
            String location = mSearch.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantsListActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}
