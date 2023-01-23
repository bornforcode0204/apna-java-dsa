import java.util.Scanner;

public class Question1{
    public static double average(double a, double b, double c){
        
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        double a = sc.nextDouble();
        System.out.println("enter 2nd number: ");
        double b = sc.nextDouble();
        System.out.println("enter 3rd number: ");
        double c = sc.nextDouble();
        sc.close();
        System.out.println("The average is = " + average(a, b, c));
    }
}