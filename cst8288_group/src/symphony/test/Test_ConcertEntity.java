package symphony.test;

import java.util.ArrayList;

import junit.framework.*;
import symphony.domain.Composition;
import symphony.domain.Movement;

/**
 * JUnit tests for the abstract Concert Entity class from the "symphony" project
 * 
 * <p>Tests through a child object of type Concert Entity
 * <br>TODO: test a Person with Name object
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_ConcertEntity extends TestCase {

	public Test_ConcertEntity(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_ConcertEntity.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ConcertEntity Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ConcertEntity End");	}


	/**
	 * Testing the accessors of an Object of type Concert Entity, a Composition
	 * <br>Tests "assert equals" values for getID() and getName()
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Composition.testAccessors");
		composition = new Composition();
		assertNotNull("\t\tTest_ConcertEntity.testAccessors: Composition is null", composition);
		
		composition = new Composition("CompMov3id", "MovementComposition", "Mr.Composer");
		String str = "MovementComposition";
		assertEquals("\t\tTest_ConcertEntity.testAccessors: Expecting Composition name to be MovementComposition", str, composition.getName());
		
		str = "CompMov3id";
		assertEquals("\t\tTest_ConcertEntity.testAccessors: Expecting Composition ID to be CompMov3id", str, composition.getID());

	}

	/**
	 * Testing the mutators/modifiers.
	 * <br>Tests setName() and setID() which are called through the Constructors only
	 * <br>Asserts equals and compares with the results of getName() and getID()
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Composition.testMutators");
		composition = new Composition();

		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);

		composition = new Composition("CompMov3id", "MovementComposition", "Mr.Composer");
		String str = "MovementComposition";
		assertEquals("\t\tTest_ConcertEntity.testAccessors: Expecting Composition name to be MovementComposition", str, composition.getName());
		
		str = "CompMov3id";
		assertEquals("\t\tTest_ConcertEntity.testAccessors: Expecting Composition ID to be CompMov3id", str, composition.getID());

	}


	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Composition suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	/**
	 * Composition is an Object of type Concert Entity
	 */
	private Composition composition = null;


}	/*	End of CLASS:	Test_ConcertEntity.java				*/
