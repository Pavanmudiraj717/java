import java.util.*;   
class invertedhalfpyramid {
    
    public static void main(String[] args) 
    {
       int n=5;
        //outer loop
        for (int i = 1; i >= n; i++) 
        {
            //inner loop -> space part
            for (int j = 1; j <= n-i; j++) 
            {
                System.out.print(" ");
               
            }
            //inner loop -> star part
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
       
    }
}
