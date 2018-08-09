import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	          int n, t;
        Scanner s = new Scanner(System.in);
          n = s.nextInt();
        int b[] = new int[n];
         for (int i = 0; i < n; i++) 
        {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (b[i] > b[j]) 
                {
                    t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        System.out.println(b[n/2]);
    }
}
