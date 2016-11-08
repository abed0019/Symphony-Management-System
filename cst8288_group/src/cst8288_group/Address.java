package cst8288_group;

/**
 * <b>Address Class</b>
 * <br>An address contains the street number, name, apartment, province or state, and postal or zip code of a location.
 * @author    Chase Thorne
 * @version   1.0.1 November 8, 2016
 */

public class Address	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Overloaded constructor for the Address class to set the street address, additional addressing, city, province, postal code, and country.
	 * @param streetLine1		A String containing the street name, number, and, if applicable, apartment or suite number.
	 * @param streetLine2	A String containing additional addressing information required, such as apartment, suite, room, department, or other.
	 * @param city			A String containing the city name.
	 * @param province		A String containing the abbreviated province or state name.
	 * @param postalCode	A String containing the postal or zip code.
	 * @param country		A String containing the country name.
	 */
	public Address(String streetLine1, String streetLine2, String city, String province, String postalCode, String country) {
		setStreetLine1(streetLine1);
		setStreetLine2(streetLine2);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setCountry(country);
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
	public String getStreetLine2() {
		return streetLine2;
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
	 * @param streetLine2 The additional addressing information.
	 */
	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
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
		if (!getStreetLine2().isEmpty()) address.concat("\n" + getStreetLine2());
		address.concat("\n" + getCity() + " " + getProvince() + "  " + getPostalCode());
		if (!getCountry().equals("Canada")) address.concat("\n" + getCountry());

		return address;
	}


	/* HELPER METHODS	--------------------------------------------------	*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/

	

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The street address of a person or place represented as a private String.
	 */
	private String streetLine1;
	
	/**
	 * Additional addressing information represented as a private String.
	 */
	private String streetLine2;
	
	/**
	 * The city name represented as a private String
	 */
	private String city;
	
	/**
	 * The province or state abbreviation represented by a private String.
	 */
	private String province;
	
	/**
	 * The postal or zip code represented by a private String.
	 */
	private String postalCode;
	
	/**
	 * The country name represented by a private String.
	 */
	private String country;


}	/*	End of CLASS:	Address.java			*/