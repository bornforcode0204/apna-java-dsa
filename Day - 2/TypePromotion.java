public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);

        int n1 = 10;
        float n2 = 20.33f;
        long n3 = 23;
        double n4 = 30;
        double t = n1 + n2 + n3 +n4;

        System.out.println(t);

        byte b1 = 5;
        byte a1 = (byte) (b1 * 2);
        System.out.println(a1);
        // int $ = 24;
    }
}

// Type promotion is a phinomina in Java
// Type Promotion in Expressions
// 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
// 2. If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.
