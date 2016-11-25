package symphony.test;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.ScheduledConcert;
import symphony.domain.Ticket;

/**
 * JUnit tests for the Ticket class from the "symphony" project
 * TODO: Will not run until ScheduledConcert is finished
 * 
 * @author Ash-Lee Hommy 040840815
 * @version 1.0.0
 * 
 *
 */
public class Test_Ticket extends TestCase {

	public Test_Ticket(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Ticket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}

	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		ticket = new Ticket();

		assertNotNull("\t\tTest_Ticket.testConstructors: Ticket is null", ticket);

		ticket = new Ticket(new ScheduledConcert(), 0.0);
		
		assertNotNull("\t\tTest_Ticket.testConstructors: Ticket is null", ticket);
	}

	/**
	 * Testing the accessors.
	 * <br> Tests getter methods for the Ticket class
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testAccessors");
		ticket = new Ticket(new ScheduledConcert(), 0.0);
		assertNotNull("\t\tTest_Ticket.testConstructors: Ticket is null", ticket);
	
		assertTrue("\t\tTest_Ticket.testAccessors: Expecting scheduledConcert to be an instance of ScheduledConcert", ticket.getConcert() instanceof ScheduledConcert);

		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting account number equal to 1"
				, ticket.getTicketPrice() == 0.0);
		
		Ticket ticket2 = new Ticket();
		assertNotSame("\t\tTest_FinancialTransaction.testAccessors: Expecting timestamp to be a String representation"
				, ticket.getTicketID(), ticket2.getTicketID());

	}

	/**
	 * Testing the mutators/modifiers.
	 * <br>Tests setter methods for the Ticket class
	 *  */
	public void testMutators() {
		System.out.println("\tExecuting Test_Ticket.testMutators");
		ticket = new Ticket();
		assertNotNull("\t\tTest_Ticket.testConstructors: Ticket is null", ticket);
	
		ticket.setConcert(new ScheduledConcert());
		assertTrue("\t\tTest_Ticket.testAccessors: Expecting scheduledConcert to be an instance of ScheduledConcert", ticket.getConcert() instanceof ScheduledConcert);

		ticket.setTicketPrice(0.0);
		assertTrue("\t\tTest_FinancialTransaction.testAccessors: Expecting account number equal to 1"
				, ticket.getTicketPrice() == 0.0);
		
		Ticket ticket2 = new Ticket(); 
		assertNotSame("\t\tTest_FinancialTransaction.testAccessors: Expecting timestamp to be a String representation"
				, ticket.getTicketID(), ticket2.getTicketID());
	}
	


	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Ticket suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	private Ticket ticket = null;


}	/*	End of CLASS:	Test_Ticket.java				*/
