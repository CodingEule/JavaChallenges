public class Diamond {
    public static void main(String[] args) {
        System.out.println(renderDiamond('D'));
    }

    static String renderDiamond(char a) {

        for (char b = 'A'; b <= a; b++) {
            if (b == 'A') {
                for (char d = b; d < a; d++) {
                    System.out.print(" ");
                }
                System.out.println(b);
            } else if (b > 'A') {
                for (char d = b; d < a; d++) {
                    System.out.print(" ");
                }
                System.out.print(b);
                if (b > 'B') {
                    char c = b;
                    while (c > 'B') {
                        System.out.print(" ");
                        c--;
                    }
                }
                char c = b;
                while (c > 'A') {
                    System.out.print(" ");
                    c--;
                    if (c == 'A') {
                        System.out.println(b);
                    }
                }
            }

        }
        for (char b = a; b >= 'A'; b--) {
            if (b == a) {
            } else if (b < a) {
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
                    char e = 'A';
                    while (e < b) {
                        System.out.print(" ");
                        e++;
                    }
                    System.out.println(b);
                }else{
                    char d = b;
                    while (d >= 'A') {
                        System.out.print(" ");
                        d--;

                    }
                    if (b == 'A') {
                        break;
                    }
                    System.out.println(b);
                }


            }

        }return "";
    }
}

