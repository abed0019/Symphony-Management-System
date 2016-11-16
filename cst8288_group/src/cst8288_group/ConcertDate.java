package cst8288_group;

/**
* <b>ConcertDate Class</b>
* Date in day, month, and year
* @author    My My Ngo
* @version   1.0.0 October 25, 2016
*/
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ConcertDate {

	/*  2016/11/14 16:06:54  */
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm"); 
	Calendar concertDate;
	Date date;
	

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ConcertDate
	 */
	public ConcertDate() { 		concertDate = Calendar.getInstance();  	}
	
		
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Concert date getter method
	 * @return concert date as a String
	 */
	public Calendar getDate(){
		return concertDate;
	}
	

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Concert date setter method - set time of concert with an integer parameter
	 * @param concert date and time 
	 */
	public void setDate(){
		concertDate.setTime(date);  //set date and time
	}
	public void setDate(int year, int month, int day, int hh, int mm){
		concertDate = new GregorianCalendar(year, month, day, hh, mm);
	}
	 

	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	
	
}/*	End of CLASS:	ConcertDate.java			*/
