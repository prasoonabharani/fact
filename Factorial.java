import java.util.*;
class Factorial
{ 
public static void main(String args[])
{ int num;
Scanner sc= new Scanner(System.in);
System.out.println("enter a number=");
 num=sc.nextInt();
System.out.println("FACTORIAL="+fact(num));}
 static int fact (int n)
{
if(n<=1)
{return 1;}
else
{
return n*fact(n-1);
}}
}
