package symphony.domain;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Concert Class
 * This class identifies the type of concert and the concert date.
 * @author    My My Ngo
 * @version   1.0.0 October 25, 2016
 */

public class Concert {

	private static String concertNumber = "Concert99";
	java.util.Date aDate = new java.util.Date();	
	java.sql.Timestamp concertDate;
	
	public Concert(String concertNumber){
		setConcertNumber(concertNumber);	
		concertDate = new java.sql.Timestamp(aDate.getTime());
	}
	

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Concert ID getter method
	 * @return Concert number as a String
	 */
	public String getConcertNumber(){
		return getConcertNumber();
	}//end getConcertNumber()
	
	/**
	 * Concert date getter method
	 * @return Concert date(s) as a Date object
	 */
	public java.sql.Timestamp getConcertDate(){
		return concertDate;
	}//end getConcertDates()


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Concert Number setter method - sets concert id with a String parameter
	 * @param concertNumber - Concert identifier (combination of letters and numbers)
	 */
	public void setConcertNumber(String concertID){
		concertNumber = concertID;
	}//end concertNumber()


	/**
	 * Concert Date setter method - sets concert date with a Date object parameter
	 * @param concertDate - Date of when concert opens.  
	 */
	public void setConcertDate(java.sql.Timestamp date){
		concertDate = date;
	}//end setConcertDate()


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Concert number and concert date as a meaningful String
	 */
	@Override
	public String toString() {
		return "\n[Concert Number: " + concertNumber 
				+ ", Date: " + concertDate + "]";
	}

	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.		
	 */



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 *  Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * 	uses the WrapperManager to start the ServerWrapper object.
	 * 	@param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main(String[] args) {
		//Test output
		Concert concert = new Concert(concertNumber);
		System.out.println(concert);
	}//end main

}	/*	End of CLASS:	Concert.java			*/
