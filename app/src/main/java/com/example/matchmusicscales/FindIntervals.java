package com.example.matchmusicscales;

public class FindIntervals {

    //Pentatoniset asteikot
    static String[] myIntervalsCleanedForPenta;
    static String[] pentatonicIntervalsForAll;
    //Hexatoniset asetikot
    static String[] myIntervalsCleanedForHexa;
    static String[] hexatonicIntervalsForAll;
    //Henptatoniset asetikot
    static String[] myIntervalsCleanedForHepta;
    static String[] heptatonicIntervalsForAll;
    //Octatoniset asetikot
    static String[] myIntervalsCleanedForOcta;
    static String[] octatonicIntervalsForAll;

    private int intervalliLaskuri;

    public void setIntervals(String intervallit) {

        char H = 'H'; //Half Step
        char W = 'W'; // Whole Step
        char m = 'm'; // minor 3rd
        char M = 'M'; // Major 3rd

        /*
        CheckIntervals clear = new CheckIntervals();

        clear.getArrayCleared(myIntervalsCleanedForPenta);
        clear.getArrayCleared(myIntervalsCleanedForHexa);
        clear.getArrayCleared(myIntervalsCleanedForHepta);
        clear.getArrayCleared(myIntervalsCleanedForOcta);
        clear.getArrayCleared(pentatonicIntervalsForAll);
        clear.getArrayCleared(hexatonicIntervalsForAll);
        clear.getArrayCleared(heptatonicIntervalsForAll);
        clear.getArrayCleared(octatonicIntervalsForAll);
        */

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
                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 4: // annettu neljä intervallia
                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 5: //annettu viisi intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                //Pentatoniset asteikot
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 6: //annettu kuusi intervallia

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
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck3.getMyTrueScales(octatonicIntervalsForAll);

                break;

            case 7: //annettu seitemän intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck1.getMyTrueScales(heptatonicIntervalsForAll);

                // Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck2.getMyTrueScales(octatonicIntervalsForAll);

                break;
        }
    }
}
