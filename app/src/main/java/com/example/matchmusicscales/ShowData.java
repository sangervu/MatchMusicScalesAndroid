package com.example.matchmusicscales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowData extends AppCompatActivity {

    ListView simpleList;
    String scaleListArray[];

    private String interval_4 = "";

    private TextView dataText1;
    private TextView dataText2;
    private TextView dataText3;
    private TextView dataText4;
    private ListView listView1;
    private RadioGroup intervalsGroup_4;
    private RadioButton intervalsButton_4;

    String[] intervalListArray;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_data);

        dataText1 = (TextView) findViewById(R.id.textViewData1);
        dataText2 = (TextView) findViewById(R.id.textViewData2);
        dataText3 = (TextView) findViewById(R.id.textViewData3);
        dataText4 = (TextView) findViewById(R.id.textViewData4);

        Toolbar toolbarData = findViewById(R.id.toolbar_data);
        setSupportActionBar(toolbarData);

        dataText1.setText(MainActivity.inputIntervals);
        dataText2.setText(MainActivity.interval_4);
        dataText3.setText(MainActivity.intervalsButton_4.getText().toString());
        dataText4.setText("koe3");

        scaleListArray = FindIntervals.myIntervalsCleanedForHepta;

        simpleList = (ListView)findViewById(R.id.dataListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textListView, scaleListArray);
        simpleList.setAdapter(arrayAdapter);
    }
}
