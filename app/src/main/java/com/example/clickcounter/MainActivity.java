package com.example.clickcounter;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variable to keep track of the count
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by their ID
        TextView counterText = findViewById(R.id.counterText);
        Button incrementButton = findViewById(R.id.incrementButton);

        // Set button click listener
        incrementButton.setOnClickListener(v -> {
            // Increment the counter
            counter++;

            // Update the TextView with the new counter value
            counterText.setText(String.valueOf(counter));

            // Log the button click for debugging
            Log.d("MainActivity", "Button clicked");

            // Show a Toast message with the current counter value
            Toast.makeText(MainActivity.this, "Counter: " + counter, Toast.LENGTH_SHORT).show();  // This should work
        });

    }
}
