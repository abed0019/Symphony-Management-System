package test;

import cst8288_group.Composition;
import junit.framework.*;

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

	protected void setUp() throws Exception { System.out.println("Test_ShannonsModel Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsModel End");	}
	
	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
	
	}
	
	/**
	 * Testing the accessors.
	 * Tests true and false values for getBandwidth() and getSignalToNoise()
	 * Tests getMaxDataRate() with typical phone line values (sends message to helper method to calculate)
	 */
	public void testAccessors() {
		
	}
	
	/**
	 * Test the mutators/modifiers.
	 * Tests true and false values with boundary conditions
	 */
	public void testMutators() {
		
	}
	
	/**
	 * Test behaviors.
	 * Tests overridden toString() method
	 */
	public void testBehaviors() {
		
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
