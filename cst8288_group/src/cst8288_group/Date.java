package CST8288_group;

/**
 * <b>Date Class</b>
 * Date in day, month, and year
 * @author    My My Ngo
 * @version   1.0.0 October 25, 2016
 */
public class Date {
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for Date
	 */
	public Date() {
		setDay(99);
		setMonth(99);
		setYear(9999);
	}//end default constructor		
	
	/**
	 * Overloaded constructor for adding day, month, year
	 * @param day - day of date
	 * @param month - month of Date
	 * @param year - year of Date
	 */
	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}//end overloaded constructor1
	
	/**
	 * Overloaded constructor for adding day, month, year through a Date object
	 * @param date object containing day, month, and year of a concert date
	 */
	public Date(Date concertDate) {
		setDay(concertDate.day);
		setMonth(concertDate.month);
		setYear(concertDate.year);
	}//end overloaded constructor2

	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Day getter method
	 * @return day as an Integer
	 */
	public int getDay() { 
		return day; 
	}

	/**
	 * Month getter method
	 * @return month as an Integer
	 */
	public int getMonth() {  
		return month; 
	}

	/**
	 * Year getter method
	 * @return year as an Integer
	 */
	public int getYear() {  
		return year; 
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Day setter method - set day with an integer parameter
	 * @param day as an integer 
	 */
	public void setDay(int day) {
		this.day = day;
	}// end setDay

	/**
	 * Month setter method - set month with an integer parameter
	 * @param month as an integer 
	 */
	public void setMonth(int month) {
		this.month = month;
	}// end setMonth

	/**
	 * Year setter method - set year with an integer parameter
	 * @param year as an integer 
	 */
	public void setYear(int year) {
		this.year = year;
	}// end setYear

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Composition as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ " 
				+ "Day=" + getDay() 
				+ " Month=" + getMonth()
				+ " Year=" + getYear()
				+ " ]";
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * day of the Date as a private integer
	 */
	private int day;
	
	/**
	 * month of the Date as a private integer
	 */
	private int month;
	
	/**
	 * year of the Date as a private integer
	 */
	private int year;
	
} /*	End of CLASS:	Date.java			*/
