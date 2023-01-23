import java.util.Scanner;

public class ArrayInputOutputUpdate {
    public static void main(String[] args) {
        // taking input in arrays
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[70];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();
        // output in array

        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // updating array
        // marks[0] = 95;
        // marks[0] = marks[0] + 1;
        // System.out.println("math : " + marks[0]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;

        System.out.println("percentage = " + percentage + "%");

        // length of array

        System.out.println("length of array = " + marks.length );
    }

}
