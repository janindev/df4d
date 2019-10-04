package com.example.android.drentsef4d;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartingPoints extends AppCompatActivity {

    @BindView(R.id.btnDiever) Button mBtnDiever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_points);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDiever)
    void onStartingPointsClick() {
        Intent onClickDiever = new Intent(StartingPoints.this, Diever.class);
        startActivity(onClickDiever);
    }
}
