package JavaIstAuchEineInsel;

public class Umsatz {
    public static int count5PercentJumps(int[] dailyGains){
        int jumps = 0;

        for(int i = 0; i < dailyGains.length - 1; i++){
            int fivePercent = dailyGains[i] / 100 * 5;
            if(dailyGains[i+1] >= (dailyGains[i] + fivePercent)){

                jumps++;
            }
        }return jumps;
    }

    public static void main(String[] args) {
        int[] dailyGains = {1000, 2000, 500, 9000, 9010};

        System.out.println(count5PercentJumps(dailyGains));

    }
}
