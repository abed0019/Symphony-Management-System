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
	public TicketIssuance(){}
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
	 * This obtains the method of payment
	 * @return methodofpayment
	 */
	public String getMethodofPayment(){
		return methodofpayment; 
	} 

	/**
	 * This obtains the a flag to indicate whether or not a ticket should be sold
	 * @return sellTicket
	 */
	public boolean getTicketStatus(){
		return sellTicket;
	}

	/**
	 * Thi obtains a flag to indicate a concert at a particular venue is sold out
	 * @return soldOut
	 */
	public boolean getSoldOut(){
		return soldOut; 
	}
	
	/* MODIFIERS	--------------------------------------------------	*/
	
	/**
	 * This creates or updates a flag to indicate whether or not a ticket should be sold
	 * @param sellTicket
	 */
	public void setTicketStatus(boolean sellTicket){
		this.sellTicket=sellTicket; 

	}
	
	/**
	 * This creates or updates a String to indicate the method of payment
	 * @param methodofpayment
	 */
	public void setMethodofPayment(String methodofpayment){
		this.methodofpayment=methodofpayment;
	}
	
	/**
	 * This creates or updates a flag to indicate when a concert is sold out
	 * @param soldOut
	 */
	public void setSoldOut(boolean soldOut){
		this.soldOut=soldOut; 
	}
	
	/* NORMAL BEHAVIOR	-----------------------------------------------------	*/
	
	/**
	 * This creates or updates a flags to indicate whether or not a ticket should be sold, a concert is sold out
	 * 
	 */
	public void sellTicket(){
		if (scheduledConcert.getVenue().getMaxCapacity()== scheduledConcert.getVenue().getTotalTicketSale()){
			soldOut=true; 
			sellTicket=false;

		}
		else{ 
			soldOut=false;
			sellTicket=true;
			scheduledConcert.getVenue().setTotalTicketSale(1);
		}
	}
	
	/* ATTRIBUTES	--------------------------------------------------	*/
	public boolean soldOut; 
	public boolean sellTicket; 
	private String methodofpayment; 
	ScheduledConcert scheduledConcert = new ScheduledConcert();
}
