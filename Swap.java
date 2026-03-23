public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Swapping values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
    
}
