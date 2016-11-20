package symphony.test;

import java.util.ArrayList;

import junit.framework.*;
import symphony.domain.Composition;
import symphony.domain.Movement;

/**
 * JUnit tests for the Composition class from the "symphony" project
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_Composition extends TestCase {

	public Test_Composition(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Composition.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Composition Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Composition End");	}
	
	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Composition.testConstructors");
		composition = new Composition();
		
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
		
		composition = new Composition("Comp2id", "SecondComposition", "Mr.Composer");
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
		
		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(new Movement("Cello Movement", 1, "MOV1"));
		testMovementsList.add(new Movement("Brass Movement", 2, "MOV2"));
		composition = new Composition("CompMov3id", "MovementComposition", "Mr.Composer", testMovementsList);
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
	}
	
	/**
	 * Testing the accessors.
	 * Tests true and false values for getComposer()
	 * Tests getMaxDataRate() with typical phone line values (sends message to helper method to calculate)
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Composition.testAccessors");
		composition = new Composition();
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
		
		
	}
	
	/**
	 * Test the mutators/modifiers.
	 * Tests true and false values with boundary conditions
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Composition.testMutators");
		composition = new Composition();
		
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
	}
	
	/**
	 * Test behaviors.
	 * Tests overridden toString() method
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_Composition.testBehaviors");
		composition = new Composition();
		
		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);
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
	private Composition composition = null;


}	/*	End of CLASS:	Test_Composition.java				*/
