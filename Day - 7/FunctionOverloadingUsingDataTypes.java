public class FunctionOverloadingUsingDataTypes {
    // function to calculate integer sum 
    public static int sum(int a, int b, int c) {
        return a + b + c;        
    }

    // function to calculate float sum

    public static float sum(float a, float b, float c) {
        return a + b + c;        
    }

    public static void main(String[] args) {
        System.out.println("Sum is = " + sum(3,4,5));
        System.out.println("Sum is = " + sum(3.3f,4.5f,5.4f));
    }
}
