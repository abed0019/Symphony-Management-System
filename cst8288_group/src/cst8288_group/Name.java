package cst8288_group;


/**
 * Name is a class that contains the given, middle, family name, and honorific of a person.
 * @author    Chase Thorne
 * @version   1.0.0 November 8, 2016
 */
public class Name {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	
	/**
	 * Default constructor.
	 * @param honorific Title that precedes a name.
	 * @param given		Given or first name.
	 * @param middle	Middle name.
	 * @param surname	Surname or family name
	 */
	public Name(String honorific, String given, String middle, String surname) {
		setHonorific(honorific);
		setGiven(given);
		setMiddle(middle);
		setSurname(surname);
	}
	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Retrieves a person's given name.
	 * @return String representing a person's given name.
	 */
	public String getGiven() {
		return given;
	}
	
	/**
	 * Retrieves a person's middle name.
	 * @return String representing a person's middle name.
	 */
	public String getMiddle() {
		return middle;
	}

	/**
	 * Retrieves a person's surname.
	 * @return String representing a person's surname.
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Retrieves a person's honorific.
	 * @return String representing a person's honorific.
	 */
	public String getHonorific() {
		return honorific;
	}
	
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Store's a person's given name.
	 * @param given String representing a person's given name.
	 */
	public void setGiven(String given) {
		this.given = given;
	}

	/**
	 * Store's a person's middle name.
	 * @param given String representing a person's middle name.
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}

	/**
	 * Store's a person's surname.
	 * @param given String representing a person's surname.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Store's a person's honorific.
	 * @param given String representing a person's given name.
	 */
	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}
	
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	
	/**
	 * toString method that returns a person's full name in the form:
	 * HONORIFIC. GIVEN MIDDLE SURNAME
	 */
	public String toString() {
		String[] nameArray = new String[] {honorific, given, middle, surname};
		String name = "";
		for (String s : nameArray) {
			if (!s.isEmpty()) name.concat(s + " ");
		}
		return name.trim();
		
	}
	
	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/**
	 * A person's given name represented by a String.
	 */
	private String given;
	
	/**
	 * A person's middle name represented by a String.
	 */
	private String middle;
	
	/**
	 * A person's surname represented by a String.
	 */
	private String surname;
	
	/**
	 * A person's honorific represented by a String.
	 */
	private String honorific;
}
