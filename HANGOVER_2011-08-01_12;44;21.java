import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in = new Scanner(System.in);
			double[]tab=new double[280];
			double acc=0;
			tab[0]=0.0;
			for(int i=1;tab[i-1]<=5.2;i++)
			{
				acc=acc+((double)1/(double)(i+1));
				tab[i]=acc;
							}
			double leng=new Double(in.next()).doubleValue();
			while (leng!=0.00) 
			{
				int res=0;
				for(int i=1;leng>tab[i];i++)
				{
					res=i;
				}
				res++;
				System.out.println(res+" card(s)");
				leng=new Double(in.next()).doubleValue();
			}
		}
		catch (Exception  t) 
		{
			t.printStackTrace();
		}
	}
}