import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			int t=Integer.parseInt(in.readLine());
			for (int k = 0; k < t; k++) 
			{	
				int term=Integer.parseInt(in.readLine());
				double dn=(1+Math.sqrt(1+8*term))/2;
				int n;
				if(dn-Math.floor(dn)==0.0) n=(int)Math.floor(dn)-2;
				else n=(int)Math.floor(dn)-1;
				int diff=term-(n*(n+1)/2);
				int i=diff;
				int j=n+2-diff;
				if((n+1)%2==0) System.out.println("TERM "+term+" IS "+i+"/"+j);
				else System.out.println("TERM "+term+" IS "+j+"/"+i);
			}
	}
}