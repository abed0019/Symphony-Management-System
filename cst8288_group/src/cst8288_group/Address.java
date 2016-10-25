package cst8288_group;

/**
 * <b>Address Class</b>
 * <br>An address contains the street number, name, apartment, province or state, and postal or zip code of a location.
 * @author    Chase Thorne
 * @version   1.0.0 October 25, 2016
 */

public class Address	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor for the Address class to set the street address, additional addressing, city, province, postal code, and country.
	 * @param street		A String containing the street name, number, and, if applicable, apartment or suite number.
	 * @param additional	A String containing additional addressing information required, such as apartment, suite, room, department, or other.
	 * @param city			A String containing the city name.
	 * @param province		A String containing the abbreviated province or state name.
	 * @param postalCode	A String containing the postal or zip code.
	 * @param country		A String containing the country name.
	 */
	public Address(String street, String additional, String city, String province, String postalCode, String country) {
		setStreetLine1(street);
		setAdditional(additional);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setCountry(country);
	}

	/**
	 * Overloaded constructor for the Address class to set the street address, city, province, postal code, and country, without the additional addressing information.
	 * @param street		A String containing the street name, number, and, if applicable, apartment or suite number.
	 * @param city			A String containing the city name.
	 * @param province		A String containing the abbreviated province or state name.
	 * @param postalCode	A String containing the postal or zsip code.
	 * @param country		A String containing the country name.
	 */
	public Address(String street, String city, String province, String postalCode, String country) {
		this(street, null, city, province, postalCode, country);
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Retrieves String containing the street address.
	 * @return String containing the street address.
	 */
	public String getStreetLine1() {
		return streetLine1;
	}

	/**
	 * Retrieves the String containing the additional addressing information.
	 * @return String containing the additional addressing information.
	 */
	public String getAdditional() {
		return additional;
	}

	/**
	 * Retrieves the String containing the city name.
	 * @return String containing the city name.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Retrieves the String containing the province or state abbreviation.
	 * @return String containing the province or state abbreviation.
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Retrieves the String containing the postal or zip code.
	 * @return String containing the postal or zip code.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Retrieve the String containing the country name.
	 * @return String containing the country name.
	 */
	public String getCountry() {
		return country;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Sets the String containing the street name, number, and, if applicable, apartment or suite number.
	 * @param streetLine1 The street address of a person or place.
	 */
	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	/**
	 * Sets the String containing additional addressing information, if required.
	 * @param additional The additional addressing information.
	 */
	public void setAdditional(String additional) {
		this.additional = additional;
	}

	/**
	 * Sets the String containing the city name.
	 * @param city The city name.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the String containing the province abbreviation.
	 * @param province The province abbreviation.
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * Sets the postal or zip code.
	 * @param postalCode The postal or zip code.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Sets the country name.
	 * @param country The country name.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overwritten toString() method, formatted to Canada Post addressing specifications.
	 * <br>STREET ADDRESS
	 * <br>ADDITIONAL ADDRESSING (if present)
	 * <br>CITY PROVINCE  POSTAL CODE
	 * <br>COUNTRY (if not Canada)
	 */
	public String toString() {
		String address = getStreetLine1();
		if (getAdditional().isEmpty()) address.concat("\n" + getAdditional());
		address.concat("\n" + getCity() + " " + getProvince() + "  " + getPostalCode());
		if (!getCountry().equals("Canada")) address.concat("\n" + getCountry());

		return address;
	}


	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/

	

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The street address of a person or place.
	 * <br>Represented as a private String containing the street name, number, and, if applicable, the apartment or suite number.
	 */
	private String streetLine1;
	
	/**
	 * Additional addressing information.
	 * <br>Represented as a private String containing any additional addressing information required, such as apartment or suite number, department, or other.
	 */
	private String additional;
	
	/**
	 * The city name.
	 * <br>Represented as a private String containing the city's name.
	 */
	private String city;
	
	/**
	 * The province or state abbreviation.
	 * <br>Represented by a private String containing the province or state's abbreviation.
	 */
	private String province;
	
	/**
	 * The postal or zip code.
	 * <br>Represented by a private String containing the postal or zip code.
	 */
	private String postalCode;
	
	/**
	 * The country name.
	 * <br>Represented by a private String containing the country name.
	 */
	private String country;


}	/*	End of CLASS:	Address.java			*/