package LinkedInLearning;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
    public static void main(String[] args) {
        System.out.println(renderDiamond('D'));
    }

    static String renderDiamond(char a) {
        List<String> stringList = new ArrayList<>();

        //Schleife für den durchlauf.
        for (char b = 'A'; b <= a; b++) {
            //wenn b gleich a ist soll er leerzeichen ausgeben wie anzahl der
            // schritte vorhanden sind und gibt A aus.
            if (b == 'A') {
                for (char d = b; d < a; d++) {
                    System.out.print(" ");
                }
                System.out.println(b);
            //Wenn b größer als A dann gib leerzeichen aus und am ende b
            } else {
                for (char d = b; d < a; d++) {
                    System.out.print(" ");
                }
                System.out.print(b);
                // FÜr die eine Hälfte der Leerzeichen sobald b größer als B ist.
                // Zählt Rückwärts
                if (b > 'B') {
                    char c = b;
                    while (c > 'B') {
                        System.out.print(" ");
                        c--;
                    }
                }
                //Für die andere Hälfte der leerzeichen zählt vorwärst
                char c = b;
                while (c > 'A') {
                    System.out.print(" ");
                    c--;
                    if (c == 'A') {
                        System.out.println(b);
                    }
                }
            }

        }// die untere hälfte des Diamanten
        for (char b = a; b >= 'A'; b--) {
            if (b < a) {
                char c = b;
                while (c <= a) {
                    if (c == a) {
                        System.out.print(b);
                        break;
                    }
                    System.out.print(" ");
                    c++;
                }
                if (b > 'B') {
                    char e = b;
                    while (e > 'B') {
                        System.out.print(" ");
                        e--;
                    }
                }
                    char d = b;
                    while (d > 'A') {
                        System.out.print(" ");
                        d--;

                    }
                    if (b == 'A') {
                        break;
                    }
                    System.out.println(b);
                }


            }
            return "";
    }
}

