import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			
			int n=in.nextInt();
			int m=in.nextInt();
			while (true) 
			{
				if(n==0 && m==0) break;
				System.out.printf("%.6f\n",(n>m)?0:(double)(m-n+1)/(double)(m+1));
				n=Integer.parseInt(in.next());
				m=Integer.parseInt(in.next());
			}
	}
}