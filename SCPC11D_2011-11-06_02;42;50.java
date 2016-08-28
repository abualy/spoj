import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException
	{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st ;
			while (true)
			{	
				st=new StringTokenizer(in.readLine().trim());
				long[] tab=new long[3];
				tab[0]=Integer.parseInt(st.nextToken());
				tab[1]=Integer.parseInt(st.nextToken());
				tab[2]=Integer.parseInt(st.nextToken());
				Arrays.sort(tab);
				if(tab[2]==0) break;
				if(tab[0]*tab[0]+tab[1]*tab[1]==tab[2]*tab[2]) System.out.println("right");
				else System.out.println("wrong");
			}
	}
}