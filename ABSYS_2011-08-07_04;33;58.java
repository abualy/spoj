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
			for (int i = 0; i < t; i++) 
			{	
				String sa=in.next().trim();
				in.next();
				String sb=in.next().trim();
				in.next();
				String ss=in.next().trim();
				if(sa.contains("machula")) 
				{
					sa=String.valueOf(Integer.parseInt(ss)-Integer.parseInt(sb));
				}
				else if(sb.contains("machula"))
				{
					sb=String.valueOf(Integer.parseInt(ss)-Integer.parseInt(sa));
				}
				else
				{
					ss=String.valueOf(Integer.parseInt(sa)+Integer.parseInt(sb));
				}
				System.out.println(sa+" + "+sb+" = "+ss);
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}