
package cst8288_group;								

/**
 * <b>Movement Class</b>
 * <br>A movement is a self-contained part of music within a Composition .
 * <br>A Composition may have 0 to many Movements.
 * @author    Ash-Lee Hommy
 * @version   1.0.0 October 23rd, 2016
 */
public class Movement	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for Movement
	 */
	public Movement() {
		super();
		
	}
	/**
	 * Overloaded constructor to set Movement's name, number and ID
	 * @param movName
	 * @param movNum
	 */
	public Movement(String movName, int movNum) {
		setMovementNumber(movNum);
		setMovementName(movName);
		setMovementID(movName + movNum);
	}
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Movement ID getter method
	 * @return the Movement ID as a String (Name and number)
	 */
	public String getMovementID	() {
		return movementID;
	}
	/**
	 * Movement number getter method
	 * @return the Movement number as an int
	 */
	public int getMovementNumber() {
		return movementNumber;
	}
	/**
	 * Movement name getter method
	 * @return the Movement name as a String
	 */
	public String getMovementName() {
		return movementName;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * MovementID setter method - private because this should not be used to set the ID directly
	 * <br>A concatenation of the Movement name and number, set with a parameter
	 * @param id the Movement identifier: the name and number
	 */
	private void setMovementID(String id) {
		movementID = id;
	}
	/**
	 * Movement name setter method - sets Movement name with a String parameter
	 * @param name String representation of the Movement name
	 */
	public void setMovementName(String name) {
		movementName = name;
	}
	/**
	 * Movement number setter method - sets the Movement number with an int parameter
	 * @param num int representation of the Movement number
	 */
	public void setMovementNumber(int num) {
		movementNumber = num;
	}
	


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Movement as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ " 
				+ "movementID=" + getMovementID() 
				+ " movementName=" + getMovementName()
				+ " movementNumber=" + getMovementNumber()
				+ " ]";
	}									



	/* HELPER METHODS	--------------------------------------------------	*/
	//Maybe have a private helper method that creates a new movement? Doubt I need that.



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * uses the WrapperManager to start the ServerWrapper object.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		//I will use this for testing purposes and then delete it
		Movement mov1 = new Movement();
		Movement mov2 = new Movement("TheMovement", 1);
		
		System.out.println(mov1.toString());
		System.out.println(mov2.toString());
	}



	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/**
	 * Identification of the movement, represented by the String concatenation of the Movement name and number
	 * <br>Represented as a private String
	 */
	private String movementID;
	/**
	 * The number of the Movement within the Composition, chosen by the Composer
	 * <br>Represented as a private int
	 */
	private int movementNumber;
	/**
	 * The name of the Movement within the Composition, chosen by the Composer
	 * <br>Represented as a private String
	 */
	private String movementName;




}	/*	End of CLASS:	Movement.java			*/
