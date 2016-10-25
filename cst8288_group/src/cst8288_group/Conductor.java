package cst8288_group;

/**
 * Conductor extends the Person class, adding a conductor identification number.
 * @author    Chase Thorne
 * @version   1.0.0 Date
 */
public class Conductor extends Person {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	public Conductor(String givenName, String middleName, String familyName, Address homeAddress, int phoneNumber) {
		super(givenName, middleName, familyName, homeAddress, phoneNumber);
		setConductorID(conductorID);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	public int getConductorID() {
		return this.conductorID;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	public void setConductorID(int conductorID) {
		this.conductorID = conductorID;
	}


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/* TODO:	Place public behavior here.											*/



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	int conductorID;



}	/*	End of CLASS:	Conductor.java			*/
