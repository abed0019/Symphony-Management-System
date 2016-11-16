package cst8288_group;

/**
 * Scheduled Concert Class
 * This class represents a concert that has been scheduled.
 * It includes a venue in which it will be held, a TicketSales object representing the ticket sales
 * for the concert, and a ConcertDate representing the date on which the concert will take place.
 * 
 * @author	Adam Shalla
 * @version	1.0.0	2016-10-26
 *
 */
public class ScheduledConcert extends Concert {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Initial Constructor - initializes all member attributes
	 */
	public ScheduledConcert()
	{
		venue = new Venue();
		ticketSales = new TicketSales();
		concertDate = new ConcertDate();
	}
	
	/**
	 * Parameterized Constructor - sets the concert venue & date, and initializes the
	 * TicketSales object
	 * @param venue		The concert venue
	 * @param sales		The ticket sales for the concert
	 * @param date		The concert date
	 */
	public ScheduledConcert(Venue venue, TicketSales sales, ConcertDate date)
	{
		this.venue = venue;
		ticketSales = sales;
		concertDate = date;
	}
	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * @return Venue of the concert
	 */
	public Venue getVenue()
	{
		return venue;
	}

	/**
	 * @return Ticket sales of the concert
	 */
	public TicketSales getTicketSales()
	{
		return ticketSales;
	}
	
	/**
	 * @return Scheduled date of the concert
	 */
	public ConcertDate getConcertDate()
	{
		return concertDate;
	}
	
	
	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * @param venue - The venue of the concert
	 */
	public void setVenue(Venue venue)
	{
		this.venue = venue;
	}
	
	/**
	 * @param sales - The ticket sales of the concert
	 */
	public void setTicketSales(TicketSales sales)
	{
		this.locationName = locationName;
	}
	
	/**
	 * @param maxCapacity The maximum capacity of the venue
	 */
	public void setMaxCapacity(int maxCapacity)
	{
		this.maxCapacity = maxCapacity;
	}
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	
	
	
	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The venue in which the concert will be held
	 */
	private Venue venue;
	
	/**
	 * The ticket sales for the concert
	 */
	private TicketSales ticketSales;
	
	/**
	 * The date on which the concert will be held
	 */
	private ConcertDate concertDate;
	
}	/*	End of CLASS:	ScheduledConcert.java			*/