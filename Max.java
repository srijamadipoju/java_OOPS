import java.util.Scanner;
class Max
{
public static void main(String args[])
{

int[] arr={28,77,89,70,64,34};

int max=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i] > max)
{
max=arr[i];
}
}
System.out.println(max);
}
}