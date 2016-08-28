import java.io.*;
import java.util.*;
import java.math.*;
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
				long number =in.nextLong();
				BigInteger res=BigInteger.ZERO;
				for (int j = 0; j < number; j++)
				{
					res=(res.add(new BigInteger(in.next()))).mod(BigInteger.valueOf(number));
				}
				if(res.compareTo(BigInteger.ZERO)==0)System.out.println("YES");
				else System.out.println("NO");
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}