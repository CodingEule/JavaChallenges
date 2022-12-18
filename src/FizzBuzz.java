public class FizzBuzz {
    public static void main(String[] args) {
        /* Soll durch 1 -100 iterieren,
         * durch 3 teilbar = Fizz
         * durch 5 teilbar = Buzz
         * durch 3 und 5 teilbar = FizzBuzz
         */

        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0){

                if(i % 5 == 0){
                    System.out.println("Challenges");
                }else{
                    System.out.println("Fizz");
                }

            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
