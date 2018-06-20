package com.example.android.musicappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the music button
        ImageView main_play_button = (ImageButton)findViewById(R.id.main_play_button );

        // Set a click listener on that View)
        main_play_button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the startbutton is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {MusicActivity}
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);

                // Start the new activity
                startActivity(musicIntent);
            }
        });


    }
}