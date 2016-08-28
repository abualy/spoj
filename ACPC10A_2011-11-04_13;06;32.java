import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(in.readLine());
			long a1 = Integer.parseInt(st.nextToken());
			long a2 = Integer.parseInt(st.nextToken());
			long a3 = Integer.parseInt(st.nextToken());
			if (a1 == 0 && a2 == 0 && a3==0)
				break;
			if(a2-a1==a3-a2) System.out.println("AP "+ (2*a3-a2));
			else System.out.println("GP "+ (a3*a3/a2));
		}
	}
}