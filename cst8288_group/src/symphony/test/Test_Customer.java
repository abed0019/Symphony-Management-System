package symphony.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.Address;
import symphony.domain.Customer;
import symphony.domain.Name;
import symphony.domain.PhoneNumber;

/**
 * JUnit tests for the Customer class from the "symphony" project
 * Customer extends Person, accessors/mutators/behaviors are tested in Test_Person
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_Customer extends TestCase {

	public Test_Customer(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Customer.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Customer Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Customer End");	}
	
	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Customer.testConstructors");
		
		customer = new Customer(
				new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"custID1"
				);
		
		assertNotNull("\t\tTest_Customer.testConstructors: Customer is null", customer);

	}
	
	
	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Customer suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	private Customer customer = null;


}	/*	End of CLASS:	Test_Customer.java				*/