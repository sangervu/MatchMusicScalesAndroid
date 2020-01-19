package com.example.matchmusicscales;

import android.text.TextUtils;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.List;

public class HeptatonicIntervals {

    //public static LinkedHashSet<String> hashList;
    private String[] heptatonicIntervals = new String[7];
    public String[] heptatonicIntervalsAll = new String[1791];
    //public String[] myIntervalsCleaned = new String[54612];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    CheckIntervals empty = new CheckIntervals();

    public void clearIntervals() {
        empty.getArrayCleared(heptatonicIntervals);
        empty.getArrayCleared(heptatonicIntervalsAll);
        charCounter = -1;
    }

    ;

    private int charCounter = -1;

    public void setHeptatonicInterval(String intervallit) {

        charCounter = charCounter + 1;
        heptatonicIntervals[charCounter] = intervallit;

    }

    public String[] getAllHeptatonicIntervals(String intervalCount) {

        int scaleCounter;
        IntervalGenerator gen = new IntervalGenerator();

        if (MainActivity.isCheckedAllScales) {

            switch (intervalCount) {

                case "3": //Kolme intevallia syötetty
                    scaleCounter = -1;
                    for (int counterOut = 0; counterOut <= 4; counterOut++) {
                        switch (counterOut) {
                            case 1:
                                heptatonicIntervals[3] = String.valueOf('W');

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[4] = String.valueOf('W');

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 2:
                                            heptatonicIntervals[4] = String.valueOf(H);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 3:
                                            heptatonicIntervals[4] = String.valueOf(m);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 4:
                                            heptatonicIntervals[4] = String.valueOf(M);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                    }
                                }
                                invertUsingCollectionsReverse(heptatonicIntervalsAll);
                                break;
                            case 2:
                                heptatonicIntervals[3] = String.valueOf(H);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[4] = String.valueOf('W');

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 2:
                                            heptatonicIntervals[4] = String.valueOf(H);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 3:
                                            heptatonicIntervals[4] = String.valueOf(m);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 4:
                                            heptatonicIntervals[4] = String.valueOf(M);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                    }
                                }

                                break;
                            case 3:
                                heptatonicIntervals[3] = String.valueOf(m);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[4] = String.valueOf('W');

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 2:
                                            heptatonicIntervals[4] = String.valueOf(H);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;

                                        case 3:
                                            heptatonicIntervals[4] = String.valueOf(m);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;

                                        case 4:
                                            heptatonicIntervals[4] = String.valueOf(M);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                    }
                                }
                                break;
                            case 4:
                                heptatonicIntervals[3] = String.valueOf(M);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[4] = String.valueOf('W');

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 2:
                                            heptatonicIntervals[4] = String.valueOf(H);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 3:
                                            heptatonicIntervals[4] = String.valueOf(m);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                        case 4:
                                            heptatonicIntervals[4] = String.valueOf(M);

                                            this.heptatonicIntervalsAll = gen.getSixthSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();

                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    invertUsingCollectionsReverse(heptatonicIntervalsAll);
                    break;

                case "4": //Neljä intervallia syötetty

                    scaleCounter = -1;
                    for (int counterOut = 0; counterOut <= 4; counterOut++) {
                        switch (counterOut) {
                            case 1:
                                heptatonicIntervals[4] = String.valueOf('W');

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[5] = String.valueOf('W');
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 2:
                                            heptatonicIntervals[5] = String.valueOf(H);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 3:
                                            heptatonicIntervals[5] = String.valueOf(m);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 4:
                                            heptatonicIntervals[5] = String.valueOf(M);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                    }
                                }

                                break;
                            case 2:
                                heptatonicIntervals[4] = String.valueOf(H);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[5] = String.valueOf('W');
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 2:
                                            heptatonicIntervals[5] = String.valueOf(H);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 3:
                                            heptatonicIntervals[5] = String.valueOf(m);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 4:
                                            heptatonicIntervals[5] = String.valueOf(M);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                    }
                                }

                                break;
                            case 3:
                                heptatonicIntervals[4] = String.valueOf(m);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[5] = String.valueOf('W');
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 2:
                                            heptatonicIntervals[5] = String.valueOf(H);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 3:
                                            heptatonicIntervals[5] = String.valueOf(m);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 4:
                                            heptatonicIntervals[5] = String.valueOf(M);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                heptatonicIntervals[4] = String.valueOf(M);

                                for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                    switch (counterIn) {
                                        case 1:
                                            heptatonicIntervals[5] = String.valueOf('W');
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 2:
                                            heptatonicIntervals[5] = String.valueOf(H);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 3:
                                            heptatonicIntervals[5] = String.valueOf(m);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                        case 4:
                                            heptatonicIntervals[5] = String.valueOf(M);
                                            this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                            scaleCounter = gen.getScaleCounter();
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    invertUsingCollectionsReverse(heptatonicIntervalsAll);
                    break;

                case "5": //Viisi intervallia syötetty
                    scaleCounter = -1;
                    for (int counterOut = 0; counterOut <= 4; counterOut++) {
                        switch (counterOut) {
                            case 1:
                                heptatonicIntervals[5] = String.valueOf('W');
                                this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                            case 2:
                                heptatonicIntervals[5] = String.valueOf(H);
                                this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                            case 3:
                                heptatonicIntervals[5] = String.valueOf(m);
                                this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                            case 4:
                                heptatonicIntervals[5] = String.valueOf(M);
                                this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                        }
                    }
                    invertUsingCollectionsReverse(heptatonicIntervalsAll);
                    break;

                case "6": //Kuusi intervallia syötetty
                    scaleCounter = -1;
                    this.heptatonicIntervalsAll = gen.getSeventhIntervals(heptatonicIntervals, scaleCounter);
                    scaleCounter = gen.getScaleCounter();
                    invertUsingCollectionsReverse(heptatonicIntervalsAll);
                    break;

                case "7": //Seitsemän intervallia syötetty
                    scaleCounter = -1;
                    for (int i = 0; i <= 6; i++) {
                        //"rotate" the intervals Array
                        Collections.rotate(Arrays.asList(heptatonicIntervals), 1);
                        heptatonicIntervalsAll[i] = TextUtils.join("", heptatonicIntervals);
                    }
                    invertUsingCollectionsReverse(heptatonicIntervalsAll);
                    break;


            }
        } else if (!MainActivity.isCheckedAllScales) {


        }

        return heptatonicIntervalsAll;
    }

    private void invertUsingCollectionsReverse(Object[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
    }

}

