package symphony.domain;
import java.lang.reflect.Array;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Concert Season class is a Concert Entity
 * <br>Will be updated later today with JavaDocs
 * @author    Kathleen McNulty, adjusted by Ash-Lee Hommy
 * @version   1.0.0 
 */
public class ConcertSeason extends ConcertEntity{


	/* CONSTRUCTORS	--------------------------------------------------	*/
	/* TODO:	Place constructors here.												*/
	public ConcertSeason(){
		super("id", "name");
		openingDate = new java.sql.Date(0);
		concertList = new ArrayList<ScheduledConcert>();
		length = 0;
	}

	public ConcertSeason(Date openingDate, int length, ArrayList<ScheduledConcert> concertList){
		super("CSid", "CSname");
		this.openingDate = openingDate;
		this.length=length; 
		this.concertList=concertList; 
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/* TODO:	Place accessors here.													*/
	public Date getOpeningDate(){
		return openingDate;
	}
	public ArrayList<ScheduledConcert>getConcertList(){
		return concertList;
	}
	public int getLength(){
		return length;
	}



	/* MODIFIERS	-----------------------------------------------------	*/
	/* TODO:	Place modifier/mutator methods here.	
	 */
	public void setOpeningDate(Date openingDate){
		this.openingDate = openingDate;
	}
	public void setLength(int length){
		this.length=length; 
	}
	public void setConcertList(ArrayList<ScheduledConcert> concertList){
		this.concertList=concertList; 
	}

	public void addConcertToSeason(ScheduledConcert concertToAdd){
		this.concertList.add(concertToAdd);//adding a new concert to the list
	}

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
		return "\n[ConcertList:  " + concertList 
				+ ", Opening Date: " + openingDate
				+ ", length (In days) : " + length
				+ " ]";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	private ArrayList<ScheduledConcert>concertList;
	private int length;
	java.sql.Date openingDate;

}	/*End of CLASS:	Skeleton.java*/

