public class LargestOfThree {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        if(a >=b && a >= c){
            System.out.println("largest is A");
        }else if(b >= c){
            System.out.println("largest is B");
        }else{
            System.out.println("largest is C");
        }
    }
}
