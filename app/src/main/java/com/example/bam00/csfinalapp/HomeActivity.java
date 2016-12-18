package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void findJob(View view) {
        Intent intent = new Intent(this, FindJobActivity.class);
        startActivity(intent);
    }

    public void jobStatistics(View view) {
        Intent intent = new Intent(this, JobStatisticsActivity.class);
        startActivity(intent);
    }

    public void manageDebt(View view) {
        Intent intent = new Intent(this, ManageDebtActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}