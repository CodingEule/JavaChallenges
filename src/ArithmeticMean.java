import java.util.ArrayList;
import java.util.List;

public class ArithmeticMean {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        System.out.println(mean(numbers));
    }

    static double mean(List<Integer> numbers){

        int sum = 0;
        for( int value : numbers){
            sum += value;
        }
        System.out.println(sum);

        return (double) sum / numbers.size();


    }
}