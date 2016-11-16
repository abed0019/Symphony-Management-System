package cst8288_group;

/**
 * Concert Entity Abstract class - factored Name and ID shared by many classes
 * <br> Parent class to any Object that has name(String or Name object) and id
 * 
 * @author    Ash-Lee Hommy 040840815
 * @version   1.0.0 November, 2016
 */
public abstract class ConcertEntity {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Name getter method
	 * @return the name as a String
	 */
	protected Object getName() {
		return name;
	}
	/**
	 * ID getter method
	 * @return the ID as a String
	 */
	protected String getID() {
		return id;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Name setter method
	 * @param name the name of the Object
	 */
	protected void setName(String name) {
		this.name = name;
	}
	/**
	 * ID setter method
	 * @param id the ID of the Object
	 */
	protected void setID(String id) {
		this.id = id;
		
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/



	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * ID represented as a String (mix of numbers of letters)
	 */
	protected String id = "";
	/**
	 * Name represented as a String
	 */
	protected String name = "";


}	/*	End of CLASS:	ConcertEntity.java			*/
