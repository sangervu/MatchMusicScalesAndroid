package com.example.matchmusicscales;

/*
 * @author angervuorisa
 */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Collections;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Octatonic extends Activity {

    @Override
    public void onCreate(Bundle octatonic) {
        setContentView(R.layout.octatonic_scales);

        super.onCreate(octatonic);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(buttonClicked);
    }

    OnClickListener buttonClicked = new OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent main = new Intent(Octatonic.this, MainActivity.class);
            startActivity(main);
        }
    };

    public static LinkedHashSet<String> hashList;
    private String[] octatonicIntervals = new String[8];
    public String[] octatonicIntervalsAll = new String[80];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    String stringIntervals;
    static int charCounter = -1;

    /**
     * @param intervallit
     */
    public void setOctatonicInterval(String intervallit) {
        charCounter = charCounter + 1;
        octatonicIntervals[charCounter] = intervallit;
    }

    /**
     * @param intervalCount
     * @return
     */
    public String[] getAllOctatonicIntervals(String intervalCount) {

        switch (intervalCount) {

            case "3": //Kolme intevallia syötetty (OK)

                switch (octatonicIntervals[2]) {

                    case "W":
                        octatonicIntervals[3] = String.valueOf(H);
                        octatonicIntervals[4] = String.valueOf(W);
                        octatonicIntervals[5] = String.valueOf(H);
                        octatonicIntervals[6] = String.valueOf(W);
                        octatonicIntervals[7] = String.valueOf(H);
                        break;
                    case "H":
                        octatonicIntervals[3] = String.valueOf(W);
                        octatonicIntervals[4] = String.valueOf(H);
                        octatonicIntervals[5] = String.valueOf(W);
                        octatonicIntervals[6] = String.valueOf(H);
                        octatonicIntervals[7] = String.valueOf(W);
                        break;
                }

                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[3] = String.valueOf(H);
                octatonicIntervals[4] = String.valueOf(H);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = String.join("", octatonicIntervals);
                break;

            case "4": //Neljä intervallia syötetty (OK)

                switch (octatonicIntervals[3]) {

                    case "H":
                        octatonicIntervals[4] = String.valueOf(W);
                        octatonicIntervals[5] = String.valueOf(H);
                        octatonicIntervals[6] = String.valueOf(W);
                        octatonicIntervals[7] = String.valueOf(H);
                        break;
                    case "W":
                        octatonicIntervals[4] = String.valueOf(H);
                        octatonicIntervals[5] = String.valueOf(W);
                        octatonicIntervals[6] = String.valueOf(H);
                        octatonicIntervals[7] = String.valueOf(W);
                        break;
                }
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[4] = String.valueOf(H);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = String.join("", octatonicIntervals);

                break;
            case "5": //Viisi intervallia syötetty (OK)
                switch (octatonicIntervals[4]) {

                    case "W":
                        octatonicIntervals[5] = String.valueOf(H);
                        octatonicIntervals[6] = String.valueOf(W);
                        octatonicIntervals[7] = String.valueOf(H);
                        break;
                    case "H":
                        octatonicIntervals[5] = String.valueOf(W);
                        octatonicIntervals[6] = String.valueOf(H);
                        octatonicIntervals[7] = String.valueOf(W);
                        break;
                }
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = String.join("", octatonicIntervals);
                break;

            case "6": //Kuusi intervallia syötetty (OK)
                switch (octatonicIntervals[5]) {
                    case "H":
                        octatonicIntervals[6] = String.valueOf(W);
                        octatonicIntervals[7] = String.valueOf(H);
                        break;
                    case "W":
                        octatonicIntervals[6] = String.valueOf(H);
                        octatonicIntervals[7] = String.valueOf(W);
                        break;
                }
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = String.join("", octatonicIntervals);
                break;

            case "7": //Seitsemän intervallia syötetty (OK)
                switch (octatonicIntervals[6]) {
                    case "W":
                        octatonicIntervals[7] = String.valueOf(H);
                        break;
                    case "H":
                        octatonicIntervals[7] = String.valueOf(W);
                        break;
                }
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }

                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = String.join("", octatonicIntervals);
                break;

            case "8": //Kahdeksan intervallia syötetty (OK)
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                break;
        }
        return octatonicIntervalsAll;
    }
}