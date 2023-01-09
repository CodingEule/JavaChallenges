package IUexamples.Vergleichen;

public class OnlineShop {
    public static void main(String[] args) {

        Kunde k1 = new Kunde(24232,"Ralf", "Herman", "W", "23.04.1991");
        Kunde k2 = k1.clone();

        System.out.println(k1.equals(k2));
    }
}
