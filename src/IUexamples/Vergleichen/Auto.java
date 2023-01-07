package IUexamples.Vergleichen;

public class Auto implements Comparable<Auto>{
    private String marke;
    private int baujahr;
    private double spritverbrauch;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getSpritverbrauch() {
        return spritverbrauch;
    }

    public void setSpritverbrauch(double spritverbrauch) {
        this.spritverbrauch = spritverbrauch;
    }

    public Auto(String marke, int baujahr, double spritverbrauch){
        this.marke = marke;
        this.baujahr = baujahr;
        this.spritverbrauch = spritverbrauch;
    }
    @Override
    public int compareTo(Auto auto){
        int compare = baujahr - auto.baujahr;
        if(compare == 0){
            return (int) (spritverbrauch - auto.spritverbrauch);
        }else {return compare;}
    }
}
