import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Binary of " + num + " is = " + decToBin(num));
    }

    public static int  decToBin(int decNum){
        int binNum = 0;
        int pow = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (int) (rem * Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        return binNum;
    }
}
