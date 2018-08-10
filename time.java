/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int b=a%60;
	int c=a/60;
	System.out.print(c+" "+b);
	}
}
