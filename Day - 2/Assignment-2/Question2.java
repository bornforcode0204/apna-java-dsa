import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sideOfsquare = sc.nextInt();
        sc.close();

        int area = sideOfsquare * sideOfsquare;
        System.out.println(area);
    }    
}
