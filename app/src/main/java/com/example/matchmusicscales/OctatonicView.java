package com.example.matchmusicscales;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class OctatonicView extends ListActivity {

    static final String[] FRUITS = new String[] { "Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setListAdapter(new ArrayAdapter<String>(this, R.layout.octatonic_scales,FRUITS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);


    }

}