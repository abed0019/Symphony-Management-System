package symphony.domain;

/**
 * PhoneNumber is a class that contains the full phone number of a person or place.
 * @author    Chase Thorne
 * @version   1.0.0 November 8, 2016
 */
public class PhoneNumber {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	
	/**
	 * Default Constructor.
	 * @param country String containing the country code of the phone number.
	 * @param area String containing the area code of the phone number.
	 * @param subscriber1 String containing the first part of the subscriber number of a person's phone number.
	 * @param subscriber2 String containing the second part of the subscriber number of a person's phone number.
	 */
	public PhoneNumber(String country, String area, String subscriber1, String subscriber2) {
		setCountry(country);
		setArea(area);
		setSubscriber1(subscriber1);
		setSubscriber2(subscriber2);
	}
	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Retrieves the String containing the country code.
	 * @return String containing the country code.
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Retrieves the String containing the area code.
	 * @return String containing the area code.
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * Retrieves the String containing the first part of the subscriber number.
	 * @return String containing the first part of the subscriber number.
	 */
	public String getSubscriber1() {
		return subscriber1;
	}
	
	/**
	 * Retrieves the String containing the second part of the subscriber number.
	 * @return String containing the second part of the subscriber number.
	 */
	public String getSubscriber2() {
		return subscriber2;
	}
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the String containing the country code.
	 * @param country String containing the country code.
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Sets the String containing the area code.
	 * @param area String containing the area code.
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	/**
	 * Sets the String containing the first part of the subscriber number.
	 * @param subscriber1 String containing the first part of the subscriber number.
	 */
	public void setSubscriber1(String subscriber1) {
		this.subscriber1 = subscriber1;
	}
	
	/**
	 * Sets the String containing the second part of the subscriber number.
	 * @param subscriber2 String containing the second part of the subscriber number.
	 */
	public void setSubscriber2(String subscriber2) {
		this.subscriber2 = subscriber2;
	}
	
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Returns the PhoneNumber class as a String, formatted as:
	 * <pre>	+CCC AAA SS1 SSS2
	 * or 	AAA SS1 SSS2 if no country code is specified
	 * where 	C = country code, 
	 * 	A = area code, 
	 * 	S1 = subscriber local geographic area code, 
	 * 	S2 = subscriber person code.</pre>
	 */
	public String toString() {
		String number = "";
		if (!country.isEmpty()) number = "+" + getCountry() + " ";
		number.concat(getArea() + " " + getSubscriber1() + " " + getSubscriber2());
		return number;
	}
	
	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/**
	 * Country code of a phone number stored as a String.
	 */
	private String country;
	
	/**
	 * Area code of a phone number stored as a String.
	 */
	private String area;
	
	/**
	 * First part of the subscriber number of a phone number stored as a String.
	 */
	private String subscriber1;
	
	/**
	 * Second part of the subscriber number of a phone number stored as a String.
	 */
	private String subscriber2;
}
