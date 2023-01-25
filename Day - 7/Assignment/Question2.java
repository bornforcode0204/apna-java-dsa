import java.util.Scanner;

public class Question2 {
    public static boolean isEven(int num){
        return num%2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(isEven(num)){
        System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
