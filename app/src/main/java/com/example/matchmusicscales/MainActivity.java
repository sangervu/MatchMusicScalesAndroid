package com.example.matchmusicscales;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_pentatonic) {

            //setContentView(R.layout.pentatonic_scales);
            Intent pentatonic = new Intent(MainActivity.this, Pentatonic.class);
            startActivity(pentatonic);
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_hexatonic) {

            //setContentView(R.layout.hextatonic_scales);
            Intent hexatonic = new Intent(MainActivity.this, Hexatonic.class);
            startActivity(hexatonic);

            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_heptatonic) {

            //setContentView(R.layout.heptatonic_scales);
            Intent heptatonic = new Intent(MainActivity.this, Heptatonic.class);
            startActivity(heptatonic);

            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_octatonic) {

            //setContentView(R.layout.octatonic_scales);
            Intent octatonic = new Intent(MainActivity.this, Octatonic.class);
            startActivity(octatonic);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
