import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HaeMerkkijono {

	private static final Scanner lukija = new Scanner(System.in);
	private static String outString;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Anna horokooppi: ");
		String horoskooppi = lukija.next();
		
		Scanner in = new Scanner(new FileReader(horoskooppi + ".txt"));
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()) {
		    sb.append(in.next() + " ");
		}
		in.close();
		outString = sb.toString();
		System.out.println(outString);
	}

}
