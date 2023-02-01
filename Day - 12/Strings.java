import java.util.Scanner;

public class Strings {
    public static void printLetters(String fullName){
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
    public static void main(String[] args) {

        // declaration

        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str1 = new String("asd");

        // taking string input

        Scanner sc = new Scanner(System.in);

        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println(name);

        //length()

        // String fullName = "Zeeva Singh";
        // System.out.println(fullName.length());

        // Concatenation

        // String firstName = "Zeeva";
        // String lastName = "Singh";

        // System.out.println(firstName +" " +lastName);

        String fullName = "Zeeva Singh";
        // System.out.println(fullName.charAt(3));
        printLetters(fullName);

        
    }
    
}