import java.io.*;
import java.util.*;
import java.math.*;
public class Main 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < 10; i++) 
			{
				BigDecimal sum= new BigDecimal(in.next().trim());
				BigDecimal diff= new BigDecimal(in.next().trim());
				BigDecimal natalia=(sum.subtract(diff)).divide(BigDecimal.valueOf(2));
				BigDecimal klaudia=natalia.add(diff);
				System.out.println(klaudia);
				System.out.println(natalia);
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}