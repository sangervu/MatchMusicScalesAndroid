package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HexatonicView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_scales);

        this.customSimpleAdapterListView();
    }

    // This method shows how to customize SimpleAdapter to show image and text in ListView.
    private void customSimpleAdapterListView() {
        //setTitle("Hexatonic Scales");

        MusicScales musicScales = new MusicScales();
        String interval[] = FindIntervals.myIntervalsCleanedForHexa;
        //String[] interval = {"WWWWWW","WWWmHW","HmWHmW","mHmHmH","HHHHHH"};

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
                Toast.makeText(HexatonicView.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}