package symphony.domain;

/**
 * This class issues a ticket if there is capacity
 * It has a ticket, ticket status to determine whether or not a concert at a particular venue is sold out and flags concerts as sold out
 * 
 * @author Kathleen McNulty, updated by Adam Shalla & Ash-Lee Hommy
 *
 */
public class TicketIssuance {
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default Constructor
	 */
	public TicketIssuance(){
	}
	/**
	 * Parameterized constructor 
	 * @param ticket- Ticket for a concert at a venue
	 * @param sellticket- A flag to indicate the ticket should be sold because the concert isn't sold out
	 * @param soldout- A flag indicating a concert is sold out
	 * @param methodofpayment- A String indicating the method of payment
	 */
	
	public TicketIssuance(Ticket ticket, boolean sellticket,boolean soldout, String methodofpayment){}
	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * This method btains the method of payment
	 * @return methodofpayment
	 */
	public String getMethodofPayment(){
		return methodofpayment; 
	} 

	/**
	 * This method obtains the a flag to indicate whether or not a ticket should be sold
	 * @return sellTicket
	 */
	public boolean getTicketStatus(){
		return sellTicket;
	}

	/**
	 * This method obtains a flag to indicate a concert at a particular venue is sold out
	 * @return soldOut
	 */
	public boolean getSoldOut(){
		return soldOut; 
	}
	
	/* MODIFIERS	--------------------------------------------------	*/
	
	/**
	 * This method creates or updates a flag to indicate whether or not a ticket should be sold
	 * @param sellTicket
	 */
	public void setTicketStatus(boolean sellTicket){
		this.sellTicket=sellTicket; 

	}
	
	/**
	 * This method creates or updates a String to indicate the method of payment
	 * @param methodofpayment
	 */
	public void setMethodofPayment(String methodofpayment){
		this.methodofpayment=methodofpayment;
	}
	
	/**
	 * This method creates or updates a flag to indicate when a concert is sold out
	 * @param soldOut
	 */
	public void setSoldOut(boolean soldOut){
		this.soldOut=soldOut; 
	}
	
	/* NORMAL BEHAVIOR	-----------------------------------------------------	*/
	
	/**
	 * This method creates or updates a flags to indicate whether or not a ticket should be sold, a concert is sold out
	 * and sets the credit amount of the financial transaction (the price of the ticket)
	 */
	public void sellTicket(){
		if (scheduledConcert.getVenue().getMaxCapacity()== scheduledConcert.getVenue().getTotalTicketSale()){
			soldOut=true; 
			sellTicket=false;

		}
		else{ 
			soldOut=false;
			sellTicket=true;
			ticketSold++;
			scheduledConcert.getVenue().setTotalTicketSale(ticketSold);
			fincredit.setCredit(ticket.getTicketPrice());
			
			
		}
	}
	
	/* ATTRIBUTES	--------------------------------------------------	*/
	/**This flag indicates when a concert is sold out**/
	public boolean soldOut; 
	/**This flag indicates the ticket can be sold because capacity hasn't been reached yet**/
	public boolean sellTicket; 
	/**This is the method of payment when a ticket is issued**/
	private String methodofpayment; 
	/**This object is used to sell a ticket**/
	ScheduledConcert scheduledConcert = new ScheduledConcert();
	/** This variable tracks the number of tickets sold in for each concert**/
	private int ticketSold;
	/** If there is a ticket issued there is a financial transaction object**/
	FinancialTransaction fincredit=new FinancialTransaction();
	/**If there is a ticket issued a ticket object is instantiated **/
	Ticket ticket=new Ticket();
}
