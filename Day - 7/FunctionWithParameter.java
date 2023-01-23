import java.util.Scanner;

public class FunctionWithParameter {
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        System.out.println("Sum is : " + sum(num1, num2));
    }
}
