import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	          int h, t;
        Scanner sc = new Scanner(System.in);
          h = sc.nextInt();
        int d[] = new int[h];
         for (int i = 0; i < h; i++) 
        {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < h; i++) 
        {
            for (int j = i + 1; j < h; j++) 
            {
                if (d[i] > d[j]) 
                {
                    t = d[i];
                    d[i] = d[j];
                    d[j] = t;
                }
            }
        }
        
        for (int i = 0; i < h; i++) 
        {
            System.out.print(d[i]+" ");
        }
        
    }
}
