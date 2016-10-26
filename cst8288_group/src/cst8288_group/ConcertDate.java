package cst8288_group;

/**
* <b>ConcertDate Class</b>
* Date in day, month, and year
* @author    My My Ngo
* @version   1.0.0 October 25, 2016
*/
public class ConcertDate extends Date {
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for ConcertDate
	 */
	public ConcertDate() {
		super();  	
	}
	
	/**
	 * Overloaded constructor for adding concert time and getting the date of the concert
	 * @param time of the concert show as an integer
	 */
	public ConcertDate(int time) {
		super();  
		this.setTime(time);			
	}
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Time getter method
	 * @return concert time as an Integer
	 */
	public int getTime() {
		return time;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Time setter method - set time of concert with an integer parameter
	 * @param time as an integer 
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * time of when the concert begins as a private integer
	 */
	private int time;
	
	
}/*	End of CLASS:	ConcertDate.java			*/
