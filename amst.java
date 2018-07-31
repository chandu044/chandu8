import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a,r,c=0,t;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	t=a;
	while(a>0)
	{
		r=a%10;
		c=(r*r*r)+c;
		a=a/10;
	}
	if(t==c)
	{
	System.out.println("yes");
	}
	else 
	{
		System.out.println("no");
	}
}
}
