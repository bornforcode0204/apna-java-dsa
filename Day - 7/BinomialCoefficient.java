import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nMinusr_fact = factorial(n-r);

        int bc = n_fact / (r_fact * nMinusr_fact);

        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        System.out.println("Binomial Coefficient is = " + binCoeff(n, r));
    }
}
