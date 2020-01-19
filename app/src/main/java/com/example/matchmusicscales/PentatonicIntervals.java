package com.example.matchmusicscales;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Collections;

public class PentatonicIntervals {

    public static LinkedHashSet<String> hashList;
    private String[] pentatonicIntervals = new String[5];

    public String[] pentatonicIntervalsAll = new String[80];
    //public String[] myIntervalsCleaned = new String[54612];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    CheckIntervals empty = new CheckIntervals();

    public void clearIntervals() {
        empty.getArrayCleared(pentatonicIntervals);
        empty.getArrayCleared(pentatonicIntervalsAll);
        charCounter = -1;
    }

    ;

    private int charCounter = -1;
    private int scaleCounter = -1;

    public void setPentatonicInterval(String intervallit) {

        charCounter = charCounter + 1;
        pentatonicIntervals[charCounter] = intervallit;

    }

    public String[] getAllPentatonicIntervals(String intervalCount, boolean isAllScales) {

        IntervalGenerator gen = new IntervalGenerator();
        if (isAllScales) {

            switch (intervalCount) {

                case "3": //intervalleja kolme

                    for (int counterOut = 0; counterOut <= 4; counterOut++) {
                        switch (counterOut) {
                            case 1:
                                pentatonicIntervals[3] = String.valueOf(W);

                                pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();

                                break;
                            case 2:
                                pentatonicIntervals[3] = String.valueOf(H);

                                pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();

                                break;
                            case 3:
                                pentatonicIntervals[3] = String.valueOf(m);

                                pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                            case 4:
                                pentatonicIntervals[3] = String.valueOf(M);

                                pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                                scaleCounter = gen.getScaleCounter();
                                break;
                        }
                    }
                    invertUsingCollectionsReverse(pentatonicIntervalsAll);
                    break;

                case "4": //intervalleja neljä

                    pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                    scaleCounter = gen.getScaleCounter();
                    invertUsingCollectionsReverse(pentatonicIntervalsAll);
                    break;

                case "5": //intervalleja viisi
                    for (int i = 0; i <= 4; i++) {
                        //"rotate" the pentatoninIntervals Array
                        Collections.rotate(Arrays.asList(pentatonicIntervals), 1);
                        pentatonicIntervalsAll[i] = TextUtils.join("", pentatonicIntervals);
                    }
                    invertUsingCollectionsReverse(pentatonicIntervalsAll);
                    break;
            }
        } else if (!isAllScales) {

            switch (intervalCount) {

                case "3": //intervalleja kolme


                    break;

                case "4": //intervalleja neljä


                    break;

                case "5": //intervalleja viisi (OK)

                        pentatonicIntervalsAll[0] = TextUtils.join("", pentatonicIntervals);

                    break;
            }
        }
        return pentatonicIntervalsAll;
    }

    private void invertUsingCollectionsReverse(Object[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
    }
}
