package com.example.android.drentsef4d;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnOverview) Button mBtnOverview;
    @BindView(R.id.btnStartingPoints) Button mBtnStartingPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnOverview)
    void onOverviewClick() {
        Toast.makeText(getApplicationContext(), "hello it works", Toast.LENGTH_LONG).show();
        //mBtnOverview.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.btnStartingPoints)
    void onStartingPointsClick() {
        Intent onClickToStartingPoints = new Intent(MainActivity.this, StartingPoints.class);
        startActivity(onClickToStartingPoints);
    }
}