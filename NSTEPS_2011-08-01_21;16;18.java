import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner in = new Scanner(System.in);
			int t=in.nextInt();
			for (int i = 0; i < t; i++) 
			{	
				int a=in.nextInt();
				int b=in.nextInt();
				if(b!=a && b!=a-2)
				{
					System.out.println("No Number");
				}
				else
				{
					if(a%2==0)
					{
						System.out.println((a+b));
					}
					else 
					{
						System.out.println((a+b-1));
					}
				}
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}