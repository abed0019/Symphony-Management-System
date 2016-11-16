package cst8288_group;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Concert Class
 * A Concert is a symphony orchestra performance event of zero or more compositions (1:0). 
 * A Concert is a one to many concerts (1:M) in a concert season.
 * A Concert is performed at a Venue (M:1)
 * A concert is performed on one or more specific dates (1:M)
 * Each concert has a ID number given by the Committee
 * A concert must have 1 conductor. A conductor may conduct any number of concerts, 
 * may not conduct any concerts.
 * A concert must have 1 or more soloist(s). A soloist may perform 0 to many compositions.
 * (Question: who will perform the composition if Soloist doesnt as there must be at least 1 at a concert??)
 *  
 * A Composition may have 0 to many movements.
 * 
 * @author    My My Ngo
 * @version   1.0.0 October 25, 2016
 */

public class Concert {

	//private static final String concertNumber = "concert123";
	String concertNumber = "concert123";
	//Date date;
	ConcertDate concertDate;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  //2016/Jan/13
	//private ArrayList<Date> concertDateList = new ArrayList<Date>();

	public Concert(String concertNumber){
		setConcertNumber(concertNumber);	
		concertDate = new ConcertDate();
		//concertDateList.add(date = new Date());
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Concert ID getter method
	 * @return Concert number as a String
	 */
	public String getConcertNumber(){
		return concertNumber;
	}//end getConcertNumber()

	/**
	 * Concert date getter method
	 * @return Concert date(s) as a Date object
	 */
	public ConcertDate getConcertDate(){
		return concertDate;
	}//end getConcertDates()


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Concert Number setter method - sets concert id with a String parameter
	 * @param concertNumber - Concert identifier (combination of letters and numbers)
	 */
	public void setConcertNumber(String concertNumber){
		this.concertNumber = concertNumber;
	}//end concertNumber()


	/**
	 * Concert Date setter method - sets concert date with a Date object parameter
	 * @param concertDate - Date of when concert opens.  
	 */
	public void setConcertDate(ConcertDate date){
		concertDate = date;
	}//end setConcertDate()


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Concert number and concert date as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ Concert " + concertNumber 
				+ "Date " + dateFormat.format(concertDate)		
				+ " ]";
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

	}//end main

}//end Concert Class
