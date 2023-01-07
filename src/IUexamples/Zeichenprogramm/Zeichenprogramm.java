package IUexamples.Zeichenprogramm;

public class Zeichenprogramm {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(10, 25);
        Rechteck rechteck1 = new Rechteck(punkt1, 15, 22);
        Rechteck rechteck2 = new Rechteck(punkt1, 22, 15);
        Rechteck rechteck3 = new Rechteck(punkt1, 10, 10);
        rechteck1.berechneFlaeche();
        System.out.println(rechteck1.toString());

        System.out.println(rechteck1.hashCode() == rechteck1.hashCode());
        System.out.println(punkt1);

        if(rechteck1.compareTo(rechteck2) < 0){
            System.out.println("Kleiner");
        }else if(rechteck1.compareTo(rechteck2) > 0){
            System.out.println("Größer");
        }else {
            System.out.println("Gleich");
        }

        int compare = rechteck1.compareTo(rechteck3);

        if(compare < 0){
            System.out.println("Kleiner");
        }else if(compare > 0){
            System.out.println("Größer");
        }else {
            System.out.println("Gleich");
        }
    }
}
