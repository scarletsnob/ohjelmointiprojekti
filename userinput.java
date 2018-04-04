package horoskooppigeneraattori;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class userinput {
	private static final Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Anna p‰iv‰m‰‰r‰: ");
		String todayDate = reader.next();
		System.out.println("todayDate: " + todayDate);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("d.M.yyyy");
		
		LocalDate date2=null;
		try {
		    //Parsing the String
		    date2 = LocalDate.parse(todayDate, sdf);
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		System.out.println("date2: " + date2);
		
        /*
        LocalDate date1 = LocalDate.of(2009, 12, 31);
        LocalDate date2 = LocalDate.of(2010, 01, 31);

        System.out.println("todayDate : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));
		
		System.out.print(todayDate.isBefore(date2)); //prints true
		System.out.print(date2.isBefore(date2)); //prints false
*/
	}

}
