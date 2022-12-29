package IUexamples.Vergleichen;

import IUexamples.Zeichenprogramm.Punkt;

public class VergleichMitEquals {
    public static void main(String[] args) {

        //Bei String Objekten
        String text1 = new String("Hallo");
        String text2 = new String("Hallo");
        System.out.println(text1.equals(text2));

        // Bei Objekten, hier wird wieder nur die referenz verglichen.
        Punkt punkt1 = new Punkt(10,25);
        Punkt punkt2 = new Punkt(10,25);
        System.out.println("Punkt: " + punkt1.equals(punkt2));

    }
}
