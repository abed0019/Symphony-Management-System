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

	public Customer(Name name, Address homeAddress, PhoneNumber phoneNumber, String id) {
		super(name, homeAddress, phoneNumber, id);
		
	}

}
