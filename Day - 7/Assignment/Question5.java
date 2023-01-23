import java.util.*;

public class Question5 {
    
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        num = num / 10;
        }
    return sum;  
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");

        int num = sc.nextInt();
        sc.close();

        System.out.println("Sum of digits is : " + sumOfDigits(num));
    }
}
