public class Smallestno{
public static void main(String[] args)
{
int [] arr = {3,5,6,1,2,6};
int smallest = arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]<smallest)
{
smallest = arr[i];
}
System.out.println("smallect : "+smallest);
}
}
}
