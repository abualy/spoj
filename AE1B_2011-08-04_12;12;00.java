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
			int num=(in.nextInt())*in.nextInt();
			int[] tab = new int[t];
			for (int i = 0; i < t; i++) 
			{	
				tab[i]=in.nextInt();
			}
			Arrays.sort(tab);
			for (int i=t-1 ; i >= 0; i--) 
			{	
				num=num-tab[i];
				if(num<=0)
				{
					System.out.println(t-i);
					break;
				}
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}