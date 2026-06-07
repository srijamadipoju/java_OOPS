import java.util.Scanner;
class Nested 
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float cgpa=sc.nextFloat();
if(cgpa>=7.5f)
{
int back=sc.nextInt();
if(back<=2)
{
int coding=sc.nextInt();
if(coding>=2)
{
System.out.println("Eligible for placement");
}
else
{
System.out.println("Improve your communication skills");
}
}
else
{
System.out.println("sorry,you need to clear your backlogs");
}
}
}
}
