import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in = new Scanner(System.in);
			
			long t=in.nextLong();
			for (long i = 0; i < t; i++) 
			{	
				long m=in.nextLong();
				long number=0;
				long ind_pow=(long)((double)Math.log(m)/(double)Math.log(5)); 
				for (long j = 1; j <= ind_pow; j++)
				{
					number=number+(long)(m/(Math.pow(5,j)));
				}
				System.out.println(""+number);
			}
		}
		catch (Exception  t) {
			t.printStackTrace();
		}
		
	}
}