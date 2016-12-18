package com.example.bam00.csfinalapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CareersDB extends SQLiteOpenHelper {
    //DB version
    private static final int DB_VERSION = 1;
    //DB name
    private static final String DB_NAME = "careers_db";
    //Table name
    private static final String CAREERS = "careers";
    //Column names
    private static final String CATEGORY = "category";
    private static final String JOB = "job";

    public CareersDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + CAREERS + " ("
                + CATEGORY + " VARCHAR, "
                + JOB + " VARCHAR);";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CAREERS);
        onCreate(db);
    }
}
