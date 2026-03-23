public class Secsmallestno {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 1, 3 };
       int smallest = arr[0];
       int secsmallest = arr[0];
       for (int i = 0; i< arr.length; i++)
         {
            if(arr[i]<smallest)
            {
          secsmallest = smallest;
          smallest = arr[i];
            }
            else if (arr[i]<secsmallest || smallest == secsmallest)
            {
                if(smallest != arr[i])
                {
                secsmallest = arr[i];
            }   
        }
       }
       System.out.println("smallestno :"+secsmallest);
       
    }
    
}
