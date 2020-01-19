package com.example.matchmusicscales;
import android.view.Menu;
import android.view.MenuItem;

public class FindIntervals {

    //Pentatoniset asteikot
    static String[] myIntervalsCleanedForPenta;
    private String[] pentatonicIntervalsForAll;
    //Hexatoniset asetikot
    static String[] myIntervalsCleanedForHexa;
    private String[] hexatonicIntervalsForAll;
    //Henptatoniset asetikot
    static String[] myIntervalsCleanedForHepta;
    private String[] heptatonicIntervalsForAll;
    //Octatoniset asetikot
    static String[] myIntervalsCleanedForOcta;
    private String[] octatonicIntervalsForAll;

    static String[] tyhjä = {"There are no scales"};

    static int intervalliLaskuri;

    boolean isCheckedAllScales = MainActivity.isCheckedAllScales;

    MenuItem menuItemPentatonic;
    MenuItem menuItemHexatonic;
    MenuItem menuItemHepatatonic;


    public void setIntervals(String intervallit) {

        char H = 'H'; //Half Step
        char W = 'W'; // Whole Step
        char m = 'm'; // minor 3rd
        char M = 'M'; // Major 3rd


        //MusicScales scales = new MusicScales();
        PentatonicIntervals pentatonic = new PentatonicIntervals();
        HexatonicIntervals hexatonic = new HexatonicIntervals();
        HeptatonicIntervals heptatonic = new HeptatonicIntervals();
        OctatonicIntervals octatonic = new OctatonicIntervals();

        CheckIntervals intervalCheck1 = new CheckIntervals();
        CheckIntervals intervalCheck2 = new CheckIntervals();
        CheckIntervals intervalCheck3 = new CheckIntervals();
        CheckIntervals intervalCheck4 = new CheckIntervals();

        intervalliLaskuri = intervallit.length();

        switch (intervalliLaskuri) {

            case 3: // annettu kolme intervallia

                pentatonic.clearIntervals();
                hexatonic.clearIntervals();
                octatonic.clearIntervals();
                heptatonic.clearIntervals();

                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 4: // annettu neljä intervallia

                pentatonic.clearIntervals();
                hexatonic.clearIntervals();
                octatonic.clearIntervals();
                heptatonic.clearIntervals();

                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 5: //annettu viisi intervallia

                pentatonic.clearIntervals();
                hexatonic.clearIntervals();
                octatonic.clearIntervals();
                heptatonic.clearIntervals();

                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 6: //annettu kuusi intervallia

                hexatonic.clearIntervals();
                octatonic.clearIntervals();
                heptatonic.clearIntervals();

                for (int i = 0; i < intervallit.length(); i++) {

                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck1.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck2.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForOcta = intervalCheck3.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 7: //annettu seitemän intervallia

                octatonic.clearIntervals();
                heptatonic.clearIntervals();

                for (int i = 0; i < intervallit.length(); i++) {

                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck1.getMyTrueScales(heptatonicIntervalsForAll);

                // Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()),isCheckedAllScales);
                this.myIntervalsCleanedForOcta = intervalCheck2.getMyTrueScales(octatonicIntervalsForAll);

                break;
        }
    }
}
