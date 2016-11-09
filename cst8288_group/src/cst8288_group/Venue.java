package cst8288_group;

/**
 * Venue Class
 * This class represents the concert Venue in the Symphony Management System.
 * It includes an address, the name of the venue, and the maximum capacity for the venue.
 * Author    Adam Shalla
 * @version   1.0.0	2016-10-26
 */

public class Venue	{

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
		this.locationName = locationName;
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


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * @return The venue name, location, and max capacity variables respectively
	 */
	public String toString()
	{
		return  "Venue: " + this.getLocationName() + 
				" Address: " + this.getLocation() + 
				" Max capacity: " + this.getMaxCapacity();
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



}	/*	End of CLASS:	Venue.java			*/