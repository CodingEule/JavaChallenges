package IUexamples.Vergleichen;

public class VergleichReferenz {
    public static void main(String[] args) {
        int zahl1 = 1;
        int zahl2 = 1;
        System.out.println(zahl1 == zahl2);


        // Bei Objekten werden die Referenzen verglichen.
        String text1 = new String("Hallo");
        String text2 = new String("Hallo");
        System.out.println(text2 == text1);

        //text3 verweist auf text1 deswegen ergibt es true
        String text3 = text1;
        System.out.println(text1 == text3);
    }
}
