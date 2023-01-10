import java.util.Scanner;

public class SumUsingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = a + b;

        System.err.println(sum);
    }
}
