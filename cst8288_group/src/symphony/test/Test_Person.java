package symphony.test;

import junit.framework.*;
import symphony.domain.*;


/**
 * JUnit tests for the Person class from the symphony project.
 * @author Chase Thorne
 * @version 1.0.0
 */
public class Test_Person extends TestCase {

	public Test_Person(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_Person.class); }

	protected void setUp() throws Exception { System.out.println("Test_Person Begin"); }

	protected void tearDown() throws Exception { System.out.println("Test_Person End"); }

	/**
	 * Test Constructors
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Person.testConstructors");

		//testing builder without optional parameters
		person = new Person(
				new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"ident"
				);

		assertNotNull("\t\tTest_Person.testConstructors: Person is not null", 
				person);
		assertEquals("\t\tTest_Person.testConstructors: Person", 
				person.getName().toString(), 
				"honorific given middle surname");
		assertEquals("\t\tTest_Person.testConstructors: Person", 
				person.getAddress().toString(), 
				"line1"
						+ "\nline2"
						+ "\ncity province postalcode"
						+ "\ncountry");
		assertEquals("\t\tTest_Person.testConstructors: Person", 
				person.getPhoneNumber().toString(),
				"1 2 3 4");
		assertEquals("\t\tTest_Person.testConstructors: Person", 
				person.getID(),
				"ident");
	}

	/**
	 * Test accessors
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Person.testAccessors");
		person = new Person(
				new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"ident"
				);

		//testing accessors
		assertNotNull("\t\tTest_Person.testConstructors: Person is not null", person);
		assertEquals("\t\tTest_Person.testConstructors: Person", person.getName().toString(), "honorific given middle surname");
		assertEquals("\t\tTest_Person.testConstructors: Person", person.getAddress().toString(), "line1"
				+ "\nline2"
				+ "\ncity province postalcode"
				+ "\ncountry");
	}

	/**
	 * Test mutators
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Person.testMutators");
		person = new Person(
				new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"ident"
				);

		person.setAddress(new Address.Builder("altline1", "altcity", "altprovince", "altpostalcode")
				.streetLine2("altline2")
				.country("altcountry")
				.build());
		person.setName(new Name.Builder("altgiven", "altsurname")
				.honorific("althonorific")
				.middle("altmiddle")
				.build());
		person.setPhoneNumber(new PhoneNumber("5", "6", "7", "8"));

		//testing changed values
		assertNotNull("\t\tTest_Person.testConstructors: Person is not null", person);
		assertEquals("\t\tTest_Person.testConstructors: Person", person.getName().toString(), "althonorific altgiven altmiddle altsurname");
		assertEquals("\t\tTest_Person.testConstructors: Person", person.getAddress().toString(), "altline1"
				+ "\naltline2"
				+ "\naltcity altprovince altpostalcode"
				+ "\naltcountry");
	}

	/**
	 * Test behaviours
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_Person.testBehaviours");
		person = new Person(
				new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.streetLine2("line2")
				.country("country")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"ident"
				);
		
		assertEquals("\t\tTest_Person.testBehaviours: toString()", 
				person.toString(),
				"ident"
						+ "\nhonorific given middle surname"
						+ "\n1 2 3 4"
						+ "\nline1"
						+ "\nline2"
						+ "\ncity province postalcode"
						+ "\ncountry");
	}

	/**
	 * Main line for stand-alone operation.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Person suite...");
		junit.textui.TestRunner.run(suite());
	}

	private Person person = null;
}
