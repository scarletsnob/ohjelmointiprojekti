import java.io.*;
import java.util.Scanner;

public class LueTiedosto {

	public static void main(String[] args) throws FileNotFoundException {
		
		final Scanner lukija = new Scanner(new File("teksti2.txt"));
		String rivi = " ";
		
		while ( lukija.hasNext() ) {
			rivi = lukija.nextLine();
			System.out.println(rivi);
		}//while
		lukija.close();
	}
}