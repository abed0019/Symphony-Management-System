package symphony.domain;
import java.lang.reflect.Array;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Description of this class.
 * @author    Kathleen McNulty
 * @version   1.0.0 Date
 */
public class ConcertSeason	{


	/* CONSTRUCTORS	--------------------------------------------------	*/
	/* TODO:	Place constructors here.												*/
	public ConcertSeason(String seasonName){
		this.seasonName = seasonName;
			
			concertSeasonDate = new java.sql.Timestamp(aDate.getTime());
		concertList = new ArrayList<Concert>();
		this.length = 0;
	}
	public ConcertSeason(String seasonName, int length){
		this.seasonName = seasonName;
		concertList = new ArrayList<Concert>();
		this.length = 0;
	}
	public ConcertSeason(String seasonName, java.sql.Timestamp concertSeasonDate, int length, ArrayList<Concert> concertList){
		this.concertSeasonDate=concertSeasonDate; 
		this.length=length; 
		this.concertList=concertList; 
		this.seasonName = seasonName;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/* TODO:	Place accessors here.													*/
	public java.sql.Timestamp getOpeningDate(){
		return concertSeasonDate;
	}
	public ArrayList<Concert>getConcertList(){
		return concertList;
	}
	public int getLength(){
		return length;
	}



	/* MODIFIERS	-----------------------------------------------------	*/
	/* TODO:	Place modifier/mutator methods here.	
	 */
	public void setOpeningDate(java.sql.Timestamp concertSeasonDate){
		this.concertSeasonDate=concertSeasonDate; 
	}
	public void setLength(int length){
		this.length=length; 
	}
	public void setConcertList(ArrayList<Concert> concertList){
		this.concertList=concertList; 
	}

	public void addConcert(Concert concertToAdd){
		this.concertList.add(concertToAdd);//adding a new concert to the list
	}
	/**
	 * @return the seasonName
	 */
	public String getSeasonName() {
		return seasonName;
	}
	/**
	 * @param seasonName the seasonName to set
	 */
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	//CONTEMPLATE BUSINESS RULES FOR CONDUCTOR

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/* TODO:	Place public behavior here.											*/



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.	
	 * 											*/
	public void displayAllConcert(){
		for (Concert concert : concertList) {
			System.out.println(concert);
		}
	}
	@Override
	public String toString() {
		return "\n[ConcertSeason:  " + seasonName 
				+ ", Opening Date: " + this.concertSeasonDate
				+ ", length (In days) : " + this.length
				+ " ]";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	private ArrayList<Concert>concertList;
	private int length;
	private String seasonName;
	java.util.Date aDate = new java.util.Date();	
	java.sql.Timestamp concertSeasonDate;

	//uncomment lines below to test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Testing Concert season");
		ConcertSeason season = new ConcertSeason("test season");
		ConcertSeason fall = new ConcertSeason("fall");
		ConcertSeason winter = new ConcertSeason("winter");
		System.out.println(season);
		System.out.println(fall);*/
		Ticket ticket = new Ticket();
		ticket.displayTicket();
	}
}	/*End of CLASS:	Skeleton.java*/

