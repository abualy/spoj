import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("a.in"));
		int a=in.nextInt();
		while(a!=42)
		{
			try
			{
				System.out.println(a);
				a=in.nextInt();
			}
			catch(Exception e)
			{
				in.close();
				break;
			}
		}
	}
}