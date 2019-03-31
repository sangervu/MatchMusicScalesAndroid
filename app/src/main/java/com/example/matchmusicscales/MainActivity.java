package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

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

            setContentView(R.layout.pentatonic_scales);

            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_hexatonic) {
<<<<<<< HEAD

            setContentView(R.layout.hextatonic_scales);

=======
>>>>>>> 21589b916db1491d877791701aefdc4daca21cf7
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_heptatonic) {

            setContentView(R.layout.heptatonic_scales);

            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_octatonic) {

            setContentView(R.layout.octatonic_scales);

            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
