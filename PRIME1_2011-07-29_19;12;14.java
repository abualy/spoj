import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("a.in"));
		long t=in.nextInt();
		for (int i = 0; i < t; i++) 
		{	
			long m=in.nextLong();
			long n=in.nextLong();
			for(long k=(m<n)?m:n;k<=((m<n)?n:m);k++)
			{
				if(isItPrime(k)) System.out.println(k);
			}
			System.out.println();
		}
		in.close();
	}
	static boolean isItPrime(long calc)
	{
		if((calc%2==0 && calc!=2) || calc<2) return false;
		for(long i=3;i*i<=calc;i=i+2)
		{
			if(calc%i==0) return false;
		}
		return true;
	}
}