
package symphony.domain;								

/**
 * <b>Movement Class</b>
 * <br>A movement is a self-contained part of music within a Composition .
 * <br>A Composition may have 0 to many Movements.
 * @author    Ash-Lee Hommy
 * @version   1.0.0 October 23rd, 2016
 */
public class Movement extends ConcertEntity{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for Movement
	 */
	public Movement() {
		super();
		
	}
	/**
	 * Overloaded constructor to set Movement's name, number and ID
	 * @param movName the name of the Movement
	 * @param movNum the number of the Movement
	 * @param movID the Movement unique identifier
	 */
	public Movement(String movName, int movNum, String movID) {
		setMovementNumber(movNum);
		setName(movName);
		setID(movID);
	}
	
	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Movement number getter method
	 * @return the Movement number as an int
	 */
	public int getMovementNumber() {
		return movementNumber;
	}


	/* MODIFIERS	-----------------------------------------------------	*/

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
				+ "movementID=" + getID() 
				+ " movementName=" + getName()
				+ " movementNumber=" + getMovementNumber()
				+ " ]";
	}									


	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/**
	 * The number of the Movement within the Composition, chosen by the Composer
	 * <br>Represented as a private int
	 */
	private int movementNumber;


}	/*	End of CLASS:	Movement.java			*/
