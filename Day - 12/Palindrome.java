import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string : ");
        String str = sc.nextLine();
        sc.close();

    //    String revStr = reverseString(str);
    //    if(str == revStr){
    //     System.out.println(str + " is a Palindrome!");
    //    }else{
    //     System.out.println(str + " is not a Palindrome!");
    //    }

    if(reverseString(str)){
            System.out.println(str + " is a Palindrome!");
           }else{
            System.out.println(str + " is not a Palindrome!");
           }
        
    }

    // public static String reverseString(String str) {
    //     // String temp = str;
    //     String reverseStr = "";
    //     for(int i=str.length()-1; i>=0; i--){
    //         reverseStr += str.charAt(i);
    //     } 
    //  return reverseStr;
    // }
    //  <--------------Optymised Method ------>
    public static Boolean reverseString(String str) {
        for(int i=0; i<=(str.length()/2); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
   
}