package com.example.matchmusicscales;

import android.text.TextUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class OctatonicIntervals {

    public static LinkedHashSet<String> hashList;
    private String[] octatonicIntervals = new String[8];
    public String[] octatonicIntervalsAll = new String[80];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    CheckIntervals empty = new CheckIntervals();
    public void clearIntervals(){
        empty.getArrayCleared(octatonicIntervals);
        empty.getArrayCleared(octatonicIntervalsAll);
        charCounter = -1;
    };

    private int charCounter = -1;

    public void setOctatonicInterval(String intervallit) {
        charCounter = charCounter + 1;
        octatonicIntervals[charCounter] = intervallit;
    }

    public String[] getAllOctatonicIntervals(String intervalCount) {

        switch (intervalCount) {

            case "3": //Kolme intevallia syötetty

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
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[3] = String.valueOf(H);
                octatonicIntervals[4] = String.valueOf(H);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = TextUtils.join("", octatonicIntervals);
                break;

            case "4": //Neljä intervallia syötetty

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
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[4] = String.valueOf(H);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = TextUtils.join("", octatonicIntervals);

                break;
            case "5": //Viisi intervallia syötetty
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
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[5] = String.valueOf(H);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = TextUtils.join("", octatonicIntervals);
                break;

            case "6": //Kuusi intervallia syötetty
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
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }
                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[6] = String.valueOf(H);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = TextUtils.join("", octatonicIntervals);
                break;

            case "7": //Seitsemän intervallia syötetty
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
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }

                Collections.rotate(Arrays.asList(octatonicIntervals), -2);
                octatonicIntervals[7] = String.valueOf(H);
                octatonicIntervalsAll[2] = TextUtils.join("", octatonicIntervals);
                break;

            case "8": //Kahdeksan intervallia syötetty
                for (int i = 0; i <= 1; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = TextUtils.join("", octatonicIntervals);
                }
                break;
        }
        return octatonicIntervalsAll;
    }
}
