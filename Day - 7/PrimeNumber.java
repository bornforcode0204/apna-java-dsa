import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
       // corner cases
       // 1
       if(num == 1){
        return false;
       }
        if(num == 2){
            return true;
        }
        
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }         
        
        return true;
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        sc.close();
        boolean result = isPrime(num);
        if(result == true){
            System.out.println(num + " is a Prime numbre.");
        }else{
            System.out.println(num + " is not Prime numbre.");
        }
    }

    

    
    
}
