package cst8288_group;
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
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		try {
			openingDate = new Date(sdf1.parse("10-01-2000").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		concertList = new ArrayList<Concert>();
		this.length = 0;
	}
	public ConcertSeason(String seasonName, int length){
		this.seasonName = seasonName;
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		try {
			openingDate = new Date(sdf1.parse("10-01-2000").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		concertList = new ArrayList<Concert>();
		this.length = 0;
	}
	public ConcertSeason(String seasonName, Date openingDate, int length, ArrayList<Concert> concertList){
		this.openingDate=openingDate; 
		this.length=length; 
		this.concertList=concertList; 
		this.seasonName = seasonName;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/* TODO:	Place accessors here.													*/
	public Date getOpeningDate(){
		return openingDate;
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
	public void setOpeningDate(Date openingDate){
		this.openingDate=openingDate; 
	}
	public void setLength(int length){
		this.length=length; 
	}
	public void setConcertList(ArrayList<Concert> concertList){
		this.concertList=concertList; 
	}

	public void addConccert(Concert concertToAdd){
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
		return "[ ConcertSeason:  " + seasonName 
				+ " Opening Date: " + this.openingDate	
				+ " length (In days) : " + this.length
				+ " ]";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	public Date openingDate;
	private ArrayList<Concert>concertList;
	private int length;
	private String seasonName;

	//uncomment lines below to test
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Concert season");
		ConcertSeason season = new ConcertSeason("test season");
		ConcertSeason fall = new ConcertSeason("fall");
		ConcertSeason winter = new ConcertSeason("winter");
		System.out.println(season);
		System.out.println(fall);
	}*/
}	/*End of CLASS:	Skeleton.java*/

