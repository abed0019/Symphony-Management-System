package symphony.domain;

/**
 * <b>Address Class</b>
 * <br>An address contains the street number, name, apartment, province or state, and postal or zip code of a location.
 * @author   Zobayed Abedin
 * @version   1.0.1 November 8, 2016
 */

public class Address	{
	
	public static class Builder {
		
		//required parameters
		private String streetLine1;
		private String city;
		private String province;
		private String postalCode;
		
		//optional parameters
		private String streetLine2 = "";
		private String country = "";
		
		/**
		 * Default constructor for the required parameters.
		 * @param streetLine1 Street address, usually street number, name as a String.
		 * @param city City name as a String.
		 * @param province Province name as a String.
		 * @param postalCode Postal Code as a String.
		 */
		public Builder(String streetLine1, String city, String province, String postalCode) {
			this.streetLine1 = streetLine1;
			this.city = city;
			this.province = province;
			this.postalCode = postalCode;
		}
		
		/**
		 * Builder for the optional parameter streetLine2.
		 * @param streetLine2 Second line for additional addressing information, typically
		 * apartment, room, suite, or some other necessary information.
		 * @return The Builder object with the stored streetLine2 String.
		 */
		public Builder streetLine2(String streetLine2) {
			this.streetLine2 = streetLine2;
			return this;
		}
		
		/**
		 * Builder for the optional parameter country.
		 * @param country String containing the country name.
		 * @return The Builder object with the stored country String.
		 */
		public Builder country(String country) {
			this.country = country;
			return this;
		}
		
		/**
		 * Constructs the Address object based on the specified parameters.
		 * @return Address object with specified parameters.
		 */
		public Address build() {
			return new Address(this);
		}
	}
	
	/**
	 * Constructor using the Build pattern.
	 * @param builder The Builder specific to the Address class.
	 */
	private Address(Builder builder) {
		this.streetLine1 	= builder.streetLine1;
		this.streetLine2 	= builder.streetLine2;
		this.city 			= builder.city;
		this.province 		= builder.province;
		this.postalCode 	= builder.postalCode;
		this.country 		= builder.country;
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
		if (!getStreetLine1().equals("")) {address = address.concat("\n" + getStreetLine2());}
		address = address.concat("\n" + getCity() + " " + getProvince() + " " + getPostalCode());
		if (!getCountry().equals("")) {address = address.concat("\n" + getCountry());}
		
		
		
		return address;
	}


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