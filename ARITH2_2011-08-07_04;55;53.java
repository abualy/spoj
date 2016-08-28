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
				long sum=in.nextLong();
				String op=in.next();
				while(!op.contains("="))
				{
					if(op.contains("*")) 
					{
						sum=sum*in.nextLong();
					}
					else if(op.contains("/"))
					{
						sum=sum/in.nextLong();
					}
					else if(op.contains("+"))
					{
						sum=sum+in.nextLong();
					}
					else
					{
						sum=sum-in.nextLong();
					}
					op=in.next();
				}
				System.out.println(sum);
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}