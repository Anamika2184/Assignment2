package com.example.z_library;

// Change this to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView libraryBanner;
    private TextView welcomeText;
    private Button exploreBooksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure this matches your layout file name

        // Initialize views
        libraryBanner = findViewById(R.id.library_banner);
        // Ensure you have this ID in your XML
        exploreBooksBtn = findViewById(R.id.explore_books_btn);

        // Set click listener on the Explore Books button
        exploreBooksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start the ExploreBooksActivity (create this activity)
                Intent intent = new Intent(MainActivity.this, exploreActivity.class);
                startActivity(intent);
            }
        });
    }
}
