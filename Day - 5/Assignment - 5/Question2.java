import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, choice;
        int evenSum = 0, oddSum = 0;
        do{
            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

             choice = sc.nextInt();
        }while(choice == 1);
        sc.close();
        System.out.println("Sum of even numbers: "+ evenSum);
        System.out.println("Sum of odd numbers: "+ oddSum);
    }
}
