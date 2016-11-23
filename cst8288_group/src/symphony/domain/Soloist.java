package symphony.domain;

import java.sql.Date;

											
/**
 * Soloist Class
 * A person who performs a given composition ( 0 to many )
 * Has an identification number
 * Has an area of expertise
 * Committee records soloist's full name, address & phone number
 * Last performance date is recorded
 * 
 * @author    Zobayed Abedin
 * @version   1.0.0 October 25, 2016
 */



public class Soloist extends Person {

	
	
	
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	
	

	public Soloist (Name name, Address homeAddress, PhoneNumber phoneNumber, String id) {
		
		super(name, homeAddress, phoneNumber, id);
		
		//setSoloistID(soloistID);
		
	}
	
	
	

	/**
	 *	Paramertized constructor.
	 *	@param	value	Some attribute value.
	 */




	/* ACCESSORS	-----------------------------------------------------	*/
	
	
	
	/**
	 * Soloist ID getter method - returns the unique ID of a Soloist
	 * 
	 */
	
	
	
	
	/**public String getSoloistID() {
		
		return this.soloistID;
		
	}
*/

	/**
	 * Soloist expertise getter method -  returns the area of expertise of a soloist ( e.g, sax player, fluist )
	 * 
	 */
	
	public String getSoloistExpertise(){
		
		return this.expertise;
		
	}
	
	

	/**
	 * 
	 *  Returns soloist's last performed date
	 * 
	 */
	
	
	public Date getlastPerformedDate(){
		
		return this.getlastPerformedDate();
		
	}
	
	
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	
	/**
	 * Sets soloist's unique ID. Combination of Letters and Numbers. 
	 *
	 */
	
	public void setSoloistID(String id) {
		
		this.soloistID = id;
		
	}
	
	
	/**
	 * Sets soloist's area of expertise (e.g. sax player, fluist). 
	 *
	 */
	
	public void setSoloistExpertise ( String expt){
		
		this.expertise = expt;
		
	}
	
	/**
	 * Sets soloist's last performed date 
	 * 
	 */
	
	
	public void setLastPerformedDate(Date lastPerformedDate){
		 this.lastPerformedDate = lastPerformedDate;
	}

	
	
	
	
	

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	
	


	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/


	
	

	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */




	/* ATTRIBUTES	-----------------------------------------------------	*/
	/* TODO:	Place Attributes here.													*/
	
	
	private String soloistID;
	
	private String expertise;
	
	private Date lastPerformedDate;


}	/*	End of CLASS:	*/