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

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Rechteck){
            Rechteck rechteck = (Rechteck) obj;
            return breite == rechteck.breite
                    && hoehe == rechteck.hoehe
                    && punkt.equals(rechteck.punkt);
        } else {
            return super.equals(obj);
        }
    }
}
