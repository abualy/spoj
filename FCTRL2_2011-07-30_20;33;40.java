//import java.io.*;
import java.math.*;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)//throws IOException
	{
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("b.in"));
		int t=in.nextInt();
		for (int i = 0; i < t; i++) 
		{	
			int m=in.nextInt();
			BigInteger factorial=BigInteger.ONE;
			for (int j = 2; j <= m; j++) 
			{
				factorial=factorial.multiply(BigInteger.valueOf(j));
			}
			
			System.out.println(factorial);
		}
	}
}