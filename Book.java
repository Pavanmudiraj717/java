public class Book {
    int a ;
    double b ;

    public Book(int s, double p) {
        //loi
        a = s;
        b = p;
    }
    public void printBookDetails() {
        System.out.println("Book Name: " + a);
        System.out.println("Author: " + b);
        System.out.println("-------------------------");
    }
}
