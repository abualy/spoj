import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static char[] rev(char[] numb) {
		int len = numb.length;
		int mid = len / 2 - (len + 1) % 2;
		char[] dummy = Arrays.copyOf(numb, len);
		for (int i = 0; i <= mid; i++) {
			dummy[len - 1 - i] = dummy[i];
		}
		return dummy;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int i = 0; i < t; i++) {
			char[] numb = in.readLine().toCharArray();
			int mid = numb.length / 2 - (numb.length + 1) % 2;
			char[] rn = rev(numb);
			boolean doIt = false;
			for (int j = mid+1; j < numb.length; j++) {
				if (numb[j] < rn[j]) {
					doIt = true;
					break;
				} else if (numb[j] > rn[j]) {
					break;
				}
			}
			if (doIt) {
				System.out.println(new String(rn));
			} else {
				boolean prob = true;
				for (int j = mid; j >= 0 && prob; j--) {
					if (numb[j] == '9')
						numb[j] = '0';
					else {
						numb[j]++;
						prob = false;
					}
				}
				if (prob) {
					char[] nb = new char[numb.length + 1];
					nb[0] = '1';
					for (int j = 0; j < numb.length; j++) {
						nb[j + 1] = numb[j];
					}
					System.out.println(new String(rev(nb)));
					continue;
				}
				System.out.println(new String(rev(numb)));
			}
		}
	}
}

