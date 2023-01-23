import java.lang.Math;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Decimal of " + num + " is = " + binaryToDecimal(num));
    }

    public static int binaryToDecimal(int num){
        int decimalNum = 0;
        int pow = 0;
        while(num > 0){
            int lastDigit = num % 10;

             decimalNum = decimalNum + (int)(lastDigit * Math.pow(2, pow) );
             num = num / 10;
             pow++;
        }
        return decimalNum;
    }
}
