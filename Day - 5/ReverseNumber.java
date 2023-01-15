public class ReverseNumber {
    public static void main(String[] args) {
        int num = 10899;
        int lastDigit = 0;
        int ReverseNumber = 0;
        while(num > 0){
            lastDigit = num % 10;
            ReverseNumber = ReverseNumber * 10 + lastDigit; // syso(lastDigit)
            num = num / 10;
        }
        System.out.println(ReverseNumber);
    }
}
