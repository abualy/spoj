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
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if (n == 0 && m == 0)
				break;
			Map<String, Integer> tab = new HashMap<String, Integer>();
			Vector<String> vt = new Vector<String>();
			for (int i = 0; i < n; i++) {
				String str = in.readLine();
				Integer val = tab.get(str);
				if (val == null) {
					tab.put(str, 1);
					vt.add(str);
				}

				else {
					tab.put(str, val + 1);
					
				}
			}
			int[] occ = new int[n];
			for (int i = 0; i < vt.size(); i++) {
				occ[tab.get(vt.elementAt(i))-1]++;
			}
			for (int i = 0; i < n; i++) {
				System.out.println(occ[i]);
			}

		}
	}
}