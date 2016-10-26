package cst8288_group;

/**
 * ConcertManagement Class
 * Manages the symphony orchestra from scheduling concert event, booking venues, 
 * hiring employees (conductors, soloist, composers, etc.), selling concert tickets.
 * 
 * @author    My My Ngo
 * @version   1.0.0 October 26, 2016
 */
public class ConcertManagement {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ConcertManagement
	 */
	public ConcertManagement(){
		
	}//end ConcertManagement
	
	/* Concert Class
	 **********************************/
	//checkConcertCriteria();
	//verifyScheduleExist();
	//verifyConcertDateExist();
	//verifyConductorExist();
	//verifyCompositionExist();
	
	/* Committee Class => Employment Class
	 **********************************/
	//employConductor();
	//employSoloist();
	//employComposer();
	
	
	/* ConcertSeason Class
	 **********************************/
	//createConcertSchedule();
	//addVenue();
	//addConcert();
	//
	
	
	
	/*public boolean checkConcertCriteria(){
		boolean criteriaComplete = false;
		
		if ((openingDate_exist == true) && (venue_exist == true) && (conductor_exist == true) &&
			(soloist_exist == true)){
			criteriaComplete = true;
			System.out.println("All concert criteria complete.");
		}//end if
		
		if (openingDate_exist == false){
			//call ConcertSeason class
			System.out.println("Concert Season not scheduled.");
		}
		
		if (venue_exist == false){
			//call Venue class
			System.out.println("No venue available.");
		}
		
		if(conductor_exist == false){
			//call Conductor class
			System.out.println("No conductor available.");
		}
		
		if(soloist_exist == false){
			//call Soloist class
			System.out.println("No soloist available.");
		}		
	}//end checkConcertCriteria()
*/	
	public static void main(String[] args) {
		boolean concertApproved;
		
		//concertApproved = checkConcertCriteria();
		
		/*Invoice invoice = new Invoice();
		invoice.setMinutesFromUser();*/
	}

}
