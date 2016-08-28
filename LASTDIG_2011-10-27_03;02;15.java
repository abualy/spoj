import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for (int i = 0; i < t; i++) {
			int numb = in.nextInt();
			int pow =in.nextInt();
			if(pow==0){
				System.out.println("1");
				continue;
			}
			if(numb==0){
				System.out.println("0");
				continue;
			}
			numb=numb%10;
			pow=(pow%4);
			if(pow==0) pow=4;
			System.out.println((int)(Math.pow(numb,pow))%10);
		}
	}
}