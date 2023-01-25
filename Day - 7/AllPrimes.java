import java.util.Scanner;
import java.lang.Math;

public class AllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        allPries(num);
    }

    public static void allPries(int num) {
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i=2; i<= Math.sqrt(num); i++){
            if(num %i == 0){
                return false;
            }
        }
        return true;
    }

}
