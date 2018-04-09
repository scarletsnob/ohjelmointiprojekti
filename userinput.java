package horoskooppigeneraattori;

import java.util.Scanner;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;




public class userinput {
	private static final Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Anna p‰iv‰m‰‰r‰: ");
//		String givenDate = reader.next();
//		System.out.println("Given date: " + givenDate);

	    Date date = askDate();
		
        /*
        LocalDate date1 = LocalDate.of(2009, 12, 31);
        LocalDate date2 = LocalDate.of(2010, 01, 31);

        System.out.println("todayDate : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));
		
		System.out.print(todayDate.isBefore(date2)); //prints true
		System.out.print(date2.isBefore(date2)); //prints false
*/
	}
	
	public static Date askDate() {
	    SimpleDateFormat formatter = new SimpleDateFormat("d.M.");
		
	    Date date2=null;
	    

	    boolean validInput = false;
	    while(!validInput) {
			try {
				System.out.println("Anna p‰iv‰m‰‰r‰: ");
				String givenDate = reader.next();
			    //Parsing the String
			    date2 = formatter.parse(givenDate);
			    validInput = true;
	
			} catch (Exception e) {
			    // TODO Auto-generated catch block
//			    e.printStackTrace();
			    System.out.println("Ep‰kelpo p‰iv‰m‰‰r‰");

			}
	    }
	    
	    return date2;
	}

}
