package IUexamples.Zeichenprogramm;

public class Rechteck implements Comparable<Rechteck>{

    private Punkt punkt;
    private int breite;
    private int hoehe;

    public Rechteck(Punkt punkt, int breite, int hoehe) {
        this.punkt = punkt;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public Punkt getPunkt() {
        return punkt;
    }
    public int berechneFlaeche() {
        return breite * hoehe;
    }
    @Override
    public String toString() {
        return "Breite: " + this.breite + " Hoehe: " + this.hoehe;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Rechteck) {
            Rechteck rechteck = (Rechteck) obj;
            return breite == rechteck.breite
                    && hoehe == rechteck.hoehe
                    && punkt.equals(rechteck.punkt);
        } else {
            return super.equals(obj);
        }
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + breite;
        result = prime * result + hoehe;
        result = prime * result + ((punkt == null) ? 0 : punkt.hashCode());
        return result;
    }
 /* Der Rückgabewert muss:
  0 wenn die Objekte gleich sind
  negativ wenn das Objekt auf dem die Methode kleiner ist
  Positiv wenn das Objekt auf dem die Methode größer ist
  */
    @Override
    public int compareTo(Rechteck rechteck){

        return berechneFlaeche() - rechteck.berechneFlaeche();
    }
}
