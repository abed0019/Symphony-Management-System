package test;

import junit.framework.*;
import test.*;

/**
 * JUnit test class which executes all JUnit tests for the symphony project
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 */
public class AllTests extends TestCase {
	//TODO 
	/**
	 * Test suite to run all symphony domain project tests
	 * @return test suite
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite();
		//suite.addTest(Test_Address.suite());
		//suite.addTest(Test_Committee.suite());
		//suite.addTest(Test_Composition.suite());
		//suite.addTest(Test_Concert.suite());
		//suite.addTest(Test_ConcertDate.suite());
		//suite.addTest(Test_ConcertEntity.suite());
		//suite.addTest(Test_ConcertManagement.suite());
		//suite.addTest(Test_ConcertSeason.suite());
		//suite.addTest(Test_Conductor.suite());
		//suite.addTest(Test_FinancialTransaction.suite());
		//suite.addTest(Test_Movement.suite());
		//suite.addTest(Test_Name.suite());
		//suite.addTest(Test_Person.suite());
		//suite.addTest(Test_PhoneNumber.suite());
		//suite.addTest(Test_Soloist.suite());
		
		return suite;
	}
	
	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	 public static void main(String[] args) {
        System.out.println("Executing AllTests ...");
        junit.textui.TestRunner.run(suite());
    }

}	/*	End of CLASS:	AllTests.java			*/
