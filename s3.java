import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p=0;
    Scanner s=new Scanner(System.in);
n=s.nextInt();
   while(n!=0)
{
int r=n%10;
   p=p*10+r;
 n=n/10;
}
System.out.println(p);
	}
}
