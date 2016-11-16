package cst8288_group;

/**
 * Person is a class that contains the most basic information about an individual.
 * @author    Chase Thorne
 * @version   1.0.1 November 8, 2016
 */
public class Person extends ConcertEntity	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor for the Person class to set a person's name, home address, phone number, and identification.
	 * @param name			Name object containing the name of a person.
	 * @param homeAddress	String containing the home address of a person.
	 * @param phoneNumber	PhoneNumber object containing the person's phone number.
	 * @param id			String containing the person's identification.
	 */
	public Person(Name name, Address homeAddress, PhoneNumber phoneNumber, String id) {
		setName(name);
		setHomeAddress(homeAddress);
		setPhoneNumber(phoneNumber);
		setID(id);
	}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Retrieves a Name object containing a person's name.
	 * @return
	 */
	@Override
	public Name getName() {
		return name;
	}

	/**
	 * Retrieves an Address Object containing a person's home address.
	 * @return An Object of the Address class containing a person's home address.
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}
	
	/**
	 * Retrieves a PhoneNumber object representing a person's phone number.
	 * @return Integer containing a person's phone number.
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Retrieves an integer representing a person's phone number.
	 * @return Integer containing a person's identification number.
	 */
	public String getID() {
		return id;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Sets the Name object containing a person's name.
	 * @param givenName Name object containing a person's name.
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * Sets the Address Object containing a person's home address.
	 * @param homeAddress An Object of the Address class containing a person's home address.
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	/**
	 * Sets the integer containing a person's phone number.
	 * @param phoneNumber Integer value representing a person's phone number.
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Sets the String containing a person's identification number.
	 * @param id
	 */
	public void setID(String id) {
		this.id = id;
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/



	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * A person name represented by a Name object.
	 */
	private Name name;
	
	/**
	 * A person's home address represented by an Object of the Address class.
	 */
	private Address homeAddress;
	
	/**
	 * A person's phone number represented by a PhoneNumber object.
	 */
	private PhoneNumber phoneNumber;
	
	/**
	 * A person's identification number represented by an alphanumeric code stored in a String.
	 */
	private String id;


}	/*	End of CLASS:	Person.java			*/
