import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
		 	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));			
		 	String str;
			while((str = in.readLine()) != null && str.length() != 0)
			{
				int x=31;
				int y=42;
				char direction='r';
				System.out.println("300 420 moveto");
				System.out.println("310 420 lineto");
				for (int i = 0; i < str.length(); i++) 
				{
					if(str.charAt(i)=='V')
					{
						switch (direction) {
						case 'u':
						{
							direction='l';
							x--;
							break;
						}
						case 'd':
						{
							direction='r';
							x++;
							break;
						}
						case 'l':
						{
							direction='d';
							y--;
							break;
						}
						case 'r':
						{
							direction='u';
							y++;
							break;
						}
						}
					}
					else
					{
						switch (direction) {
						case 'u':
						{
							direction='r';
							x++;
							break;
						}
						case 'd':
						{
							direction='l';
							x--;
							break;
						}
						case 'l':
						{
							direction='u';
							y++;
							break;
						}
						case 'r':
						{
							direction='d';
							y--;
							break;
						}
						}
					}
					System.out.println((x*10)+" "+(y*10)+" lineto");
				}
				System.out.println("stroke");
				System.out.println("showpage");
			}
	}
}