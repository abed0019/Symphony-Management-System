package symphony.domain;


/**
 * Concert Entity Abstract class - factored Name and ID shared by many classes
 * <br> Parent class to any Object that has name(String or Name object) and id
 * 
 * Inner class UniqueID by Kathleen McNulty, Auto Generate ID with Singleton Pattern
 * Ensures each ID is unique
 * 
 * @author    Ash-Lee Hommy 040840815
 * @version   1.0.0 November, 2016
 */
public abstract class ConcertEntity {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor to set name and id with Singleton Pattern
	 * @param id the ID + UID
	 * @param name the name, can be a String or Name Object
	 */
	ConcertEntity(String id, Object name) {
		int uid = UniqueID.getInstance();
		this.id = id+uid;
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
	
	static class UniqueID{
		private static int uid = 0;
		public static int getInstance(){
			uid++;
			return uid;
		}
	}

	

}	/*	End of CLASS:	ConcertEntity.java			*/


