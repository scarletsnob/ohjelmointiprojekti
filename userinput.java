package horoskooppigeneraattori;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class userinput {
	private static final Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		Date givenDate = askDate();
		String horoskooppi;

		if (vesimies(givenDate)) {
			horoskooppi = "Vesimies";
		} else if (kalat(givenDate)) {
			horoskooppi = "Kalat";
		} else if (oinas(givenDate)) {
			horoskooppi = "Oinas";
		} else if (harka(givenDate)) {
			horoskooppi = "H‰rk‰";
		} else if (kaksonen(givenDate)) {
			horoskooppi = "Kaksonen";
		} else if (rapu(givenDate)) {
			horoskooppi = "Rapu";
		} else if (leijona(givenDate)) {
			horoskooppi = "Leijona";
		} else if (neitsyt(givenDate)) {
			horoskooppi = "Neitsyt";
		} else if (vaaka(givenDate)) {
			horoskooppi = "Vaaka";
		} else if (skorpioni(givenDate)) {
			horoskooppi = "Skorpioni";
		} else if (jousimies(givenDate)) {
			horoskooppi = "Jousimies";
		} else {
			horoskooppi = "Kauris";
		} 
		
		System.out.println(horoskooppi);
		
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
//------------------------------------------------------------------------------------------------------------------------------------------------
}
