import java.io.*;
import java.util.*;
public class Main 
{
	static int swap(int numb)
	{
		String a=String.valueOf(numb);
		char[]tab=a.toCharArray();
		for(int i=0;i<tab.length/2;i++)
		{
			char tmp=tab[i];
			tab[i]=tab[tab.length-1-i];
			tab[tab.length-1-i]=tmp;
		}
		a=String.copyValueOf(tab);
		return Integer.parseInt(a);
	}
	public static void main(String[] args)
	{
		try
		{
			Scanner in = new Scanner(System.in);
			
			int t=in.nextInt();
			for (int i = 0; i < t; i++) 
			{
				int a=in.nextInt();
				int b=in.nextInt();
				int c=swap(swap(a)+swap(b));
				System.out.println(c);
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}