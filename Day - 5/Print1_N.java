import java.util.Scanner;

public class Print1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int counter = 1;

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
    }    
}
