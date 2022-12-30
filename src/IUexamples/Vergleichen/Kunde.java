package IUexamples.Vergleichen;

public class Kunde {

    private int kundennummer;
    private String vorname;
    private String name;
    private String geschlecht;
    private String geburtsdatum;

    public Kunde(int kundennumer, String vorname, String name, String geschlecht, String geburtsdatum){
        this.kundennummer = kundennumer;
        this.vorname = vorname;
        this.name = name;
        this.geschlecht = geschlecht;
        this.geburtsdatum = geburtsdatum;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Kunde){
            Kunde k = (Kunde) obj;
            return vorname.equals(k.vorname) &&
                    name.equals(k.name) &&
                    geburtsdatum.equals(k.geburtsdatum);
        } else {
            return super.equals(obj);
        }
    }
}
