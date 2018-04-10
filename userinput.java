package horoskooppigeneraattori;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class userinput {
	private static final Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		Date givenDate = askDate();

		if (vesimies(givenDate)) {
			System.out.println("Vesimies");
		} else if (kalat(givenDate)) {
			System.out.println("Kalat");
		} else if (oinas(givenDate)) {
			System.out.println("Oinas");
		} else if (harka(givenDate)) {
			System.out.println("H‰rk‰");
		} else if (kaksonen(givenDate)) {
			System.out.println("Kaksonen");
		} else if (rapu(givenDate)) {
			System.out.println("Rapu");
		} else if (leijona(givenDate)) {
			System.out.println("Leijona");
		} else if (neitsyt(givenDate)) {
			System.out.println("Neitsyt");
		} else if (vaaka(givenDate)) {
			System.out.println("Vaaka");
		} else if (skorpioni(givenDate)) {
			System.out.println("Skorpioni");
		} else if (jousimies(givenDate)) {
			System.out.println("Jousimies");
		} else {
			System.out.println("Kauris");
		} 
		
		
        
	}//main
	
	public static Date askDate() throws ParseException {
	    SimpleDateFormat formatter = new SimpleDateFormat("d.M.");
		
	    Date date2=null;
	    boolean validInput = false;
	    while(!validInput) {
			try {
				System.out.println("Anna p‰iv‰m‰‰r‰ (muodossa pp.kk.): ");
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
	
	
	// ---------------------------------------------------------------------------------------------------------------------//
	public static boolean vesimies(Date givenDate) throws ParseException {
		String startDateString = ("20.1.1970");
	    String endDateString = ("19.2.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);

	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	
	public static boolean kalat(Date givenDate) throws ParseException {
		String startDateString = ("20.2.1970");
	    String endDateString = ("19.3.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);

	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean oinas(Date givenDate) throws ParseException {
		String startDateString = ("20.3.1970");
	    String endDateString = ("19.4.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);

	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	
	public static boolean harka(Date givenDate) throws ParseException {
		String startDateString = ("20.4.1970");
	    String endDateString = ("21.5.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean kaksonen(Date givenDate) throws ParseException {
		String startDateString = ("22.5.1970");
	    String endDateString = ("21.6.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean rapu(Date givenDate) throws ParseException {
		String startDateString = ("22.6.1970");
	    String endDateString = ("22.7.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean leijona(Date givenDate) throws ParseException {
		String startDateString = ("23.7.1970");
	    String endDateString = ("22.8.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean neitsyt(Date givenDate) throws ParseException {
		String startDateString = ("23.8.1970");
	    String endDateString = ("22.9.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}public static boolean vaaka(Date givenDate) throws ParseException {
		String startDateString = ("23.9.1970");
	    String endDateString = ("22.10.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean skorpioni(Date givenDate) throws ParseException {
		String startDateString = ("23.10.1970");
	    String endDateString = ("21.11.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}
	public static boolean jousimies(Date givenDate) throws ParseException {
		String startDateString = ("22.11.1970");
	    String endDateString = ("21.12.1970");
	    
	    Date startDate = stringToDateConverter(startDateString);
	    Date endDate  = stringToDateConverter(endDateString);
	    
	    boolean validHoroscope = !(givenDate.before(startDate) || givenDate.after(endDate));
	    return validHoroscope;    
	}

}
