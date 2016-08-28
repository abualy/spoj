import java.io.*;
import java.util.*;
public class Main 
{
	static long m;
	static long n;
	static boolean isItPrime(long calc)
	{
		if((calc%2==0 && calc!=2) || calc<2) return false;
		for(long i=3;i*i<=calc;i=i+2)
		{
			if(calc%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("a.in"));
		long t=in.nextInt();
		for (int i = 0; i < t; i++) 
		{	
			m=in.nextLong();
			n=in.nextLong();
			for(long k=m;k<=n;k++)
			{
				if(isItPrime(k)) System.out.println(k);
			}
			System.out.println();
		}
		in.close();
	}
}