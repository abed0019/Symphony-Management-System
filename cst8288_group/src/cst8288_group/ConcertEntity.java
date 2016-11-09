package cst8288_group;

/**
 * Abstract class - factored out everything shared by many classes
 * @author    Ash-Lee Hommy 040840815
 * @version   1.0.0 November, 2016
 */
public abstract class ConcertEntity {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	

	/* ACCESSORS	-----------------------------------------------------	*/
	protected String getName() {
		return name;
	}
	 
	protected String getID() {
		return id;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	protected void setName(String name) {
		this.name = name;
	}
	
	protected void setID(String id) {
		this.id = id;
		
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/



	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	protected String id = "";
	protected String name = "";


}	/*	End of CLASS:	ConcertEntity.java			*/
