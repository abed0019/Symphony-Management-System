package symphony.test;

import junit.framework.*;
import symphony.domain.Address;


/**
 * JUnit tests for the Address class from the symphony project.
 * @author Chase Thorne
 * @version 1.0.0
 */
public class Test_Address extends TestCase {

	public Test_Address(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_Name.class); }

	protected void setUp() throws Exception { System.out.println("Test_Address Begin"); }

	protected void tearDown() throws Exception { System.out.println("Test_Address End"); }

	/**
	 * Test Constructors
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Address.testConstructors");

		//testing builder without optional parameters
		address = new Address.Builder("line1", "city", "province", "postalcode").build();

		assertNotNull("\t\tTest_Address.testConstructors: address is not null", address);
		assertEquals("\t\tTest_Address.testConstructors: streetLine1", address.getStreetLine1(), "line1");
		assertEquals("\t\tTest_Address.testConstructors: streetLine1", address.getStreetLine2(), "");
		assertEquals("\t\tTest_Address.testConstructors: city", address.getCity(), "city");
		assertEquals("\t\tTest_Address.testConstructors: province", address.getProvince(), "province");
		assertEquals("\t\tTest_Address.testConstructors: postalcode", address.getPostalCode(), "postalcode");
		assertEquals("\t\tTest_Address.testConstructors: country", address.getStreetLine1(), "");

		//testing builder with optional parameters
		address = new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build();

		assertEquals("\t\tTest_Address.testConstructors: streetLine1", address.getStreetLine1(), "line1");
		assertEquals("\t\tTest_Address.testConstructors: streetLine2", address.getStreetLine2(), "line2");
		assertEquals("\t\tTest_Address.testConstructors: city", address.getCity(), "city");
		assertEquals("\t\tTest_Address.testConstructors: province", address.getProvince(), "province");
		assertEquals("\t\tTest_Address.testConstructors: country", address.getCountry(), "country");
		assertEquals("\t\tTest_Address.testConstructors: postalCode", address.getPostalCode(), "postalcode");
	}

	/**
	 * Test accessors
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Address.testAccessors");
		address = new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build();

		//testing accessors
		assertEquals("\t\tTest_Address.testAccessors: streetLine1", address.getStreetLine1(), "line1");
		assertEquals("\t\tTest_Address.testAccessors: streetLine2", address.getStreetLine2(), "line2");
		assertEquals("\t\tTest_Address.testAccessors: city", address.getCity(), "city");
		assertEquals("\t\tTest_Address.testAccessors: province", address.getProvince(), "province");
		assertEquals("\t\tTest_Address.testAccessors: country", address.getCountry(), "country");
		assertEquals("\t\tTest_Address.testAccessors: postalCode", address.getPostalCode(), "postalcode");
	}

	/**
	 * Test mutators
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Address.testMutators");
		address = new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build();

		//using mutators
		address.setStreetLine1("altline1");
		address.setStreetLine2("altline2");
		address.setCity("altcity");
		address.setProvince("altprovince");
		address.setCountry("altcountry");
		address.setPostalCode("altpostalcode");

		//testing the values have changed
		assertEquals("\t\tTest_Address.testAccessors: streetLine1", address.getStreetLine1(), "altline1");
		assertEquals("\t\tTest_Address.testAccessors: streetLine2", address.getStreetLine2(), "altline2");
		assertEquals("\t\tTest_Address.testAccessors: city", address.getCity(), "altcity");
		assertEquals("\t\tTest_Address.testAccessors: province", address.getProvince(), "altprovince");
		assertEquals("\t\tTest_Address.testAccessors: country", address.getCountry(), "altcountry");
		assertEquals("\t\tTest_Address.testAccessors: postalCode", address.getPostalCode(), "altpostalcode");
	}

	/**
	 * Test behaviours
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_Address.testBehaviours");
		address = new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build();

		assertEquals("\t\tTest_Address.testBehaviours: toString()", 
				address.toString(), 
				"line1"
						+ "\nline2"
						+ "\ncity province postalcode"
						+ "\ncountry");
	}

	/**
	 * Main line for stand-alone operation.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Address suite...");
		junit.textui.TestRunner.run(suite());
	}

	private Address address = null;
}
