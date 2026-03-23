
import java.util.Scanner;

class DynamicInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();  
        int sum = a + b + c;
        System.out.println("The sum is: " + sum);
    }
}