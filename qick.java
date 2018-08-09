import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	          int n, t;
        Scanner sc = new Scanner(System.in);
          n = s.nextInt();
        int c[] = new int[n];
         for (int i = 0; i < n; i++) 
        {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (c[i] > c[j]) 
                {
                    t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print(c[i]+" ");
        }
        
    }
}
