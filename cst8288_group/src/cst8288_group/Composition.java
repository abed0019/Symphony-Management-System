package cst8288_group;									

import java.util.ArrayList;

/**
 * Composition Class
 * A Composition is an original instrumental piece of music to be performed in a Concert (0 to many)
 * A Composer selects Compositions with the Committee & gives name and number to Movements.
 * A Composition may have 0 to many Movements.
 * 
 * @author    Ash-Lee Hommy
 * @version   1.0.0 October 23rd, 2016
 */
public class Composition	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for Composition
	 */
	public Composition() {
		super();
	}
	/**
	 * Overloaded constructor for adding a Composition with no movements
	 * @param id the Composition identification number
	 * @param name the name of the Composition as set by the Composition
	 * @param composer the Composer of the Composition
	 */
	public Composition(String id, String name, String composer) {
		setCompositionID(id);
		setCompositionName(name);
		setComposer(composer);
		movementList = new ArrayList<Movement>();
	}
	/**
	 * Overloaded constructor for adding a Composition with movements
	 * @param id the Composition identification number
	 * @param name the name of the Composition as set by the Composition
	 * @param composer the Composer of the Composition
	 * @param movements the list of Movements within the Composition
	 */
	public Composition(String id, String name, String composer, ArrayList<Movement> movements) {
		setCompositionID(id);
		setCompositionName(name);
		setComposer(composer);
		setMovementList(movements);
		
		}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Composition ID getter method
	 * @return the Composition ID as a String
	 */
	public String getCompositionID() {
		return compositionID;
	}
	/**
	 * Composition name getter method
	 * @return the Composition name as a String
	 */
	public String getCompositionName() {
		return compositionName;
	}
	/**
	 * Composer getter method - may change to a Composer object?
	 * @return the Composer as a String (for now)
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * List of movements getter method
	 * @return - a list of the Movements in the Composition as an ArrayList
	 */
	public ArrayList<Movement> getMovementList() {
		return movementList;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Composition ID setter method - sets id with a String parameter
	 * @param id the Composition identifier (combination of letters and numbers)
	 */
	public void setCompositionID(String id) {
		compositionID = id;
	}
	/**
	 * Composition name setter method - sets name with String parameter
	 * @param name the Composition name
	 */
	public void setCompositionName(String name) {
		compositionName = name;
	}
	/**
	 * Composer setter method - sets composer with a String param (for now)
	 * @param composer the Composer of the Composition
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * Movement List setter method - sets ArrayList of Movements within a Composition (0 to many) with an ArrayList<Movement> param
	 * @param movements the list of movements within the composition
	 */
	public void setMovementList(ArrayList<Movement> movements) {
		movementList = movements;
	}


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Composition as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ " 
				+ "compositionID=" + getCompositionID() 
				+ " compositionName=" + getCompositionName()
				+ " composer=" + getComposer()
				+ " movementList=" + getMovementList()
				+ " ]";
	}



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * uses the WrapperManager to start the ServerWrapper object.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		Movement mov1 = new Movement("TheFirst", 1);
		Movement mov2 = new Movement("TheFirst", 2);
		Movement mov3 = new Movement("Movement", 1);
		
		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(mov1);
		testMovementsList.add(mov2);
		testMovementsList.add(mov3);
		
		Composition comp1 = new Composition();
		Composition comp2 = new Composition("Comp2id", "SecondComposition", "Mr.Composer");
		Composition comp3 = new Composition("CompMov3id", "MovementComposition", "Mr.Composer", testMovementsList);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		System.out.println(comp3.toString());
	}



	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The ID of the Composition, as set by the Composer
	 * <br>Represented as a private String
	 */
	private String compositionID;
	/**
	 * The name of the Composition, as set by the Composer
	 * <br>Represented as a private String
	 */
	private String compositionName;
	/**
	 * The composer of the Composition (may be a Class or type of Person?)
	 * <br>TODO figure out what the composer is
	 * <br>Represented as a private String (for now)
	 */
	private String composer; //Will Composer be a Class? or a type of Person? a String for now
	/**
	 * The list of Movements within the Composition (0 to many)
	 * 
	 * <br>Represented as a private ArrayList of Movement Objects
	 */
	private ArrayList<Movement> movementList;	
	



}	/*	End of CLASS:	Composition.java			*/

