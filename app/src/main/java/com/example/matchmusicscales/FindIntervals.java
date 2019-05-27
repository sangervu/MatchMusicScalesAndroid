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

    FindIntervals(String intervallit) {

        char H = 'H'; //Half Step
        char W = 'W'; // Whole Step
        char m = 'm'; // minor 3rd
        char M = 'M'; // Major 3rd

        //MusicScales scales = new MusicScales();
        //PentatonicIntervals pentatonic = new PentatonicIntervals();
        //HexatonicIntervals hexatonic = new HexatonicIntervals();
        HeptatonicIntervals heptatonic = new HeptatonicIntervals();
        OctatonicIntervals octatonic = new OctatonicIntervals();

        CheckIntervals intervalCheck1 = new CheckIntervals();
        CheckIntervals intervalCheck2 = new CheckIntervals();
        CheckIntervals intervalCheck3 = new CheckIntervals();
        CheckIntervals intervalCheck4 = new CheckIntervals();

        //System.out.println("Syötä intervallit W, H, m, tai M (min kolme ja max kahdeksan intervallia)");

        int intervalliLaskuri = intervallit.length();

        switch (intervalliLaskuri) {

            case 3: // annettu kolme intervallia
                for (int i = 0; i < intervallit.length(); i++) {

                    //pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                /*
                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll3 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta3 = intervalCheck.getMyTrueScales(pentatonicIntervalsAll3);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta3.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheck111 = new CheckIntervals();
                String[] hexatonicIntervalsAll3 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa3 = intervalCheck111.getMyTrueScales(hexatonicIntervalsAll3);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa3.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheck11 = new CheckIntervals();
                String[] heptatonicIntervalsAll3 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta3 = intervalCheck11.getMyTrueScales(heptatonicIntervalsAll3);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta3.length == 0) {
                    System.out.println("N.A.");
                }
                */
                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
                    System.out.println("N.A.");
                }*/

                break;

            case 4: // annettu neljä intervallia (OK)
                for (int i = 0; i < intervallit.length(); i++) {

                    //pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                /*
                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll4 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta4 = intervalCheck.getMyTrueScales(pentatonicIntervalsAll4);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta4.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheck2 = new CheckIntervals();
                String[] hexatonicIntervalsAll4 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa4 = intervalCheck2.getMyTrueScales(hexatonicIntervalsAll4);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa4.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheck3 = new CheckIntervals();
                String[] heptatonicIntervalsAll4 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta4 = intervalCheck3.getMyTrueScales(heptatonicIntervalsAll4);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta4.length == 0) {
                    System.out.println("N.A.");
                }
                */
                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
                    System.out.println("N.A.");
                }*/

                break;

            case 5: //annettu viisi intervallia (OK)

                for (int i = 0; i < intervallit.length(); i++) {

                    //pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                /*
                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll5 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta5 = intervalCheck.getMyTrueScales(pentatonicIntervalsAll5);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheck5 = new CheckIntervals();
                String[] hexatonicIntervalsAll5 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa5 = intervalCheck5.getMyTrueScales(hexatonicIntervalsAll5);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa5.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheck6 = new CheckIntervals();
                String[] heptatonicIntervalsAll5 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta5 = intervalCheck6.getMyTrueScales(heptatonicIntervalsAll5);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta5.length == 0) {
                    System.out.println("N.A.");
                }
                */
                //Oktatoniset asteikot
                String[] octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta8) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta8.length == 0) {
                    System.out.println("N.A.");
                }*/

                break;

            case 6: //annettu kuusi intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    //hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                    //heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }
                /*
                //Hexatoniset asteikot
                String[] hexatonicIntervalsAll6 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa6 = intervalCheck.getMyTrueScales(hexatonicIntervalsAll6);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa6.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheck8 = new CheckIntervals();
                String[] heptatonicIntervalsAll6 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta6 = intervalCheck8.getMyTrueScales(heptatonicIntervalsAll6);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta6.length == 0) {
                    System.out.println("N.A.");
                }
                */
                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck3.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
                    System.out.println("N.A.");
                }*/

                break;

            case 7: //annettu seitemän intervallia (OK)

                for (int i = 0; i < intervallit.length(); i++) {

                    heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForHepta = intervalCheck1.getMyTrueScales(heptatonicIntervalsForAll);

                /*System.out.println("Heptatoniset asteikot:");

                for (String t : myIntervalsCleanedHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta.length == 0) {
                    System.out.println("N.A.");
                }
                */
                // Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck2.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
                    System.out.println("N.A.");
                }*/

                break;

            case 8: // annettu kahdeksan intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                }

                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                this.myIntervalsCleanedForOcta = intervalCheck1.getMyTrueScales(octatonicIntervalsForAll);

                //System.out.println("Oktatoniset asteikot:");
                /*for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
                    System.out.println("N.A.");
                }*/
                break;

        }
    }
}
