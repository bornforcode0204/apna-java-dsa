import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //here we are creating object of scanner class
        String input = sc.next();
        sc.close();
        System.out.println(input);
    }
}
// import java.util.*;(util is a package)
// Scanner sc = new Scanner(System.in);
// next - take only one token
// nextLine - take entire line
// nextInt
// nextByte
// nextFloat
// nextDouble
// nextBoolean
// nextShort
// nextLong
// echo - means print