class Seclargest
{
public static void main(String[] args)
{
int [] arr = {2,3,4,1,7,8,9,12,45,6,7,9};
int largest = arr[0];
int seclargest = arr[0];
for(int i=0; i<arr.length; i++)
{
if(arr[i]>largest)
{
seclargest = largest;
largest = arr[i];
}
else if (arr[i]> seclargest || seclargest == largest )
{
seclargest = largest;
}
}
System.out.println("Seclargest no :" + seclargest);
}
}

