import java.util.Scanner;

public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println("The table of "+ n +" is: ");
        for(int i=1; i<=10; i++){

            System.out.println(n*i);
        }
    }    
}
