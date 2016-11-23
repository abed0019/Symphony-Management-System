package symphony.test;

import junit.framework.*;
import symphony.domain.Name;


/**
 * JUnit tests for the Name class from the symphony project.
 * @author Chase Thorne
 * @version 1.0.0
 */
public class Test_Name extends TestCase {

	public Test_Name(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_Name.class); }

	protected void setUp() throws Exception { System.out.println("Test_Name Begin"); }

	protected void tearDown() throws Exception { System.out.println("Test_Name End"); }

	/**
	 * Test Constructors
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Name.testConstructors");

		//testing builder without optional parameters
		name = new Name.Builder("given", "surname").build();

		assertNotNull("\t\tTest_Name.testConstructors: Name is not null", name);
		assertEquals("\t\tTest_Name.testConstructors: given", name.getGiven(), "given");
		assertEquals("\t\tTest_Name.testConstructors: surname", name.getSurname(), "surname");

		//testing builder with optional parameters
		name = new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build();

		assertEquals("\t\tTest_Name.testConstructors: honorific", name.getHonorific(), "honorific");
		assertEquals("\t\tTest_Name.testConstructors: given", name.getGiven(), "given");
		assertEquals("\t\tTest_Name.testConstructors: middle", name.getMiddle(), "middle");
		assertEquals("\t\tTest_Name.testConstructors: surname", name.getSurname(), "surname");
	}

	/**
	 * Test accessors
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Name.testAccessors");
		name = new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build();

		//testing accessors
		assertEquals("\t\tTest_Name.testConstructors: honorific", name.getHonorific(), "honorific");
		assertEquals("\t\tTest_Name.testConstructors: given", name.getGiven(), "given");
		assertEquals("\t\tTest_Name.testConstructors: middle", name.getMiddle(), "middle");
		assertEquals("\t\tTest_Name.testConstructors: surname", name.getSurname(), "surname");
	}

	/**
	 * Test mutators
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Name.testMutators");
		name = new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build();

		//using mutators
		name.setHonorific("althonorific");
		name.setGiven("altgiven");
		name.setMiddle("altmiddle");
		name.setSurname("altsurname");
		
		//testing mutators
		assertEquals("\t\tTest_Name.testConstructors: honorific", name.getHonorific(), "althonorific");
		assertEquals("\t\tTest_Name.testConstructors: given", name.getGiven(), "altgiven");
		assertEquals("\t\tTest_Name.testConstructors: middle", name.getMiddle(), "altmiddle");
		assertEquals("\t\tTest_Name.testConstructors: surname", name.getSurname(), "altsurname");
	}

	/**
	 * Test behaviours
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_Name.testBehaviours");
		name = new Name.Builder("given", "surname")
				.honorific("honorific")
				.middle("middle")
				.build();

		assertEquals("\t\tTest_Name.testBehaviours: toString()", 
				name.toString(), "honorific given middle surname");
	}

	/**
	 * Main line for stand-alone operation.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Name suite...");
		junit.textui.TestRunner.run(suite());
	}

	private Name name = null;
}
