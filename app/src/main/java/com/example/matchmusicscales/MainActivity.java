package com.example.matchmusicscales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    FindIntervals findIntervals;

    static String inputIntervals;

    static String interval_1;
    static String interval_2;
    static String interval_3;
    static String interval_4;
    static String interval_5;
    static String interval_6;
    static String interval_7;

    static int selectedId_4;

    private RadioGroup intervalsGroup_1;
    private RadioGroup intervalsGroup_2;
    private RadioGroup intervalsGroup_3;
    private RadioGroup intervalsGroup_4;
    private RadioGroup intervalsGroup_5;
    private RadioGroup intervalsGroup_6;
    private RadioGroup intervalsGroup_7;

    private RadioButton intervalsButton_1;
    private RadioButton intervalsButton_2;
    private RadioButton intervalsButton_3;
    static RadioButton intervalsButton_4;
    private RadioButton intervalsButton_5;
    private RadioButton intervalsButton_6;
    private RadioButton intervalsButton_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbarMain = findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbarMain);
    }

    protected void getRadioButtons() {

        intervalsGroup_1 = (RadioGroup) findViewById(R.id.IntervalGroup_1);
        intervalsGroup_2 = (RadioGroup) findViewById(R.id.IntervalGroup_2);
        intervalsGroup_3 = (RadioGroup) findViewById(R.id.IntervalGroup_3);
        intervalsGroup_4 = (RadioGroup) findViewById(R.id.IntervalGroup_4);
        intervalsGroup_5 = (RadioGroup) findViewById(R.id.IntervalGroup_5);
        intervalsGroup_6 = (RadioGroup) findViewById(R.id.IntervalGroup_6);
        intervalsGroup_7 = (RadioGroup) findViewById(R.id.IntervalGroup_7);

        // get selected radio button from intervalsGroup
        int selectedId_1 = intervalsGroup_1.getCheckedRadioButtonId();
        int selectedId_2 = intervalsGroup_2.getCheckedRadioButtonId();
        int selectedId_3 = intervalsGroup_3.getCheckedRadioButtonId();
        selectedId_4 = intervalsGroup_4.getCheckedRadioButtonId();
        int selectedId_5 = intervalsGroup_5.getCheckedRadioButtonId();
        int selectedId_6 = intervalsGroup_6.getCheckedRadioButtonId();
        int selectedId_7 = intervalsGroup_7.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        intervalsButton_1 = (RadioButton) findViewById(selectedId_1);
        intervalsButton_2 = (RadioButton) findViewById(selectedId_2);
        intervalsButton_3 = (RadioButton) findViewById(selectedId_3);

        interval_1 = intervalsButton_1.getText().toString();
        interval_2 = intervalsButton_2.getText().toString();
        interval_3 = intervalsButton_3.getText().toString();


        // buttons 4,5,6 and 7 must be tapped in this order. Otherwise they must be cleared
        if (selectedId_4 == -1) {
            interval_4 = "";

        } else {
            intervalsButton_4 = (RadioButton) findViewById(selectedId_4);
            interval_4 = intervalsButton_4.getText().toString();
        }

        if (selectedId_5 == -1) {
            interval_5 = " ";
        } else {
            intervalsButton_5 = (RadioButton) findViewById(selectedId_5);
            interval_5 = intervalsButton_5.getText().toString();

            if (selectedId_4 == -1) {
                RadioGroup radioGroup_5 = (RadioGroup) findViewById(R.id.IntervalGroup_5);
                radioGroup_5.clearCheck();
                interval_5 = " ";
            }
        }

        if (selectedId_6 == -1) {
            interval_6 = "";
        } else {
            intervalsButton_6 = (RadioButton) findViewById(selectedId_6);
            interval_6 = intervalsButton_6.getText().toString();

            if (selectedId_4 == -1 || selectedId_5 == -1) {
                RadioGroup radioGroup_6 = (RadioGroup) findViewById(R.id.IntervalGroup_6);
                radioGroup_6.clearCheck();
                interval_6 = " ";
            }
        }

        if (selectedId_7 == -1) {
            interval_7 = "";
        } else {
            intervalsButton_7 = (RadioButton) findViewById(selectedId_7);
            interval_7 = intervalsButton_7.getText().toString();

            if (selectedId_4 == -1 || selectedId_5 == -1 || selectedId_6 == -1) {
                RadioGroup radioGroup_7 = (RadioGroup) findViewById(R.id.IntervalGroup_7);
                radioGroup_7.clearCheck();
                interval_7 = " ";
            }
        }


        this.inputIntervals = interval_1 + interval_2 + interval_3 + interval_4 + interval_5 + interval_6 + interval_7;

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

        if (id == R.id.show_scales_hexatonic) {
            getRadioButtons();
            findIntervals = new FindIntervals(inputIntervals);
            Intent scales = new Intent(MainActivity.this, HexatonicView.class);
            startActivity(scales);

            return true;
        }

        if (id == R.id.show_scales_heptatonic) {
            getRadioButtons();
            findIntervals = new FindIntervals(inputIntervals);
            Intent scales = new Intent(MainActivity.this, HeptatonicView.class);
            startActivity(scales);

            return true;
        }

        if (id == R.id.show_scales_octatonic) {
            getRadioButtons();
            findIntervals = new FindIntervals(inputIntervals);
            Intent scales = new Intent(MainActivity.this, OctatonicView.class);
            startActivity(scales);

            return true;
        }

        if (id == R.id.clear_intervals) {

            RadioGroup radioGroup_4 = (RadioGroup) findViewById(R.id.IntervalGroup_4);
            RadioGroup radioGroup_5 = (RadioGroup) findViewById(R.id.IntervalGroup_5);
            RadioGroup radioGroup_6 = (RadioGroup) findViewById(R.id.IntervalGroup_6);
            RadioGroup radioGroup_7 = (RadioGroup) findViewById(R.id.IntervalGroup_7);

            radioGroup_4.clearCheck();
            radioGroup_5.clearCheck();
            radioGroup_6.clearCheck();
            radioGroup_7.clearCheck();

            return true;
        }

        if (id == R.id.show_data) {

            getRadioButtons();
            findIntervals = new FindIntervals(inputIntervals);

            Intent showData = new Intent(MainActivity.this, ShowData.class);
            startActivity(showData);

            return true;

        }

        return super.onOptionsItemSelected(item);

    }

}

   /*Toast.makeText(MainActivity.this,
                String.valueOf(selectedId_4), Toast.LENGTH_SHORT).show();*/