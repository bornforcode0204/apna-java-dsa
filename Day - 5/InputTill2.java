import java.util.Scanner;

public class InputTill2 {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }

            System.out.println("your number is: " + num);
        
            sc.close();
        }while(true);
    }
    
}
