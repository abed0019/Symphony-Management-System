package cst8288_group;
/**
 * Customer Class
 * <br> Handles the data of a Customer who buys a ticket
 * <br> Used in Financial Transaction class to keep track of the Customer's data when they buy a ticket
 * 
 * @author Ash-Lee Hommy
 * @version 1.0.0
 *
 */
public class Customer extends Person {
	/**
	 * Customer Overloaded Constructor
	 * <br>Sets the Customer's info using the superclass Person
	 * @param name the Customer's name
	 * @param homeAddress the Customer's home address
	 * @param phoneNumber the Customer's preferred phone number
	 * @param id - the Customer ID
	 */
	public Customer(Name name, Address homeAddress, PhoneNumber phoneNumber, String id) {
		super(name, homeAddress, phoneNumber, id);
		
	}

}
