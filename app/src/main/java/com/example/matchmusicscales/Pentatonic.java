package com.example.matchmusicscales;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pentatonic extends Activity {

    @Override
    public void onCreate(Bundle pentatonic) {
        setContentView(R.layout.pentatonic_scales);

        super.onCreate(pentatonic);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(buttonClicked);
    }

    OnClickListener buttonClicked = new OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent main = new Intent(Pentatonic.this, MainActivity.class);
            startActivity(main);

        }
    };

}


