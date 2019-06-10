package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PentatonicView extends AppCompatActivity {

    private String interval[];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_scales);

        this.customSimpleAdapterListView();

        Toolbar toolbarScales = findViewById(R.id.toolbar_scales);
        setSupportActionBar(toolbarScales);

    }

    // This method shows how to customize SimpleAdapter to show image and text in ListView.
    private void customSimpleAdapterListView() {
        //setTitle("Scales on Intervals");

        MusicScales musicScales = new MusicScales();

        if (FindIntervals.myIntervalsCleanedForPenta.length == 0) {
            interval = FindIntervals.tyhjä;
        }
        else {

            interval = FindIntervals.myIntervalsCleanedForPenta;
        }

        ArrayList<Map<String, Object>> itemDataList = new ArrayList<Map<String, Object>>();

        int titleLen = interval.length;
        for (int i = 0; i < titleLen; i++) {
            Map<String, Object> listItemMap = new HashMap<String, Object>();

            listItemMap.put("interval", interval[i]);
            listItemMap.put("scale", musicScales.getScales(interval[i]));
            itemDataList.add(listItemMap);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, itemDataList, R.layout.view_scales,
                new String[]{"interval", "scale"}, new int[]{R.id.intervalsDesc, R.id.scaleDesc});

        ListView listView = (ListView) findViewById(R.id.listViewScales);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(PentatonicView.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}