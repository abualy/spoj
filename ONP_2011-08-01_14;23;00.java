import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner in = new Scanner(System.in);
			
			int t=in.nextInt();
			for (int i = 0; i < t; i++) 
			{	
				String express=in.next();
				char[] opera =new char[100];
				int ind=0;
				for(int j=0;j<express.length();j++)
				{
					if(express.charAt(j)=='(')
					{
						continue;
					}
					else if(express.charAt(j)==')')
					{
						ind--;
						System.out.print(opera[ind]);
						continue;
					}
					else if(express.charAt(j)<='z' && express.charAt(j)>='a')
					{
						System.out.print(express.charAt(j));
						continue;
					}
					else
					{
						opera[ind]=express.charAt(j);
						ind++;
					}
				}
				System.out.println();
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}