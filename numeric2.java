
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
			char b;
		int i;
		int f=0;
		for(i=0;i<str.length();i++)
		{
			b=str.charAt(i);
			if(Character.isLetter(b))
			{
				f=1;
			}
		}
		if(f==1)
			System.out.println("no");
		else
		System.out.println("yes");

	}
}
