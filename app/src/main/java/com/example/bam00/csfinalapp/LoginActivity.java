package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        boolean newUser = true;

        EditText username = (EditText) findViewById(R.id.loginUsernameEditText);
        String enteredUsername = username.getText().toString();

        EditText password = (EditText) findViewById(R.id.loginPasswordEditText);
        String enteredPassword = password.getText().toString();

        String savedUsername = sharedPref.getString("usernameKey", "");
        String savedPassword = sharedPref.getString("passwordKey", "");

        if (savedUsername.equals("") && savedPassword.equals(""))
            newUser = true;
        else
            newUser = false;

        Log.d("Saved Username", savedUsername);
        Log.d("Saved Password", savedPassword);

        Log.d("Entered Username", enteredUsername);
        Log.d("Entered Password", enteredPassword);

        if (!newUser && !savedUsername.equals(enteredUsername)) {
            username.setError(getString(R.string.usernameError));
            username.requestFocus();
        }

        if (!newUser && savedUsername.equals(enteredUsername)) {
            if (!savedPassword.equals(enteredPassword)) {
                password.setError(getString(R.string.passwordError));
                password.requestFocus();
            } else
                startActivity(intent);
        }

        if (newUser && enteredUsername.equals("")) {
            username.setError(getString(R.string.emptyUsername));
            username.requestFocus();
        }

        if(newUser && enteredPassword.equals("")) {
            password.setError(getString(R.string.emptyPassword));
            password.requestFocus();
        }

        if (newUser && !enteredUsername.equals("") && !enteredPassword.equals("")) {
            sharedPref.edit().putString("usernameKey", enteredUsername).apply();
            sharedPref.edit().putString("passwordKey", enteredPassword).apply();
            startActivity(intent);
        }
    }
}
