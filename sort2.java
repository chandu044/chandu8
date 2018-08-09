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
          n = sc.nextInt();
        int d[] = new int[n];
         for (int i = 0; i < n; i++) 
        {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (d[i] > d[j]) 
                {
                    t = d[i];
                    d[i] = d[j];
                    d[j] = t;
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print(d[i]+" ");
        }
        
    }
}
