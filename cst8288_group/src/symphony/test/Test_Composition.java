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
	 * <br>Tests "assert equals" on getComposer to make sure it gets the correct composer
	 * <br>Tests true and false values for getMovementList(), getting the ArrayList of Movement Objects
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Composition.testAccessors");
		composition = new Composition();
		assertNotNull("\t\tTest_Composition.testAccessors: Composition is null", composition);

		composition.setComposer("Wolfgang Amadeus Mozart");
		String str = "Wolfgang Amadeus Mozart";
		assertEquals("\t\tTest_Composition.testAccessors: Expecting composer to be Wolfgang Amadeus Mozart", str, composition.getComposer());

		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(new Movement("Cello Movement", 1, "MOV1"));
		testMovementsList.add(new Movement("Brass Movement", 2, "MOV2"));
		composition.setMovementList(testMovementsList);

		ArrayList<Movement> testerList = testMovementsList;

		assertTrue("\t\tTest_Composition.testAccessors: Expecting ArrayList equal to +"
				+ "[[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ], [ movementID=MOV2 movementName=Brass Movement movementNumber=2 ]]"
				, composition.getMovementList().equals(testerList));

		testMovementsList.add(new Movement("Another Movement", 3, "MOV3"));
		assertFalse("\t\tTest_Composition.testAccessors: Expecting ArrayList to contain only +"
				+ "[[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ], [ movementID=MOV2 movementName=Brass Movement movementNumber=2 ]]"
				, composition.getMovementList().contains(testerList));

	}

	/**
	 * Testing the mutators/modifiers.
	 * <br>Tests "assert equals" by comparing setComposer() with getComposer()
	 * <br>Tests true and false values for setMovementList, an array list of Movement Objects
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Composition.testMutators");
		composition = new Composition();

		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);

		composition.setComposer("Wolfgang Amadeus Mozart");
		String str = "Wolfgang Amadeus Mozart";
		assertEquals("\t\tTest_Composition.testMutators: Expecting composer to be Wolfgang Amadeus Mozart", str, composition.getComposer());

		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(new Movement("Cello Movement", 1, "MOV1"));
		testMovementsList.add(new Movement("Brass Movement", 2, "MOV2"));
		composition.setMovementList(testMovementsList);

		ArrayList<Movement> testerList = testMovementsList;

		assertTrue("\t\tTest_Composition.testMutators: Expecting ArrayList equal to +"
				+ "[[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ], [ movementID=MOV2 movementName=Brass Movement movementNumber=2 ]]"
				, composition.getMovementList().equals(testerList));

		testMovementsList.add(new Movement("Another Movement", 3, "MOV3"));
		assertFalse("\t\tTest_Composition.testMutators: Expecting ArrayList to contain only +"
				+ "[[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ], [ movementID=MOV2 movementName=Brass Movement movementNumber=2 ]]"
				, composition.getMovementList().contains(testerList));

	}

	/**
	 * Test behaviors.
	 * Tests overridden toString() method
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_Composition.testBehaviors");
		composition = new Composition();

		assertNotNull("\t\tTest_Composition.testConstructors: Composition is null", composition);

		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(new Movement("Cello Movement", 1, "MOV1"));
		testMovementsList.add(new Movement("Brass Movement", 2, "MOV2"));
		composition = new Composition("CompMov3id", "MovementComposition", "Mr.Composer", testMovementsList);

		String str = composition.toString();
		System.out.println(str);
		assertEquals("\t\tTest_Composition.testBehaviors: composition toString is not equal", str, "[ compositionID=CompMov3id compositionName=MovementComposition composer=Mr.Composer "
				+ "movementList=[[ movementID=MOV1 movementName=Cello Movement movementNumber=1 ], [ movementID=MOV2 movementName=Brass Movement movementNumber=2 ]] ]");

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
