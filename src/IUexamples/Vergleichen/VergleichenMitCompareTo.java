package IUexamples.Vergleichen;

public class VergleichenMitCompareTo {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 2022, 9.2);
        Auto auto2 = new Auto("Mercedes", 2022, 10.2);

        int compare = auto.compareTo(auto2);
        System.out.println(compare);

        Kunde kunde1 = new Kunde(2412, "Pascal", "Breuer","M", "23.04.1991");
        Kunde kunde2 = new Kunde(2412, "Pascal", "Breuer","M", "23.04.1991");

        System.out.println(kunde1.compareTo(kunde2));
    }
}
