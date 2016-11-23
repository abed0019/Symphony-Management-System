package symphony.domain;
/**
 * This class determines whether or not a ticket is sold based on capacity
 * @author Carnage
 *
 */
public class TicketIssuance {//Could be combined with ticket... Maybe
	public boolean soldOut; 
	public boolean sellTicket; 
	private String methodofpayment; 

	public void setTicketStatus(boolean sellTicket){
		this.sellTicket=sellTicket; 

	}
	public void setMethodofPayment(String methodofpayment){
		this.methodofpayment=methodofpayment;
	}
	
	public String getMethodofPayment(){
		return methodofpayment; 
	} 

	public boolean getTicketStatus(){
		return sellTicket;
	}
	public void setSoldOUt(boolean soldOut){
		this.soldOut=soldOut; 
	}

	public boolean getSoldOut(){
		return soldOut; 
	}

	public void sellTicket(){
		if (scheduledConcert.getVenue().getMaxCapacity()== scheduledConcert.getVenue().getTotalTicketSale()){
			soldOut=true; 
			sellTicket=false;

		}
		else{ 
			soldOut=false;
			sellTicket=true;
			scheduledConcert.getVenue().getTotalTicketSale();//From venue total tickets sales
		}
	}

	ScheduledConcert scheduledConcert = new ScheduledConcert();
}
