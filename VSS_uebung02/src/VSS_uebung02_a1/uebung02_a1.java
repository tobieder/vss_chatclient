package VSS_uebung02_a1;
import java.io.*;

public class uebung02_a1 
{
	public static void main (String [] args) 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		System.out.println("Please enter text (end with empty line) ");
		try {
			while((line = in.readLine()) != null && !"".equals(line)) {
				System.out.println("got line: " + line);
			}
		}
		catch (IOException e) {
			System.out.println("I/O error");
		}
		System.out.println("end of program");
	}
}
