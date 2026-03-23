public class Greatestof4no {
    public static void main(String[] args) {
        int a=10, b=18 ,c=45, d=100;
        System.out.println((a>b && a>c && a>d)? a:(b>c && b>d)? b:(c>d)? c:d);
    }
    
}
