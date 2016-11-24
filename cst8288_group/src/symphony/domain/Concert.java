package symphony.domain;
import java.util.*;


/**
 * Concert Class
 * This class identifies the type of concert.
 * @author    My My Ngo
 * @version   1.0.0 October 25, 2016
 */

public abstract class Concert extends ConcertEntity{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for the required parameters.
	 * @param conductor as a Conductor object
	 * @param soloist as a Soloist object
	 * @param id as a String from ConcertEntity class
	 * @param name as a String from ConcertEntity class
	 */
	public Concert(Conductor conductor, Soloist soloist, String id, String name){
		super(id, name);
		this.soloist = soloist;
		this.conductor = conductor;
		compositionPlaylist = new ArrayList<>();
	}//end Concert()

	
	public void addComposition(Composition composition){
		compositionPlaylist.add(composition);
	}//end addComposition()

	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Conductor getter method
	 * @return conductor as a Conductor object
	 */
	public Conductor getConductor(){
		return conductor;
	}//end getConductor()

	/**
	 * Soloist getter method
	 * @return soloist as a Soloist object
	 */
	public Soloist getSoloist(){
		return soloist;
	}//end getSoloist()

	//put getter and setter for composition arraylist, soloist,

	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Conductor setter method
	 * @param conductor as a Conductor object
	 */
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}//end setConductor()

	/**
	 * Soloist setter method
	 * @param soloist as a Soloist object
	 */
	public void setSoloist(Soloist soloist){
		this.soloist = soloist;
	}//end setSoloist()


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Concert number and concert date as a meaningful String
	 */
	@Override  
	public String toString() {
		return "\n[Concert Name: " + super.getName() + ", Concert ID: " + super.getID() 
				+ ", Conductor: " + conductor + ", Soloist" + soloist + ", Composition: "
				+ compositionPlaylist + "]";
	}

	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.		
	 */



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 *  Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * 	uses the WrapperManager to start the ServerWrapper object.
	 * 	@param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main(String[] args) {
		//Test output
		/*Concert concert = new Concert(concertNumber);
		System.out.println(concert);*/
	}//end main


	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * Soloist for a concert
	 */
	private Soloist soloist;
	
	/**
	 * Conductor for a concert
	 */
	private Conductor conductor;
	
	/**
	 * Array of compositions for the concert
	 */
	private ArrayList<Composition> compositionPlaylist;
	
	


}/****   END Concert Class  **********/
