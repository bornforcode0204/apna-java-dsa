import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(isPalindrome(num)){
            System.out.println("Number is Palindrome");
            }else{
                System.out.println("Number is not Palindrome");
            }
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int newNum = 0;

        while(temp > 0){
            int lastDigit = temp % 10;
            newNum = newNum * 10 + lastDigit;
            temp /= 10;
        }
        if(num == newNum){
            return true;
        }
    return false;    
}
}
