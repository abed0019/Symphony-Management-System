package cst8288_group;

import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
* Concert Management Class
* @author    My My Ngo
* @version   1.0.0 October 25, 2016
*/

public class ConcertManagement{
	
	Venue venue;
	ConcertSeason season;
	Concert concert;
	Conductor conductor;  
	Soloist soloist;  
	Composition composition; 
	FinancialTransation finance;  


	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ConcertManagement
	 */
	public ConcertManagement(){
		//create all the objects
		venue = new Venue();
		concertSeason = new ConcertSeason();
		concert = new Concert() ;
		conductor = new Conductor();  
		soloist = new Soloist();  
		composition = new Composition() ; 
		finance = new FinancialTransation();  

	}//end ConcertManagement
	
	/*public Movement(String movName, int movNum) {
		setMovementNumber(movNum);
		setMovementName(movName);
		setMovementID(movName + movNum);
	}*/
	
	
	/**
	*   Checks if a venue has been rented.
	****/
	public boolean venueExist () { 	}

	/**
	*   Checks if an open date has been set (available)
	****/
	public boolean openingDateExist () { 	}

	/**
	*   Checks if a conductor will be at the concert.  Mandatory to have at least one conductor at the     
	*   orchestra.
	****/
	public boolean conductorExist (){ 	}


	public static void main(String[] args) {  	}
	
	/**
	*   Checks if a soloist will be at the concert.  
	.****/
	public boolean soloistExist () {

	}//end soloistExist ()

	/**
	*   Checks if a composer will be at the concert.  
	.****/
	public boolean composerExist (){

	}//end composerExist ()

	/**
	*   Identify how many musicians are performing at a concert
	****/
	public int musiciansPerConcert(Conductor conductor, Soloist soloist, Composition composer) {
	}//end musiciansPerConcert()

	 
	/**
	*   Schedule a concert under a concert season.  
	****/	
	public void scheduleConcert () ) {
				
		Date openingDate = new Date() ;
		int length = 10;
		public ArrayList<Concert> concertList;
		public ArrayList<Venue> venueList;
		
		//	public ConcertSeason(Date openingDate, int length, ArrayList<Concert> concertList){
	//
		concertSeason.(openingDate, length, concertList, venueList); 
	concertSeason.addVenue();
	concertSeason.addConcert();
	}//end scheduleConcert ()

	/**
	*   Search for a specific concert in a concert season, including date, venue name and location.
	****/	
	public void findConcert(ConcertSeason season) {

	}//end findConcert ()

	/**
	*    Displays all the available dates for a particular concert
	****/	
	public void concertDatePerformances (Concert concert) {

	}//end concertDatePerformances ()

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
		 

		/* ATTRIBUTES	-----------------------------------------------------	*/
		


}/*	End of CLASS:	ConcertManagement.java			*/
