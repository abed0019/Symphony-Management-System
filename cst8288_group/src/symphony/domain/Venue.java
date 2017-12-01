package symphony.domain;

/**
 * Venue Class
 * This class represents the concert Venue in the Symphony Management System.
 * It includes an address, the name of the venue, and the maximum capacity for the venue.
 * Author    Zobayed Abedin
 * @version   1.0.0	2016-10-26
 */

public class Venue	extends ConcertEntity{ //shoudld extend concertEntity

	/* CONSTRUCTORS	--------------------------------------------------	*/
	public Venue()
	{
		
	}

	/**
	 * Constructor for Committee class to set the name, location, and max capacity of the venue
	 * @param location		An address represening the location of the venue
	 * @param locationName	A string representing the name of the venue
	 * @param maxCapacity	An int representing the maximum capacity of the venue
	 */
	public Venue(Address location, String locationName, int maxCapacity)
	{
		this.location = location;
		setName(locationName);
		this.maxCapacity = maxCapacity;
	}

	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * @return Address of the venue
	 */
	
	
	
	public Address getLocation()
	{
		return location;
	}

	
	
	/**
	 * @return String containing the venue name
	 */
	
	
	public String getLocationName()
	{
		return locationName;
	}
	
	
	
	/**
	 * @return int representing the maximum capacity of the venue
	 */
	
	
	
	public int getMaxCapacity()
	{
		return maxCapacity;
	}
	
	
	
	/**
	 * @return int represents the total tickets sold for a particular venue
	 */
	
	
	
	public int getTotalTicketSale()
	{
		return totalTicketSale;
	}
	
	

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * @param location The address of the venue
	 */
	
	
	
	public void setLocation(Address location)
	{
		this.location = location;
	}
	
	
	
	/**
	 * @param locationName The name of the venue
	 */
	
	
	public void setLocationName(String locationName)
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
	
	
	/**
	 * 
	 * @param totalTicketSale Total number of tickets sold for a particular venue
	 */
	
	
	public void setTotalTicketSale(int totalTicketSale)
	{
		this.totalTicketSale = totalTicketSale;
	}
	

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * @return The venue name, location, and max capacity variables respectively
	 */
	
	
	public String toString()
	{
		return  "[Venue: " + super.getName() + 
				" at address: " + this.getLocation() + 
				" with max capacity: " + this.getMaxCapacity() + "]";
	}


	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/


	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The address of the venue
	 */
	private Address location;
	/**
	 * The name of the venue
	 */
	private String locationName;
	/**
	 * The maximum capacity of the venue
	 */
	private int maxCapacity;
	/**
	 * Total ticket sales for a particular venue
	 */
	private int totalTicketSale;


}	/*	End of CLASS:	Venue.java			*/