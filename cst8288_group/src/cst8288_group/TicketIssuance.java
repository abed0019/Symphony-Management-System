package cst8288_group;
/**
 * This class determines whether or not a ticket is sold based on capacity
 * @author Carnage
 *
 */
public class TicketIssuance {//Could be combined with ticket... Maybe
	/*public int static totalticketSale;*/
	public boolean soldOut; 
	public boolean sellTicket; 
	/*public int ticketID; */
	
	public void setTicketStatus(boolean sellTicket){
		this.sellTicket=sellTicket; 
		
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
		if (venue.getMaxCapacity()> venue.getTotalTicketSale()){//Total ticket sales for that particular venue
			soldOut=true; 
			sellTicket=false;
			
		}
		else{ 
			soldOut=false;
			sellTicket=true;
			venue.getTotalTicketSale();//From venue total tickets sales
		}
	}
	
Venue venue=new Venue();
}
