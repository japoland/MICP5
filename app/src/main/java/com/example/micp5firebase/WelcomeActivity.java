package com.example.micp5firebase;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }

    public void redirectToSignUpPage(View v) {
        Intent redirect = new Intent(WelcomeActivity.this, SignUpActivity.class);
        startActivity(redirect);
    }

    public void redirectToSignInPage(View v) {
        Intent redirect = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(redirect);
    }

}