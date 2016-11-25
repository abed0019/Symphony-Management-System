package symphony.test;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.*;

public class Test_Soloist extends TestCase {
	
	public Test_Soloist(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_Soloist.class); }

	protected void setUp() throws Exception { System.out.println("Test_Soloist Begins ... ... ..."); }

	protected void tearDown() throws Exception { System.out.println("Test_Soloist Ends."); }
	
	
	/**
	 * 
	 *  Testing Construcors
	 * 
	 */
	
	
	public void testConstructors() {
		
		System.out.println("\tExecuting Test_Soloist.testConstructors ... ... ...");

		soloist = new Soloist (new Name.Builder("FirstName", "LastName").build(),new Address.Builder("123 street", "city", "province", "postalcode").build(), new PhoneNumber("1", "2", "3", "4"),"A100");
				
		assertNotNull("\t\tTest_Soloist.testConstructors: Soloist is null", soloist);

	}
	
	
	
	/**
	 *
	 * Testing the accessors.
	 * 
	 */
	
	
	public void testAccessors() {
		
		System.out.println("\tExecuting Soloist.testAccessors");
		
		soloist = new Soloist (new Name.Builder("FirstName", "LastName").build(),new Address.Builder("123 street", "city", "province", "postalcode").build(), new PhoneNumber("1", "2", "3", "4"),"A100");
		
		assertNotNull("\t\tTest_Soloist.testAccessors: Soloist is null", soloist);
		
		
		soloist.setSoloistID("A10");
		
		assertTrue("\t\tTest_Soloist.testAccessors: Expecting Soloist ID to be equal to A10", soloist.getSoloistID() == "A10");
		
		
		soloist.setSoloistID("Z99");
		
		assertFalse("\t\tTest_Soloist.testAccessors: Expecting Soloist ID to be equal to Z99", soloist.getSoloistID() == "A10");
		
		
		soloist.setSoloistExpertise("Guitarist");
		
		assertTrue("\t\tTest_Soloist.testAccessors: Expecting Soloist Expertise to be Guitarist", soloist.getSoloistExpertise() == "Guitarist");
		
		
		soloist.setSoloistExpertise("Sax Player");
		
		assertFalse("\t\tTest_Soloist.testAccessors: Expecting Soloist Expertise to be Sax Player", soloist.getSoloistExpertise() == "Guitarist");
	
		
		
		java.sql.Date d = new java.sql.Date(2016/10/10);
		
		soloist.setLastPerformedDate(d);
		
		assertTrue("\t\tTest_Soloist.testAccessors: Expecting Last Date Performed to be equal to 2016/10/10", soloist.getlastPerformedDate() == d);
		
		
		soloist.setLastPerformedDate(new java.sql.Date(2016/05/05));
		
		assertFalse("\t\tTest_Soloist.testAccessors: Expecting Last Date Performed to be equal to 2016/05/05", soloist.getlastPerformedDate() == d);

	}
	
	
	/**
	 *	Entry Point
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Executing Test_Soloist suite ... ... ...");
		
		junit.textui.TestRunner.run(suite());
	}
	
	
	
	private Soloist soloist = null;
}
