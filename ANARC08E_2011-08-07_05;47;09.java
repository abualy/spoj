import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			int b=in.nextInt();
			while(a!=-1 || b!=-1)
			{	
				if(a==1 || b==1) System.out.println(a+"+"+b+"="+(a+b));
				else System.out.println(a+"+"+b+"!="+(a+b));
				a=in.nextInt();
				b=in.nextInt();
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}