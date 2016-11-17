package symphony.domain;

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
	public Person(Name name, Address address, PhoneNumber phoneNumber, String id) {
		super.setID(id); // should use constructor?
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
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
	public Address getAddress() {
		return address;
	}
	
	/**
	 * Retrieves a PhoneNumber object representing a person's phone number.
	 * @return Integer containing a person's phone number.
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
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
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Sets the integer containing a person's phone number.
	 * @param phoneNumber Integer value representing a person's phone number.
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	private Address address;
	
	/**
	 * A person's phone number represented by a PhoneNumber object.
	 */
	private PhoneNumber phoneNumber;
	
	/**
	 * A person's identification number represented by an alphanumeric code stored in a String.
	 */
	private String id;


}	/*	End of CLASS:	Person.java			*/
