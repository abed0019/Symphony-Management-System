 package cst8288_group;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class ConcertSeason	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/* TODO:	Place constructors here.												*/
	public ConcertSeason(){
		
	}
	public ConcertSeason(GregorianCalendar openingDate, int length, ArrayList<Concert> concertList){
		this.openingDate=openingDate; 
		this.length=length; 
		this.concertList=concertList; 
	
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/* TODO:	Place accessors here.													*/
	public GregorianCalendar getOpeningDate(){
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
	public void setOpeningDate(GregorianCalendar openingDate){
		this.openingDate=openingDate; 
	}
	public void setLength(int length){
		this.length=length; 
	}
	public void addConcert(ArrayList<Concert> concertList){
		this.concertList=concertList; 
	}
//CONTEMPLATE BUSINESS RULES FOR CONDUCTOR

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/* TODO:	Place public behavior here.											*/



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/


	/* ATTRIBUTES	-----------------------------------------------------	*/
	public GregorianCalendar openingDate;
	private ArrayList<Concert>concertList;
	private int length; 



}	/*	End of CLASS:	Skeleton.java			*/

