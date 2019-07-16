package com.example.matchmusicscales;

import android.text.TextUtils;

import java.util.Arrays;
import java.util.Collections;

public class IntervalGenerator {

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd
    String[] newIntervals = new String[1800];
    int scaleCounter;

    public String[] getFifthIntervals(String[] intervals, int scaleCounter) {

        for (int counterIn = 0; counterIn <= 4; counterIn++) {
            switch (counterIn) {
                case 1:
                    intervals[4] = String.valueOf('W');
                    for (int k = 0; k <= 4; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 2:
                    intervals[4] = String.valueOf(H);

                    for (int k = 0; k <= 4; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 3:
                    intervals[4] = String.valueOf(m);
                    for (int k = 0; k <= 4; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 4:
                    intervals[4] = String.valueOf(M);

                    for (int k = 0; k <= 4; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
            }
        }
        this.scaleCounter = scaleCounter;

        return newIntervals;

    }

    public String[] getSixthIntervals(String[] intervals, int scaleCounter) {

        for (int counterIn = 0; counterIn <= 4; counterIn++) {
            switch (counterIn) {
                case 1:
                    intervals[5] = String.valueOf('W');
                    for (int k = 0; k <= 5; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 2:
                    intervals[5] = String.valueOf(H);

                    for (int k = 0; k <= 5; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 3:
                    intervals[5] = String.valueOf(m);
                    for (int k = 0; k <= 5; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 4:
                    intervals[5] = String.valueOf(M);

                    for (int k = 0; k <= 5; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
            }
        }
        this.scaleCounter = scaleCounter;

        return newIntervals;

    }

    public String[] getSeventhIntervals(String[] intervals, int scaleCounter) {

        for (int counterIn = 0; counterIn <= 4; counterIn++) {
            switch (counterIn) {
                case 1:
                    intervals[6] = String.valueOf('W');
                    for (int k = 0; k <= 6; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 2:
                    intervals[6] = String.valueOf(H);

                    for (int k = 0; k <= 6; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 3:
                    intervals[6] = String.valueOf(m);
                    for (int k = 0; k <= 6; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
                case 4:
                    intervals[6] = String.valueOf(M);

                    for (int k = 0; k <= 6; k++) {
                        scaleCounter = scaleCounter + 1;
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(intervals), 1);
                        newIntervals[scaleCounter] = TextUtils.join("", intervals);
                    }
                    break;
            }
        }
        this.scaleCounter = scaleCounter;
        return newIntervals;

    }

    public String[] getSixthSeventhIntervals(String[] intervals, int scaleCounter) {
        // haetaan septatonisen asteikon kuudes ja seitsemäs intervalli
        for (int counterInn = 0; counterInn <= 4; counterInn++) {
            switch (counterInn) {
                case 1:
                    intervals[5] = String.valueOf('W');

                    this.newIntervals = getSeventhIntervals(intervals, scaleCounter);
                    scaleCounter = getScaleCounter();

                    break;
                case 2:
                    intervals[5] = String.valueOf(H);

                    this.newIntervals = getSeventhIntervals(intervals, scaleCounter);
                    scaleCounter = getScaleCounter();

                    break;
                case 3:
                    intervals[5] = String.valueOf(m);

                    this.newIntervals = getSeventhIntervals(intervals, scaleCounter);
                    scaleCounter = getScaleCounter();
                    break;
                case 4:
                    intervals[5] = String.valueOf(M);

                    this.newIntervals = getSeventhIntervals(intervals, scaleCounter);
                    scaleCounter = getScaleCounter();
                    break;
            }
        }
        this.scaleCounter = scaleCounter;
        return newIntervals;
    }

    public int getScaleCounter() {

        return scaleCounter;
    }
}
