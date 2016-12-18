package com.example.bam00.csfinalapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class PaymentsDB extends SQLiteOpenHelper {
    //DB version
    private static final int DB_VERSION = 1;
    //DB name
    private static final String DB_NAME = "payments_db";
    //Table name
    private static final String PAYMENTS = "payments";
    //Column names
    private static final String LOAN_AMOUNT = "loan_amount";
    private static final String INTEREST_RATE = "interest_rate";
    private static final String LOAN_TERM = "loan_term";

    public PaymentsDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + PAYMENTS + " ("
                + LOAN_AMOUNT + " DOUBLE, "
                + INTEREST_RATE + " DOUBLE, "
                + LOAN_TERM + " DOUBLE" + ");";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop old table if one exists
        db.execSQL("DROP TABLE IF EXISTS " + PAYMENTS);
        //Create upgraded table
        onCreate(db);
    }

    //Adding new payment
    public void addPayment(Payment payment) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //Loan amount
        values.put(LOAN_AMOUNT, payment.getLoanAmount());
        //Interest rate
        values.put(INTEREST_RATE, payment.getInterestRate());
        //Loan term
        values.put(LOAN_TERM, payment.getLoanTerm());
        //Inserting row
        db.insert(PAYMENTS, null, values);
        //Close DB connection
        db.close();
    }

    //Getting one payment
    public Payment getPayment(double loanAmount) {
        SQLiteDatabase db = this.getReadableDatabase();
        Payment payment = null;
        Cursor cursor = db.query(PAYMENTS, new String[]{LOAN_AMOUNT,
                        INTEREST_RATE, LOAN_TERM}, LOAN_AMOUNT + " = " + String.valueOf(getPayment(loanAmount).getLoanAmount()),
                null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
            payment = new Payment(Double.parseDouble(cursor.getString(0)),
                    Double.parseDouble(cursor.getString(1)),
                    Double.parseDouble(cursor.getString(2)));
        }
        return payment;
    }

    //Getting all payments
    public List<Payment> getAllPayments() {
        List<Payment> payments = new ArrayList<Payment>();
        //Select all query
        String selectQuery = "SELECT * FROM " + PAYMENTS + ";";
        SQLiteDatabase db = this.getWritableDatabase();
        Payment payment;
        Cursor cursor = db.rawQuery(selectQuery, null);
        //Looping through all rows & adding them to the list
        if (cursor.moveToFirst()) {
            do {
                payment = new Payment(Double.parseDouble(cursor.getString(0)),
                        Double.parseDouble(cursor.getString(1)),
                        Double.parseDouble(cursor.getString(2)));
                //Add payment to list
                payments.add(payment);
            } while (cursor.moveToNext());
        }
        //Return payment list
        return payments;
    }

    //Updating a payment
    public int updatePayment(Payment payment) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(LOAN_AMOUNT, payment.getLoanAmount());
        values.put(INTEREST_RATE, payment.getInterestRate());
        values.put(LOAN_TERM, payment.getLoanTerm());
        //Update row
        return db.update(PAYMENTS, values, LOAN_AMOUNT + " =?",
                new String[]{String.valueOf(payment.getLoanAmount())});
    }

    //Deleting a payment
    public void deletePayment(int loanAmount) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(PAYMENTS, LOAN_AMOUNT + " = " + String.valueOf(getPayment(loanAmount).getLoanAmount()), null);
        db.close();
    }
}
