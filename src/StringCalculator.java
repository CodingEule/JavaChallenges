public class StringCalculator {
    public static void main(String[] args) {

        System.out.println(add("42,8"));
    }
    static int add(String numbers){
        int sum = 0;
        for(String num : numbers.split(",")){
            if(num == null){
                break;
            }else{
            sum += Integer.parseInt(num);}
        }
        return sum;
    }
}
