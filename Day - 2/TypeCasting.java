public class TypeCasting {
    public static void main(String[] args) {
        float a = 2.1f;
        int b = (int) a;
        System.out.println(b);
        char ch = 'a';
        int n = ch;
        System.out.println(n); 
    }
}

// when destination type < source type is called Type casting(narrowing conversion explicit conversion)