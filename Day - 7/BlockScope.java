public class BlockScope {
    public static void main(String[] args) {
        {
            int s = 34;
            System.out.println(s);
        }
        // System.out.println(s); // Uncomment this line
    }
}
