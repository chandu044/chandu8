/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,s=0,r,t;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for (int i = a; i <b; i++)
		{
			t = i;
			while (t > 0)
			{
				r= t % 10;
				s= s + (r*r*r);
				t= t / 10;
			}
	 
			if (s == i)
			{
				System.out.print(" "+i);
			}
			s = 0;
		}
	}
}
