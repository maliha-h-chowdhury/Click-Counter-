package com.example.clickcounter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView counterText = findViewById(R.id.counterText);
        Button incrementButton = findViewById(R.id.incrementButton);
        Button openFeedBackActivityButton = findViewById(R.id.openFeedBackActivityButton);

        Button openFormActivityButton = findViewById(R.id.openFormActivityButton);


        incrementButton.setOnClickListener(v -> {

            counter++;


            counterText.setText(String.valueOf(counter));


            Log.d("MainActivity", "Button clicked");


            Toast.makeText(MainActivity.this, "Counter: " + counter, Toast.LENGTH_SHORT).show();
        });


        openFeedBackActivityButton.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, FeedBackActivity.class);
            startActivity(intent);
        });

        openFormActivityButton.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intent);
        });
    }
}