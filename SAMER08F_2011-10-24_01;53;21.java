import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				int numb=Integer.parseInt(in.readLine());
				if(numb==0) break;
				System.out.println(numb*(numb+1)*(2*numb+1)/6);
			}
	}
}