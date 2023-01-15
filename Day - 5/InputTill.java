import java.util.Scanner;

public class InputTill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int i=1; i<=100; i++){
        //     int num = sc.nextInt();
        //      if(num % 10 == 0){
        //         break;
        //      }
        //     }
        //     sc.close();
        // System.out.println("Limit utilized!!");

        do{
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
             }
            System.out.println(num);
        }while(true);
        sc.close();
    }
}
