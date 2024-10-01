package com.example.clickcounter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FeedBackActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private SeekBar seekBar;
    private CheckBox checkBox;
    private Switch switchButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        checkBox = findViewById(R.id.checkBox);
        switchButton = findViewById(R.id.switchButton);
        submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(view -> {

            float rating = ratingBar.getRating();
            int seekValue = seekBar.getProgress();
            boolean isRecommended = checkBox.isChecked();
            boolean notificationsEnabled = switchButton.isChecked();


            String feedbackMessage = "Rating: " + rating + "\n" +
                    "Satisfaction Level: " + seekValue + "/10\n" +
                    "Would Recommend: " + (isRecommended ? "Yes" : "No") + "\n" +
                    "Notifications: " + (notificationsEnabled ? "Enabled" : "Disabled");

            Toast.makeText(FeedBackActivity.this, feedbackMessage, Toast.LENGTH_LONG).show();
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}