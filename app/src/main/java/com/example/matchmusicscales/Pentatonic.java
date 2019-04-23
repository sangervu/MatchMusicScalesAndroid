package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pentatonic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle pentatonic) {

        super.onCreate(pentatonic);

        setContentView(R.layout.pentatonic_scales);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                final Button button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });
            }
        });
    }

}


