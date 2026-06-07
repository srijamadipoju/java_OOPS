import java.util.*;
class segregateElements
{
public static void main(String args[])
{
int[] arr={4,13,7,10,22,39,89,16};
ArrayList<integer> odd_lis = new ArrayList<interger>();
ArrayList<integer> Even_lis = new ArrayList<interger>();

for(int ele:arr)
{
if(ele%2==0)
{
even_lis.add(ele);
}
else
{
odd_lis.add(ele);
}
}
System.out.println(even_lis);
System.out.println(odd_lis);
}
}
