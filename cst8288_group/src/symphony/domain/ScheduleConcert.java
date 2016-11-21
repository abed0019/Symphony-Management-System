package symphony.domain;

import java.util.ArrayList;

/**
 * Schedule Concert Class
 * This class schedules a concert. 
 * @author    My My Ngo
 * @version   1.0.0 Nov 14, 2016
 */
public class ScheduleConcert {
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ScheduleConcert
	 */
	public ScheduleConcert(){
		super();		
	}
	
	public ScheduleConcert(ConcertSeason concertSeason, Concert concert,Venue venue){
		this.concertSeason = concertSeason;
		this.concert = concert;		
		this.venue = venue;
		concertSeason.addConcert(concert);
		
	}//end constructor
	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * @return ConcertSeason for the concert
	 */
	public ConcertSeason getConcertSeason()	{
		return concertSeason;
	}
	
	/**
	 * @return Concert of the concert
	 */
	public Concert getConcert()	{
		return concert;
	}
	
	/**
	 * @return Venue of the concert
	 */
	public Venue getVenue()	{
		return venue;
	}
		

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * @param venue - The venue of the concert
	 */
	public void setConcertSeason(ConcertSeason concertSeason){
		this.concertSeason = concertSeason;
	}
	
	/**
	 * @param venue - The venue of the concert
	 */
	public void setConcert(Concert concert)	{
		this.concert = concert;
	}
	
	/**
	 * @param venue - The venue of the concert
	 */
	public void setVenue(Venue venue)	{
		this.venue = venue;
	}
	
	
	/**
	 * addConcertToSchedule() - Add new concerts to a concert season
	 * @param - none
	 *******************************************************************/
	public void addConcertToSchedule(){
		
	}
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return ScheduleConcert as a meaningful String
	 */
	@Override
	public String toString() {
		return "Concert information schedule:" + concertSeason + " is scheduled to have " + concert 
				+ " performed at this " + venue;

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
		// TODO Auto-generated method stub
	
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The concert season for the concert
	 */
	private ConcertSeason concertSeason;
	
	/**
	 * The concert in which the orchestra will be performing
	 */
	private Concert concert;
	
	/**
	 * The venue in which the concert will be held
	 */
	private Venue venue;
	
	
}/*	End of CLASS:	ScheduleConcert.java			*/
