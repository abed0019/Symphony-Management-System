package symphony.domain;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.reflect.Array;

/**
 * Concert Management Class
 * This class manages the concert such as scheduling the concert, verifying the musicians presence and opening date, 
 * and identifying the number of composition that will be available at the concert.
 * will be at a concert.
 * @author    My My Ngo
 * @version   1.0.0 October 25, 2016
 */

public class ConcertManagement{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ConcertManagement
	 */
	public ConcertManagement(){  	
		super();
	}//end ConcertManagement() constructor
	
	/**
	 *   Checks if a venue has been rented.
	 ****/
	public boolean venueExist(Object o) { return true;	}

	/**
	 *   Checks if an open date has been set (available)
	 ****/
	public boolean openingDateExist() { return true;	}

	/**
	 *   Checks if a conductor will be at the concert.  Mandatory to have at least one conductor at the     
	 *   orchestra.
	 ****/
	public boolean conductorExist(Object o){ return true;	}


	/**
	 *   Checks if a soloist will be at the concert.  
	.****/
	public boolean soloistExist(Object o) {  return true;	}//end soloistExist ()

	/**
	 *   Checks if a composer will be at the concert.  
	.****/
	public boolean composerExist(Object o){ 
		return true;	
	}//end composerExist ()


	/**
	 *   Schedules a concert under a concert season.  
	 *******************************************************************************************/	
	public void scheduleConcert (ConcertSeason concertSeason, Concert concert,Venue venue) {
		ScheduleConcert scheduleConcert = new ScheduleConcert(concertSeason, concert, venue);
		System.out.println(scheduleConcert);

	}//end scheduleConcert ()
	
	
	/**
	 *   Identify how many musicians are performing at a concert - Error coz conductor class removed!!!
	 ****/
	/*public int musiciansPerConcert(Conductor conductor, Soloist soloist, Composition composer) {
	}//end musiciansPerConcert() */

	/**
	 *   Search for a specific concert in a concert season, including date, venue name and location.
	 ****/	
	public void findConcert(ConcertSeason season) {

	}//end findConcert ()

	/**
	 *   Access to the list of compositions at a concert
	 ****/	
	public void numberOfCompositionPerConcert(ConcertSeason season, 
			Concert concert, Composition composition) {

	}//end numberOfCompositionPerConcert ()


	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Getter
	 */


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Setter
	 */


	@Override
	public String toString() {
		return " ";
	}

	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.									*/
	
	
	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * uses the WrapperManager to start the ServerWrapper object.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main(String[] args) {  
		
		/* Testing - Create all the objects 
		 * *************************************************/
		/* Get a venue address */
		Address venueAddress = new Address.Builder("123 Algonquiun", "Ottawa", "Ontario", "K1K 1K1").build(); 
		//System.out.println(venueAddress);

		/* Create a Venue – location where the concert will be held  **********/		
		Venue venue = new Venue(venueAddress, "Woodroffe Campus", 250);

		//Create a concert 
		Concert concert = new Concert("Concert123");

		//Create a concert season 
		java.util.Date aDate;	
		java.sql.Timestamp openingDate;	
		aDate = new java.util.Date();
		openingDate = new java.sql.Timestamp(aDate.getTime());
		ArrayList<Concert> concertList = new  ArrayList<Concert>();
		concertList.add(concert);
		ConcertSeason concertSeason = new ConcertSeason("Winter2016", openingDate, 10, concertList);

		ConcertManagement concertMgmt = new ConcertManagement();
		concertMgmt.scheduleConcert(concertSeason, concert, venue);


	}//main

	/* ATTRIBUTES	-----------------------------------------------------	*/

}/*	End of CLASS:	ConcertManagement.java			*/
