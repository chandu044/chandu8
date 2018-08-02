/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	
		for(i=1;i<=5;i++)
		{
			b=a*i;
			System.out.print(b+" ");
		}
	}
}
