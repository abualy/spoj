import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException
	{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			
			int t=Integer.parseInt(in.readLine());
			for (int i = 0; i < t; i++) 
			{
				in.readLine();
				st=new StringTokenizer(in.readLine());
				int Ng=Integer.parseInt(st.nextToken());
				int Nm=Integer.parseInt(st.nextToken());
				int NgMax=0;
				int NmMax=0;
				st=new StringTokenizer(in.readLine());
				for (int j = 0; j < Ng; j++) 
				{
					int tmp=Integer.parseInt(st.nextToken());
					if(tmp>NgMax) NgMax=tmp;
				}
				st=new StringTokenizer(in.readLine());
				for (int j = 0; j < Nm; j++) 
				{
					int tmp=Integer.parseInt(st.nextToken());
					if(tmp>NmMax) NmMax=tmp;
				}
				if(NmMax>NgMax) System.out.println("MechaGodzilla");
				else System.out.println("Godzilla");
			}
	}
}