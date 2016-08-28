import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ready");
			while (true) {
				
				String str=in.readLine();
				if(str.charAt(0)==' '&&str.charAt(1)==' ') break;
				str=str.trim();
				boolean isIt=false;
				switch (str.charAt(0)) {
				case 'p':
				{
					if(str.charAt(1)=='q')isIt=true;
					break;
				}
				case 'q':
				{
					if(str.charAt(1)=='p')isIt=true;
					break;
				}	
				case 'd':
				{
					if(str.charAt(1)=='b')isIt=true;
					break;
				}
				case 'b':
				{
					if(str.charAt(1)=='d')isIt=true;
					break;
				}
				default:
					break;
				}
				if(isIt) System.out.println("Mirrored pair");
				else System.out.println("Ordinary pair");
			}
			
			
	}
}