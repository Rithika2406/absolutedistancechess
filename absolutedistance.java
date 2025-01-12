import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int a=S.nextInt();
		    int b=S.nextInt();
		    int c=S.nextInt();
		    int d=S.nextInt();
		    int x=Math.abs(a-c);
		    int y=Math.abs(b-d);
		    System.out.println(Math.max(x,y));
		}

	}
}
