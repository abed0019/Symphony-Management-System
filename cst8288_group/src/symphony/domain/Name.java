package symphony.domain;


/**
 * Name is a class that contains the given, middle, family name, and honorific of a person.
 * @author    Chase Thorne
 * @version   1.0.0 November 8, 2016
 */
public class Name {

	/* CONSTRUCTORS	--------------------------------------------------	*/

	public static class Builder {
		
		//required parameters
		private String given;
		private String surname;
		
		//optional parameters
		private String middle = "";
		private String honorific = "";

		/**
		 * Default constructor for the required parameters.
		 * @param given A person's given name.
		 * @param surname A person's surname.
		 */
		public Builder(String given, String surname) {
			this.given = given;
			this.surname = surname;
		}

		/**
		 * Builder for the optional parameter middle.
		 * @param middle A person's middle name.
		 * @return The Builder object with the stored middle name String.
		 */
		public Builder middle(String middle) {
			this.middle = middle;
			return this;
		}

		/**
		 * Builder for the optional parameter honorific.
		 * @param honorific A person's honorific.
		 * @return The Builder object with the stored honorific String.
		 */
		public Builder honorific(String honorific) {
			this.honorific = honorific;
			return this;
		}
		
		/**
		 * Constructs the Name object based on the specified parameters.
		 * @return Name object with specified parameters.
		 */
		public Name build() {
			return new Name(this);
		}
	}

	/**
	 * Constructor using the Build pattern.
	 * @param builder The Builder specific to the Name class.
	 */
	private Name(Builder builder) {
		this.given		= builder.given;
		this.surname	= builder.surname;
		this.middle 	= builder.middle;
		this.honorific 	= builder.honorific;
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
		String name = "";
		if (!getHonorific().isEmpty()) name = name.concat(getHonorific() + " ");
		name = name.concat(getGiven());
		if (!getMiddle().isEmpty()) name = name.concat(" " + getMiddle() + " ");
		name = name.concat(getSurname());
		return name;
	}
	
	
	/* ATTRIBUTES	-----------------------------------------------------	*/

	/**
	 * A person's given name represented by a String.
	 */
	private String given;

	/**
	 * A person's surname represented by a String.
	 */
	private String surname;

	/**
	 * A person's middle name represented by a String.
	 */
	private String middle;

	/**
	 * A person's honorific represented by a String.
	 */
	private String honorific;
}
