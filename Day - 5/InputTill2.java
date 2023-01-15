import java.util.Scanner;

public class InputTill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }

            System.out.println("your number is: " + num);
        
        }while(true);
    }
    
}
