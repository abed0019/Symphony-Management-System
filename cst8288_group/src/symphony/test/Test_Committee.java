package symphony.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.Address;
import symphony.domain.Committee;
import symphony.domain.Name;
import symphony.domain.Person;
import symphony.domain.PhoneNumber;

/**
 * JUnit tests for the Committee class from the "symphony" project
 * TODO: Adam to reformat or test his toString
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_Committee extends TestCase {

	public Test_Committee(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Committee.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Committee Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Committee End");	}
	
	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Committee.testConstructors");
		Person committeePerson = new Person(
				new Name.Builder("The", "Committee")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		com = new Committee(committeePerson, committeePerson, committeePerson, committeePerson);
		
		assertNotNull("\t\tTest_Committee.testConstructors: Committee is null", com);
	}
	
	/**
	 * Testing the accessors.
	 * Tests get() method for each Person in the committee
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Committee.testAccessors");
		Person chairman = new Person(
				new Name.Builder("The", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		Person viceChairman = new Person(
				new Name.Builder("Vice", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		Person secretary = new Person(
				new Name.Builder("The", "Secretary")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		Person treasurer = new Person(
				new Name.Builder("The", "Treasurer")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		com = new Committee(chairman, viceChairman, secretary, treasurer);
		assertNotNull("\t\tTest_Committee.testConstructors: Committee is null", com);
		
		Person cTest = com.getChairman();
		assertTrue("\t\tTest_Committee.testAccessors: Expecting cTest equal to chairman", cTest.equals(chairman));
		
		Person vCTest = com.getViceChairman();
		assertTrue("\t\tTest_Committee.testAccessors: Expecting vCTest equal to viceChairman", vCTest.equals(viceChairman));
		
		Person sTest = com.getSecretary();
		assertTrue("\t\tTest_Committee.testAccessors: Expecting sTest equal to secretary", sTest.equals(secretary));
		
		Person tTest = com.getTreasurer();
		assertTrue("\t\tTest_Committee.testAccessors: Expecting tTest equal to treasurer", tTest.equals(treasurer));

	}
	
	/**
	 * Test the mutators/modifiers.
	 * tests set() method for each Person in the Committee
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Committee.testMutators");
		Person committeePerson = new Person(
				new Name.Builder("The", "Committee")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		com = new Committee(committeePerson, committeePerson, committeePerson, committeePerson);
		assertNotNull("\t\tTest_Committee.testConstructors: Committee is null", com);
		
		com.setChairman(new Person(
				new Name.Builder("The", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				));
		
		com.setViceChairman(new Person(
				new Name.Builder("Vice", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				));
		
		com.setSecretary(new Person(
				new Name.Builder("The", "Secretary")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				));
		
		com.setTreasurer(new Person(
				new Name.Builder("The", "Treasurer")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				));
		
		String cTest = com.getChairman().getName().toString();
		System.out.println(com.getChairman().getName());
		assertEquals("\t\tTest_Committee.testAccessors: Expecting cTest equal to chairman", cTest, "TheChairman");
		
		String vCTest = com.getViceChairman().getName().toString();
		assertEquals("\t\tTest_Committee.testAccessors: Expecting vCTest equal to viceChairman", vCTest, "ViceChairman");
		
		String sTest = com.getSecretary().getName().toString();
		assertEquals("\t\tTest_Committee.testAccessors: Expecting sTest equal to secretary", sTest, "TheSecretary");
		
		String tTest = com.getTreasurer().getName().toString();
		assertEquals("\t\tTest_Committee.testAccessors: Expecting tTest equal to treasurer", tTest, "TheTreasurer");

	}
	
	/**
	 * Test behaviors.
	 * Tests overridden toString() method
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_Committee.testBehaviors");
		Person chairman = new Person(
				new Name.Builder("The", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"chair1"
				);
		Person viceChairman = new Person(
				new Name.Builder("Vice", "Chairman")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"VC1"
				);
		Person secretary = new Person(
				new Name.Builder("The", "Secretary")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"sec1"
				);
		Person treasurer = new Person(
				new Name.Builder("The", "Treasurer")
				.build(),
				new Address.Builder("line1", "city", "province", "postalcode")
				.build(),
				new PhoneNumber("1", "2", "3", "4"),
				"treas1"
				);
		com = new Committee(chairman, viceChairman, secretary, treasurer);
		assertNotNull("\t\tTest_Committee.testConstructors: Committee is null", com);
		
		String str = com.toString();
		assertEquals("\t\tTest_Movement.testBehaviors: committee toString is not equal", str, com.toString());

	}
	
	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Committee suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	private Committee com = null;


}	/*	End of CLASS:	Test_Committee.java				*/