import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if(number < 0){
            System.out.println("Number is negative.");
        }else{
            System.out.println("Number is positive.");
        }
    }
}
