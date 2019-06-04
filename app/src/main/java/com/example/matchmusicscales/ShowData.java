package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class ShowData extends AppCompatActivity {

    ListView simpleList;
    String scaleListArray[];

    private String interval_4 = "";

    private TextView dataText1;
    private TextView dataText2;
    private TextView dataText3;
    private TextView dataText4;


    String[] intervalListArray;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_data);

        Toolbar toolbarData = findViewById(R.id.toolbar_data);
        setSupportActionBar(toolbarData);

        dataText1 = (TextView) findViewById(R.id.textViewData1);
        dataText2 = (TextView) findViewById(R.id.textViewData2);
        dataText3 = (TextView) findViewById(R.id.textViewData3);
        dataText4 = (TextView) findViewById(R.id.textViewData4);

        dataText1.setText(MainActivity.inputIntervals);
        dataText2.setText(MainActivity.interval_4);
        dataText3.setText(Integer.toString(MainActivity.selectedId_4));
        dataText4.setText(Integer.toString(FindIntervals.intervalliLaskuri));

        //scaleListArray = FindIntervals.myIntervalsCleanedForOcta;
        String[] scaleListArray ={"hgshg","jhcgjhdg","kjdcjkwd"};

        simpleList = (ListView)findViewById(R.id.dataListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textListView, scaleListArray);
        simpleList.setAdapter(arrayAdapter);
    }
}
