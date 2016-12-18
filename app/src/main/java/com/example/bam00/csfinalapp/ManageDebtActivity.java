package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageDebtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_debt);
    }

    public void addLoan(View view) {
        Intent intent = new Intent(this, AddPaymentActivity.class);
        startActivity(intent);
    }

    public void savedPaymentPlan(View view) {
        Intent intent = new Intent(this, ViewPaymentPlanActivity.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
