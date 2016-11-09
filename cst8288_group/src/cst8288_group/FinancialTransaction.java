package cst8288_group;
//What if there are multiple tickets? 
public class FinancialTransaction {
public String transactiontype; 
public String methodofpayment; 
public int noTcktsTrans; 
private double total;

/**
 * This method adds the tax to the total or returns total if it's a refund (ie. there is already a ticket number)
 * @return total which is the final invoice amount
 */
public double getTotal(){ 
	if ((ticket.getTicketID()==0) && (ticketIssuance.getTicketStatus()==true)){
		if(ticket.getTicketType()=="VIP"){
	total=(getNumberofTickets()*ticket.getTicketPrice())*0.15; 
		}else if (ticket.getTicketType()=="ECO"){
			total=(getNumberofTickets()*ticket.getTicketPrice())*0.15;
		}else if (ticket.getTicketType()=="NORM"){
			total=(getNumberofTickets()*ticket.getTicketPrice())*0.15;
		}
	}
	
	ticket.setTicketID(null);
	ticketIssuance.setTicketStatus(false); 
	return total; 
	}	

/**
 * If a customer buys more than one ticket
 * @return noTcktsTrans the total number of tickets per transaction dependent on GUI session
 */
private int getNumberofTickets() {
	 
	return noTcktsTrans;
}


/**
 * This method will display invoice information and process the transaction (GUI dependent)
 */
public void processtransaction(){
	//display venuename
	//display ticket category
	//display number of tickets
	//display method of payment
	//display transaction type
	//display channel of service
	//Sell or refund total
	
	
}

Ticket ticket=new Ticket(); 
TicketIssuance ticketIssuance=new TicketIssuance();
}
