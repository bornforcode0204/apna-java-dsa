public class LargestinArray {
    public static int largestNumber(int numbers[]){
        int max = Integer.MIN_VALUE; // - infinity
        int min = Integer.MAX_VALUE; // + infinity
        // System.out.println(max);
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min ){
                min = numbers[i];
            }
        }
        System.out.println("smallest value of array is : " + min);
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        int max = largestNumber(numbers);

        System.out.println("lagrgest number is : " + max);
    }
}
