import java.util.*;
import java.math.*;
public class Main 
{
	public static void main(String[] args)
	{
		
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			int b=in.nextInt();
			
			while(a!=0 || b!=0)
			{	
				BigInteger m=new BigInteger(String.valueOf(a));
				m=m.pow(b);
				System.out.println(m);
				a=in.nextInt();
				b=in.nextInt();
			}

	}
}