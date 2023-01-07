package IUexamples.Vergleichen;

public class VergleichMitHashCode {
    public static void main(String[] args) {

        // hashCode erzeugen in eigens implementierter Klasse in Kunde
        Kunde kunde1 = new Kunde(2412, "Pascal", "Breuer","M", "23.04.1991");
        Kunde kunde2 = new Kunde(4412, "Lara", "Schnublu", "W", "23.02.1993");

        System.out.println(kunde1.hashCode());
        System.out.println(kunde2.hashCode());
        System.out.println(kunde1.hashCode() == kunde2.hashCode());

    }

    }

