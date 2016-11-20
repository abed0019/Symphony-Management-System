package symphony.test;

import junit.framework.*;
import symphony.domain.Movement;

/**
 * JUnit tests for the Composition class from the "symphony" project
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_Movement extends TestCase {

	public Test_Movement(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Movement.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Movement Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Movement End");	}
	
	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Movement.testConstructors");
		movement = new Movement();
		
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
		
		movement = new Movement("Cello Movement", 1, "MOV1");
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
	}
	
	/**
	 * Testing the accessors.
	 * Tests true and false values for getMovementNumber
	 * <br>ID and Name are tested in Concert Entity test class
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Movement.testAccessors");
		movement = new Movement();
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
		
		movement.setMovementNumber(12);
		assertTrue("\t\tTest_ShannonsModel.testMutators: Expecting Movement Number equal to 12", movement.getMovementNumber() == 12);
		
		movement.setMovementNumber(10);
		assertFalse("\t\tTest_ShannonsModel.testMutators: Expecting movement number equal to 12", movement.getMovementNumber() == 12);

	}
	
	/**
	 * Test the mutators/modifiers.
	 * Tests true and false values with boundary conditions
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Movement.testMutators");
		movement = new Movement();
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
		
		movement.setMovementNumber(0);
		assertTrue("\t\tTest_ShannonsModel.testMutators: Expecting Movement Number equal to 0", movement.getMovementNumber() == 0);
		
		movement.setMovementNumber(100000);
		assertFalse("\t\tTest_ShannonsModel.testMutators: Expecting movement number equal to 12", movement.getMovementNumber() == 12);

	}
	
	/**
	 * Test behaviors.
	 * Tests overridden toString() method
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_Movement.testBehaviors");
		
		movement = new Movement("Cello Movement", 1, "MOV1");
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
		
		String str = movement.toString();
		assertEquals("\t\tTest_Movement.testBehaviors: movement toString is not equal", str, "[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ]");

		
	}
	
	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Movement suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	private Movement movement = null;


}	/*	End of CLASS:	Test_Movement.java				*/
