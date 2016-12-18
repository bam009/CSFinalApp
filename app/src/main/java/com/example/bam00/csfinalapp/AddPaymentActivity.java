package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment);
    }

    public void addingPayment(View view) {
        PaymentsDB db = new PaymentsDB(this);

        EditText amount = (EditText) findViewById(R.id.addPaymentLoanAmountEditText);
        String enteredAmount = amount.getText().toString();
        double loanAmount = Double.parseDouble(enteredAmount);

        EditText rate = (EditText) findViewById(R.id.addPaymentInterestRateEditText);
        String enteredRate = rate.getText().toString();
        double interestRate = Double.parseDouble(enteredRate);

        EditText term = (EditText) findViewById(R.id.addPaymentPayoffYearsEditText);
        String enteredTerm = term.getText().toString();
        double loanTerm = Double.parseDouble(enteredTerm);

        db.addPayment(new Payment(loanAmount, interestRate, loanTerm));
        startActivity(new Intent(this, ViewPaymentPlanActivity.class));
    }

    public void manage(View view) {
        Intent intent = new Intent(this, ManageDebtActivity.class);
        startActivity(intent);
    }
}