package IUexamples.Zeichenprogramm;

public class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj instanceof Punkt) {
            Punkt punkt = (Punkt) obj;
            return x == punkt.x && y == punkt.y;
        } else {
            return super.equals(obj);
        }
    }
    @Override
    public String toString(){
        return "Koordinaten X: " + this.x + "\n" +
                "Koordinate Y: " + this.y;
    }
}
