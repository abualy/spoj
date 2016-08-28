import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int t=in.nextInt();
			for (int i = 1; i <= t; i++) 
			{
				int charInd=in.nextInt()-1;
				StringBuffer str=new StringBuffer(in.next());
				System.out.println(i+" "+str.deleteCharAt(charInd));
			}
	}
}
