package cst8288_group;


/**
 * Name is a class that contains the given, middle, family name, and honorific of a person.
 * @author    Chase Thorne
 * @version   1.0.0 November 8, 2016
 */
public class Name {

	/* CONSTRUCTORS	--------------------------------------------------	*/

	//	/**
	//	 * Default constructor.
	//	 * @param honorific Title that precedes a name.
	//	 * @param given		Given or first name.
	//	 * @param middle	Middle name.
	//	 * @param surname	Surname or family name
	//	 */
	//	public Name(String honorific, String given, String middle, String surname) {
	//		setHonorific(honorific);
	//		setGiven(given);
	//		setMiddle(middle);
	//		setSurname(surname);
	//	}

	public static class Builder {
		
		//required parameters
		private String given;
		private String surname;
		
		//optional parameters
		private String middle = "";
		private String honorific = "";

		public Builder(String given, String surname) {
			this.given = given;
			this.surname = surname;
		}

		public Builder middle(String middle) {
			this.middle = middle;
			return this;
		}

		public Builder honorific(String honorific) {
			this.honorific = honorific;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
		
	}

	private Name(Builder builder) {
		given		= builder.given;
		surname		= builder.surname;
		middle 		= builder.middle;
		honorific 	= builder.honorific;
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
		return "honorific=" + getHonorific()
				+ ",given=" + getGiven()
				+ ",middle=" + getMiddle()
				+ ",surname=" + getSurname();
		
//		Uncertain why the below string formatter isn't working.
//		
//		String[] array = new String[] {getHonorific(), getGiven(), getMiddle(), getSurname()};
//		String name = "";
//		for (String string : array) {
//			if (!string.isEmpty()) name.concat(string + " ");
//		}
//		return name.trim();
	}
	
	
	/*  ENTRY/TESTING ---------------------------------------------------   */
	
	public static void main(String[] args) {
		System.out.println("Testing Name builder...");
		
		Name name1 = new Name.Builder("Chase", "Thorne").build();
		Name name2 = new Name.Builder("Chase", "Thorne").
				middle("Nelson").honorific("Mr.").build();
		
		System.out.println(name1.toString());
		System.out.println(name2.toString());
		System.out.println("Done testing Name builder.");
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
