package IUexamples.Zeichenprogramm;

public class Rechteck {

    private Punkt punkt;
    private int breite;
    private int hoehe;

    public Rechteck(Punkt punkt, int breite, int hoehe){
        this.punkt = punkt;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int berechneFlaeche(){
        return breite * hoehe;
    }
    public Punkt getPunkt(){
        return punkt;
    }
    @Override
    public String toString(){
        return "Breite: " + this.breite + " Hoehe: " + this.hoehe;
    }

}
