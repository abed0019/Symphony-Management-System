package symphony.test;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.*;

public class Test_Venue extends TestCase {
	
	public Test_Venue(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_Venue.class); }

	protected void setUp() throws Exception { System.out.println("Test_Venue Begins ... ... ..."); }

	protected void tearDown() throws Exception { System.out.println("Test_Venue Ends."); }
	
	/**
	 * 
	 *  Testing Construcors
	 * 
	 */
	
	
	public void testConstructors() {
		
		System.out.println("\tExecuting Test_Venue.testConstructors ... ... ...");
		
		venue = new Venue();
		
		assertNotNull("\t\tTest_Venue.testConstructors: Venue is null", venue);

		venue = new Venue (new Address.Builder("123 street", "city", "province", "postalcode").build(),"Ottawa", 1200);
				
		assertNotNull("\t\tTest_Venue.testConstructors: Venue is null", venue);

	}
	
	
	
	/**
	 *
	 * Testing the accessors.
	 * 
	 */
	
	
	public void testAccessors() {
		
		System.out.println("\tExecuting Venue.testAccessors");
		
		venue = new Venue();
		
		
		assertNotNull("\t\tTest_Venue.testAccessors: Venue is null", venue);
		
		venue.setLocation(new Address.Builder("1385 Woodroffe Ave", "Ottawa", "ON", "K2G1V8").streetLine2("ACCE BUILDING ATRIUM").country("Canada").build());
		
		assertEquals("\t\tTest_Venue.testConstructors: Venue", venue.getLocation().toString(), "1385 Woodroffe Ave"+ "\nACCE BUILDING ATRIUM"+ "\nOttawa ON K2G1V8"+ "\nCanada");
		
		
		venue.setMaxCapacity(2000);
		
		assertTrue("\t\tTest_Venue.testAccessors: Expecting Max Capacity to be equal to 2000", venue.getMaxCapacity() == 2000);
		
		
		venue.setMaxCapacity(1500);
		
		assertFalse("\t\tTest_Venue.testAccessors: Expecting Max Capacity to be equal to 1500", venue.getMaxCapacity() == 2000);
		
		
		venue.setTotalTicketSale(2499);
		
		assertTrue("\t\tTest_Venue.testAccessors: Expecting Total Ticket Sale to be equal to 2499", venue.getTotalTicketSale() == 2499);
		
		
		venue.setTotalTicketSale(1599);
		
		assertFalse("\t\tTest_Venue.testAccessors: Expecting Total Ticket Sale to be equal to 1599", venue.getMaxCapacity() == 2499);
		
		
		venue.setLocationName("TD PLACE");
		
		assertTrue("\t\tTest_Venue.testAccessors: Expecting Location Name to be equal to TD PLACE", venue.getLocationName() == "TD PLACE");
		
		
		venue.setLocationName("SOMEWHERE");
		
		assertFalse("\t\tTest_Venue.testAccessors: Expecting Location Name to be equal to SOMEWHERE", venue.getLocationName() == "TD PLACE");

	}
	
	
	/**
	 *	Entry Point
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Executing Test_Venue suite ... ... ...");
		
		junit.textui.TestRunner.run(suite());
	}
	
	
	
	private Venue venue = null;
}
