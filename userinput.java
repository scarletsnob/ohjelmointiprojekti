package horoskooppigeneraattori;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class userinput {
	private static final Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		Date givenDate = askDate();
		
		String startDateString = ("1.1.1970");
	    String endDateString = ("1.2.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    System.out.println("Start Date: " + startDate);
	    System.out.println("End Date: " + endDate);
	    
	    System.out.println(isWithinRange(givenDate, startDate, endDate));
		
        
	}//main
	
	public static Date askDate() throws ParseException {
	    SimpleDateFormat formatter = new SimpleDateFormat("d.M.");
		
	    Date date2=null;
	    boolean validInput = false;
	    while(!validInput) {
			try {
				System.out.println("Anna p‰iv‰m‰‰r‰ (muodossa pp.kk): ");
				String givenDate = reader.next();
			    //Parsing the String
			    date2 = formatter.parse(givenDate);
			    validInput = true;
	
			} catch (Exception e) {
			    System.out.println("Ep‰kelpo p‰iv‰m‰‰r‰.");
			}//catch
	    }//while
	    
	    return date2;
	}// askDate
	
	static boolean isWithinRange(Date testDate, Date startDate, Date endDate) {
//	    SimpleDateFormat formatter = new SimpleDateFormat("d.M.");
	    return !(testDate.before(startDate) || testDate.after(endDate));
		}//isWithinRange
	
	public static Date stringToDateConverter(String string) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("d.M.");
		Date date = format.parse(string);
		return date;
	}
}
