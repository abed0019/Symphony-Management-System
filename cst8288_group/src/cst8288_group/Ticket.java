package cst8288_group;
//comment

public class Ticket {

	String venuetype;
	public Ticket(String ticketType, int ticketprice){
		this.ticketprice=ticketprice; 
		this.tickettype=ticketType;
		ticketID = UniqueID.getInstance();
	}
	public Ticket(){}

	/*public double ticketprice(String tickettype, String venueType){//Maybe added to venue
		if (venueType=="Entertainment District"){
			if (tickettype=="VIP"){
				ticketprice=200;
			}
				if (tickettype=="ECO"){
					ticketprice=150;
				}
					if (tickettype=="NORM"){
						ticketprice=100;
					}

		else if (venueType=="Non-Entertainment District"){
			if (tickettype=="VIP"){
				ticketprice=150;

			}
				if (tickettype=="ECO"){
					ticketprice=100; 

				}
					if (tickettype=="NORM"){
					ticketprice=50;	
					}
		}
		}
		return ticketprice; 
	}*/

	public void setTicketPrice(double ticketprice){
		this.ticketprice=ticketprice; 
	}

	public double getTicketPrice(){
		return ticketprice; 
	}

	public void setTicketID(Integer ticketID){
		this.ticketID=ticketID; 
	}
	public Integer getTicketID(){
		return ticketID; 
	}
	public void setTickettype(String tickettype){
		this.tickettype=tickettype; 

	}

	public String getTicketType(){
		return tickettype; 

	}

	private String tickettype;
	private double ticketprice;
	private Integer ticketID; 
	Venue venue=new Venue();
	
	private static class UniqueID{
		private static int uid = 0;
		public static int getInstance(){
			uid++;
			return uid;
		}
	}
}
