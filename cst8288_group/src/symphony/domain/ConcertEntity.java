package symphony.domain;

/**
 * Concert Entity Abstract class - factored Name and ID shared by many classes
 * <br> Parent class to any Object that has name(String or Name object) and id
 * 
 * @author    Ash-Lee Hommy 040840815
 * @version   1.0.0 November, 2016
 */
public abstract class ConcertEntity {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor to set name and id
	 * @param id the unique ID
	 * @param name the name, can be a String or Name Object
	 */
	ConcertEntity(String id, Object name) {
		this.id = id;
		this.name = name;
	}
	
	ConcertEntity() {
		
	}
	

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Name getter method
	 * @return the name as a String
	 */
	public Object getName() {
		return name;
	}
	/**
	 * ID getter method
	 * @return the ID as a String
	 */
	public String getID() {
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
	protected String id;
	/**
	 * Name represented as an Object (can be a String or a Name Object)
	 * 
	 */
	protected Object name;


}	/*	End of CLASS:	ConcertEntity.java			*/
