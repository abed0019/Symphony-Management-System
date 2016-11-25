package symphony.test;

import java.sql.Timestamp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.FinancialTransaction;

/**
 * JUnit tests for the FinancialTransaction class from the "symphony" project
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_FinancialTransaction extends TestCase {

	public Test_FinancialTransaction(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_FinancialTransaction.class);		}

	protected void setUp() throws Exception { System.out.println("Test_FinancialTransaction Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_FinancialTransaction End");	}

	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testConstructors");
		finTrans = new FinancialTransaction();

		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: Financialransaction is null", finTrans);

		finTrans = new FinancialTransaction("Test", 1, "Timestamp");
		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: Financialransaction is null", finTrans);

	}

	/**
	 * Testing the accessors.
	 * <br> Tests getter methods for the Financial Transaction class
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testAccessors");
		finTrans = new FinancialTransaction("Test", 1, "Timestamp");
		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: FinancialTransaction is null", finTrans);
		
		String str = "Test";
		assertEquals("\t\tTest_FinancialTransaction.testAccessors: Expecting description to equal 'Test'", str, finTrans.getDescription());

		int acct = 1;
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting account number equal to 1"
				, finTrans.getAccountNo() == 1);
		
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting timestamp to be a String representation"
				, finTrans.getTimeStamp() instanceof String);
		
		finTrans.setCredit(0.0);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting credit equal to 0.0" 
				, finTrans.getCredit() == 0.0);
		
		finTrans.setDebit(0.0);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting debit equal to 0.0" 
				, finTrans.getDebit() == 0.0);

	}

	/**
	 * Testing the mutators/modifiers.
	 * <br>Tests "assert equals" by comparing setComposer() with getComposer()
	 * <br>Tests true and false values for setMovementList, an array list of Movement Objects
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_FinancialTransaction.testMutators");
		finTrans = new FinancialTransaction();
		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: Financialransaction is null", finTrans);

		finTrans.setDescription("Test");
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting description respresented as a String", finTrans.getDescription() instanceof String);

		finTrans.setAccountNo(1);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting account number equal to 1"
				, finTrans.getAccountNo() == 1);
		
		finTrans.setTimeStamp(new Timestamp(System.currentTimeMillis()));
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting timestamp to be a String representation"
				, finTrans.getTimeStamp() instanceof String);
		
		finTrans.setCredit(0.0);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting credit equal to 0.0" 
				, finTrans.getCredit() == 0.0);
		
		finTrans.setDebit(0.0);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting debit equal to 0.0" 
				, finTrans.getDebit() == 0.0);

	}


	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_FinancialTransaction suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	private FinancialTransaction finTrans = null;


}	/*	End of CLASS:	Test_FinancialTransaction.java				*/
