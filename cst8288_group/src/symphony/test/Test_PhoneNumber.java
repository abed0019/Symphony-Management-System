package symphony.test;

import junit.framework.*;
import symphony.domain.PhoneNumber;


/**
 * JUnit tests for the PhoneNumber class from the symphony project.
 * @author Chase Thorne
 * @version 1.0.0
 */
public class Test_PhoneNumber extends TestCase {

	public Test_PhoneNumber(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_PhoneNumber.class); }

	protected void setUp() throws Exception { System.out.println("Test_PhoneNumber Begin"); }

	protected void tearDown() throws Exception { System.out.println("Test_PhoneNumber End"); }

	/**
	 * Test Constructors
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_PhoneNumber.testConstructors");

		//testing constructor with country code
		phoneNumber = new PhoneNumber("1", "2", "3", "4");

		assertNotNull("\t\tTest_PhoneNumber.testConstructors: PhoneNumber is not null", phoneNumber);
		assertEquals("\t\tTest_PhoneNumber.testConstructors: country", phoneNumber.getCountry(), "1");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: area", phoneNumber.getArea(), "2");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub1", phoneNumber.getSubscriber1(), "3");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub2", phoneNumber.getSubscriber2(), "4");

		//testing constructor without country code
		phoneNumber = new PhoneNumber("5", "6", "7");

		assertEquals("\t\tTest_PhoneNumber.testConstructors: area", phoneNumber.getArea(), "5");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub1", phoneNumber.getSubscriber1(), "6");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub2", phoneNumber.getSubscriber2(), "7");
	}

	/**
	 * Test accessors
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_PhoneNumber.testAccessors");
		phoneNumber = new PhoneNumber("1", "2", "3", "4");
		
		//testing accessors
		assertEquals("\t\tTest_PhoneNumber.testConstructors: country", phoneNumber.getCountry(), "1");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: area", phoneNumber.getArea(), "2");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub1", phoneNumber.getSubscriber1(), "3");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub2", phoneNumber.getSubscriber2(), "4");
	}

	/**
	 * Test mutators
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_PhoneNumber.testMutators");
		phoneNumber = new PhoneNumber("1", "2", "3", "4");

		//using mutators
		phoneNumber.setCountry("5");
		phoneNumber.setArea("6");
		phoneNumber.setSubscriber1("7");
		phoneNumber.setSubscriber2("8");
		
		//testing mutators
		assertEquals("\t\tTest_PhoneNumber.testConstructors: country", phoneNumber.getCountry(), "5");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: area", phoneNumber.getArea(), "6");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub1", phoneNumber.getSubscriber1(), "7");
		assertEquals("\t\tTest_PhoneNumber.testConstructors: sub2", phoneNumber.getSubscriber2(), "8");
	}

	/**
	 * Test behaviours
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_PhoneNumber.testBehaviours");
		phoneNumber = new PhoneNumber("1", "2", "3", "4");

		assertEquals("\t\tTest_PhoneNumber.testBehaviours: toString()", 
				phoneNumber.toString(), "1 2 3 4");
	}

	/**
	 * Main line for stand-alone operation.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_PhoneNumber suite...");
		junit.textui.TestRunner.run(suite());
	}

	private PhoneNumber phoneNumber = null;
}
