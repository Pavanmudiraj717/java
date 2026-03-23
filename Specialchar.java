import java.util.Scanner;

class Specialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check using logical and conditional operators
        if ((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z') || 
            (ch >= '0' && ch <= '9')) {
            
            System.out.println(ch + " is NOT a special character.");
        } 
        else {
            System.out.println(ch + " is a special character.");
        }

        sc.close();
    }
}
