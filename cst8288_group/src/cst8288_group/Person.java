package cst8288_group;

/**
 * Person is an abstract class that contains the most basic information about an individual.
 * @author    Chase Thorne
 * @version   1.0.0 October 25, 2016
 */
public abstract class Person	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor for the Person abstract class to set a person's given, middle, family name, and home address.
	 * @param givenName		String containing the given (first) name of a person.
	 * @param middleName	String containing the middle name of a person.
	 * @param familyName	String containing the family (last) name of a person.
	 * @param homeAddress	String containing the home address of a person.
	 */
	public Person(String givenName, String middleName, String familyName, Address homeAddress) {
		setGivenName(givenName);
		setMiddleName(middleName);
		setFamilyName(familyName);
		setHomeAddress(homeAddress);
	}

	/**
	 * Overloaded constructor for the Person abstract class to set a person's given, family name, and home address.
	 * @param givenName		String containing the given (first) name of a person.
	 * @param familyName	String containing the family (last) name of a person.
	 * @param homeAddress	String containing the home address of a person.
	 */
	public Person(String givenName, String familyName, Address homeAddress) {
		setGivenName(givenName);
		setMiddleName(null);
		setFamilyName(familyName);
		setHomeAddress(homeAddress);
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/



	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/



	/* ATTRIBUTES	-----------------------------------------------------	*/
	private String givenName;
	private String middleName;
	private String familyName;
	private Address homeAddress;



}	/*	End of CLASS:	Skeleton.java			*/
