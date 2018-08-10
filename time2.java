/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int h1,m1,h2,m2,a,b;
	Scanner s=new Scanner(System.in);
	h1=s.nextInt();
	m1=s.nextInt();
	h2=s.nextInt();
	m2=s.nextInt();
	if(h1<h2)
	{
	 a=h2-h1;	
	}
	else
	{
	 a=h1-h2;
	}
	if(m1<m2)
	{
	 b=m2-m1;
	}
	else
	{
	 b=m1-m2;
	}  
	System.out.print(a+" "+b);
	}
}
