import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner in = new Scanner(System.in);
			StringTokenizer st;
			String t;
			do
			{
			t=in.nextLine().trim().toLowerCase();
			}while(t.length()==0);
			st= new StringTokenizer(t);
			char test=st.nextToken().trim().charAt(0);
			boolean isIt=true;
			while(test!='*')
			{	
				while(st.hasMoreTokens())
				{
					if(st.nextToken().trim().charAt(0)!=test)
					{
						isIt=false;
						break;
					}
				}
				if(isIt)System.out.println("Y");
				else System.out.println("N");
				do
				{
				t=in.nextLine().trim().toLowerCase();
				}while(t.length()==0);
				st= new StringTokenizer(t.trim());
				test=st.nextToken().trim().charAt(0);
				isIt=true;
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}