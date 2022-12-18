
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
    public static void main(String[] args) {

        System.out.println(findPrime(1, 1000));

    }
    static List findPrime(int start, int end){
        List<Integer> prime = new ArrayList<>();

        while(start < end){

            for(int i = 1; i <= start; i++){
                if(start % i == 0 && i != 1 && i != start){
                    break;
                }else if(i == start){
                    prime.add(start);
                }
            }start++;
        }return prime;
    }
}
