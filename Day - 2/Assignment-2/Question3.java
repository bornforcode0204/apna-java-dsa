import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();

        float total = pen + pencil + eraser;
        float gst = ((total*18)/100);
        float bill = total + gst;
        System.out.println("Total price : " + total);
        System.out.println("GST : " + gst);
        System.out.println("Your Bill : " + bill);

    }
}
