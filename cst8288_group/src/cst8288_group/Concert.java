package cst8288_group;

/**
 * <b>Concert Class</b>
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
	/* implement these in the other classes instead  */
	private static final boolean venue_exist = false;
	private static final boolean conductor_exist = false; //identify that 1 exist
	private static final boolean soloist_exist = false;  //dentify that 1 or more exist
	private static final boolean openingDate_exist = false;  //identify concert schedule exist in ConcertSeason class

	private String concertID;
	private Date concertDate;  /*call Date class - identify a date exist */
	
	//private ConcertSeason concertSeason;
	//private Conductor conductor;  /*call Conductor class */
	//private Soloist soloist;  /*call Soloist class  */
	//private Venue venue;  /*call Venue classs - identify that 1 exist */


	public Concert(){
		concertID = null;
		concertDate = new Date();	
		/*conductor = new Conductor();
		soloist = new Soloist();
		venue = new Venue();*/		
	}

	public Concert(String concertID, Date date){
		this.concertID = concertID;
		concertDate = new Date(date); 

	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Concert ID getter method
	 * @return Concert ID as a String
	 */
	public String getConcertID(){
		return concertID;
	}//end getConcertID()

	/**
	 * Concert date getter method
	 * @return Concert date as a Date object
	 */
	public Date getConcertDate(){
		return concertDate;
	}//end getConcertID()


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Concert ID setter method - sets concert id with a String parameter
	 * @param concertID - Concert identifier (combination of letters and numbers)
	 */
	public void setConcertID(String concertID){
		this.concertID = concertID;
	}//end setConcertID()


	/**
	 * Concert Date setter method - sets concert date with a Date object parameter
	 * @param concertDate - Date of when concert opens.  
	 */
	public void setConcertDate(Date concertDate){
		 this.concertDate = concertDate;
	}//end setConcertID()


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Concert as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ " 
				+ "concertID=" + getConcertID() 
				+ " concertDate=" + getConcertDate()
				/*	+ " venue=" + getComposer()
				+ " conductor=" + getMovementList()
				+ " soloist=" + getMovementList()	*/			
				+ " ]";
	}


	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/

	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 *  Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * 	uses the WrapperManager to start the ServerWrapper object.
	 * 	@param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main

}//end Concert Class
