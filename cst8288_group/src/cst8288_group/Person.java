package cst8288_group;

/**
 * Person is an abstract class that contains the most basic information about an individual.
 * @author    Chase Thorne
 * @version   1.0.0 October 25, 2016
 */
public abstract class Person	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor for the Person abstract class to set a person's given, middle, family name, home address, and phone number.
	 * @param givenName		String containing the given (first) name of a person.
	 * @param middleName	String containing the middle name of a person.
	 * @param familyName	String containing the family (last) name of a person.
	 * @param homeAddress	String containing the home address of a person.
	 */
	public Person(String givenName, String middleName, String familyName, Address homeAddress, int phoneNumber) {
		setGivenName(givenName);
		setMiddleName(middleName);
		setFamilyName(familyName);
		setHomeAddress(homeAddress);
		setPhoneNumber(phoneNumber);
	}

	/**
	 * Overloaded constructor for the Person abstract class to set a person's given, family name, home address, and phone number.
	 * @param givenName		String containing the given (first) name of a person.
	 * @param familyName	String containing the family (last) name of a person.
	 * @param homeAddress	String containing the home address of a person.
	 */
	public Person(String givenName, String familyName, Address homeAddress, int phoneNumber) {
		this(givenName, null, familyName, homeAddress, phoneNumber);
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Retrieves a String containing the person's given name.
	 * @return String containing the person's given name.
	 */
	private String getGivenName() {
		return givenName;
	}

	/**
	 * Retrieves a String containing the person's middle name.
	 * @return String containing the person's middle name.
	 */
	private String getMiddleName() {
		return middleName;
	}

	/**
	 * Retrieves a String containing the person's family name.
	 * @return String containing the person's family name.
	 */
	private String getFamilyName() {
		return familyName;
	}

	/**
	 * Creates a String containing the person's full name in format:
	 * <br>GIVENNAME MIDDLENAME FAMILYNAME
	 * <br>or GIVENNAME FAMILYNAME (if the person has no middle name specified)
	 * @return String containing a person's full name.
	 */
	public String getFullName() {
		String name = getGivenName();
		if (!getMiddleName().isEmpty()) name.concat(" " + getMiddleName());
		name.concat(" " + getFamilyName());
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
	 * Retrieves an integer representing a person's phone number.
	 * @return Integer containing a person's phone number.
	 */
	public int phoneNumber() {
		return phoneNumber;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Sets the String containing a person's given name.
	 * @param givenName String containing a person's given name.
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * Sets the String containing a person's middle name.
	 * @param middleName String containing a person's middle name.
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Sets the String containing a person's family name.
	 * @param familyName String containing a person's family name.
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
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
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/



	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * A person's given name represented by a String.
	 */
	private String givenName;
	
	/**
	 * A person's middle name represented by a String.
	 */
	private String middleName;
	
	/**
	 * A person's family name represented by a String.
	 */
	private String familyName;
	
	/**
	 * A person's home address represented by an Object of the Address class.
	 */
	private Address homeAddress;
	
	/**
	 * A person's phone number represented by an integer value.
	 */
	private int phoneNumber;


}	/*	End of CLASS:	Person.java			*/
