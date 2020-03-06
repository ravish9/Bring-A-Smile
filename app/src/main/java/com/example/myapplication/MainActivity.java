package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import com.google.firebase.auth.FirebaseAuth;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button4;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button4 = findViewById(R.id.button);




 button4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

        Intent intToShopping = new Intent(MainActivity.this, OrganisationActivity.class);
        startActivity(intToShopping);
        }
        });
        }}