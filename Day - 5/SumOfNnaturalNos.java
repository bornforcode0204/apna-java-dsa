import java.util.Scanner;

public class SumOfNnaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        sc.close();

        while(counter <= range){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
