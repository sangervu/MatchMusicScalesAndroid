package com.example.matchmusicscales;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Heptatonic extends Activity {

    @Override
    public void onCreate(Bundle heptatonic) {
        setContentView(R.layout.heptatonic_scales);

        super.onCreate(heptatonic);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(buttonClicked);
    }

    OnClickListener buttonClicked = new OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent main = new Intent(Heptatonic.this, MainActivity.class);
            startActivity(main);

        }
    };
}