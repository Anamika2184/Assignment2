package com.example.z_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.RatingBar;

public class exploreActivity extends AppCompatActivity {

    private CheckBox genreFiction, genreNonFiction, genreSciFi, genreDrama;
    private RadioGroup radioGroupFormat;
    private RadioButton ebook, audioBook, paperBook;
    private SeekBar brightnessSeekBar;
    private TextView brightnessValue;
    private Switch darkModeSwitch;
    private RatingBar ratingBar;
    private TextView ratingValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        // Initialize UI elements
        genreFiction = findViewById(R.id.genreFiction);
        genreNonFiction = findViewById(R.id.genreNonFiction);
        genreSciFi = findViewById(R.id.genreSciFi);
        genreDrama = findViewById(R.id.genreDrama);

        radioGroupFormat = findViewById(R.id.radioGroup_format);
        ebook = findViewById(R.id.ebook);
        audioBook = findViewById(R.id.audio_book);
        paperBook = findViewById(R.id.paperbook);

        brightnessSeekBar = findViewById(R.id.brightnessSeekBar);
        brightnessValue = findViewById(R.id.brightnessValue);

        darkModeSwitch = findViewById(R.id.darkModeSwitch);

        ratingBar = findViewById(R.id.ratingBar);
        ratingValue = findViewById(R.id.rating_value);

        // Set initial rating value
        ratingValue.setText("Rate this book: " + ratingBar.getRating());

        // Set event listeners
        genreFiction.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle genre fiction checkbox event
            }
        });

        genreNonFiction.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle genre non-fiction checkbox event
            }
        });

        genreSciFi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle genre sci-fi checkbox event
            }
        });

        genreDrama.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle genre drama checkbox event
            }
        });

        radioGroupFormat.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Handle format radio button event
            }
        });

        brightnessSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Handle brightness seek bar event
                brightnessValue.setText("Brightness Level: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Handle seek bar touch event
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Handle seek bar release event
            }
        });

        darkModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle dark mode switch event
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                // Handle rating bar event
                ratingValue.setText("Rate this book: " + rating);
            }
        });
    }
}