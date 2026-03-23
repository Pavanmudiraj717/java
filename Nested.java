import java.util.Scanner;
class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);            
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (gender == 'M'|| gender == 'm') {
           System.out.println("Male");
            if(age >= 24) {
                System.out.println("You are eligible for marriage");
                System.out.println("Going to hell");
            }
            else
            {
                System.out.println("You are not eligible for marriage");
                System.out.println("Going to GOA");
            }
        }
            else if(gender == 'F' || gender == 'f')
            {
            System.out.println("Female");
            if(age >= 21) {
                System.out.println("You are eligible for marriage");
                
            }
            else {
                System.out.println("You are not eligible for marriage");
        }
    }
    else {
        System.out.println("Invalid Input");
}
}
}