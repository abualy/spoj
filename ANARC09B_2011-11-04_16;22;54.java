import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long pgcd(long a,long b)
	{
		if(a==0)return b;
		if(b==0)return a;
		if(a<b) return pgcd(a,b%a);
		if(b<a) return pgcd(a%b,b);
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(in.readLine());
			long a1 = Integer.parseInt(st.nextToken());
			long a2 = Integer.parseInt(st.nextToken());
			if (a1 == 0 && a2 == 0)
				break;
			if(a1==a2)System.out.println("1");
			else if(a1<a2)
			{
				if(a2%a1==0) System.out.println(a2/a1);
				else System.out.println(a1*a2/pgcd(a1,a2));
			}
			else
			{
				if(a1%a2==0) System.out.println(a1/a2);
				else System.out.println(a1*a2/pgcd(a2,a1));
			}
		}
	}
}