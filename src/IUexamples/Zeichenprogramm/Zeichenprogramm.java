package IUexamples.Zeichenprogramm;

public class Zeichenprogramm {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(10, 25);
        Rechteck rechteck1 = new Rechteck(punkt1, 15, 22);
        rechteck1.berechneFlaeche();
        System.out.println(rechteck1.toString());
    }
}
