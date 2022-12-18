import java.text.NumberFormat;
import java.util.Scanner;

public class VATCalculator {

    public String renderInvoice(double price){

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);


        double mwStInterest = 0.19;
        double mwSt = price * mwStInterest;
        double brutto = price + mwSt;




        return "Netto: " + price + " MwSt.-Anteil: " +
                numberFormat.format(mwSt) + " Brutto: " + numberFormat.format(brutto);
    }
    public static void main(String[] args) {
        System.out.print("Nenne deinen Netto Preis: ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();

        VATCalculator vatCalculator = new VATCalculator();

        System.out.println(vatCalculator.renderInvoice(price));
    }

}
