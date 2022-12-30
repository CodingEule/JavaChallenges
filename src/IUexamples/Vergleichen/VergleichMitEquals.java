package IUexamples.Vergleichen;

import IUexamples.Zeichenprogramm.Punkt;

public class VergleichMitEquals {
    public static void main(String[] args) {

        //Bei String Objekten
        String text1 = new String("Hallo");
        String text2 = new String("Hallo");
        System.out.println(text1.equals(text2));

        // Bei Objekten, hier wird wieder nur die referenz verglichen.
        //nicht mehr da eigene equals Methode implementiert.
        Punkt punkt1 = new Punkt(10,25);
        Punkt punkt2 = new Punkt(10,25);
        System.out.println("Punkt: " + punkt1.equals(punkt2));

        // Mit eigener überschriebenen equals methode in Kunde.
        Kunde kunde1 = new Kunde(2412, "Pascal", "Breuer","M", "23.04.1991");
        Kunde kunde2 = new Kunde(4412, "Lara", "Schnublu", "W", "23.02.1993");

        System.out.println("kunde2 mit kunde1 = " + kunde2.equals(kunde1)  + " kunde2 mit kunde2 = " +  kunde2.equals(kunde2));

    }
}
