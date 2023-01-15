import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        long fact = 1l;
        for(int i=n; i>=1; i--){
            fact *= i;
        }
        System.out.println("factorial of " + n + " is: " + fact);

    }    
}
