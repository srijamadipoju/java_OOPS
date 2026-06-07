import java.util.Scanner;
class Missing
{
public static void main(String args[])
{
int[] arr={7,4,1,3,5,2};
int n = arr.length + 1;

int expectedSum = n * (n+1) / 2;
int actualSum = 0;

for(int num : arr) 
{
actualSum += num;
}
int missing = expectedSum - actualSum;
System.out.println("Missing number : " +missing);
}
}