import java.util.Scanner;
class SquarePattern
{
    public static void main (String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        int s = Scanner.nextInt();
        int p = Scanner.nextInt();
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=p;j++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
       
    }
}