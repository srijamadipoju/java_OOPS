import java.util.Scanner;
class DigitSum
{
public static void main(String args[])
{
int[] arr = {64,89,70,84};

for(int i=0;i<arr.length;i++)
{
int n = arr[i];
int sum = 0;
while(n > 0)
{
sum += n % 10;
n = n/10;
}
System.out.print(sum + " ");
}
}
}