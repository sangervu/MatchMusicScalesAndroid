package com.example.matchmusicscales;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class OctatonicView extends ListActivity {

    String scales[] = FindIntervals.myIntervalsCleanedForOcta;

    MusicScales scale = new MusicScales();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.octatonic_scales,scales));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String out = scale.getScales(((TextView) view).getText().toString());
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),out, Toast.LENGTH_LONG).show();
            }
        });

    }

}