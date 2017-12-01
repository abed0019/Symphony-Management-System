package symphony.domain;

/**
 * Committee Class
 * This class represents the Symphony Management Committee.  
 * It includes 4 people: the chairman, vice-chairman, secretary, and treasurer.
 * Author    Zobayed Abedin
 * @version   1.0.0	2016-10-26
 */

public class Committee	{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	public Committee()
	{
		
	}

	/**
	 * Constructor for Committee class to set the committee officers
	 * @param chairman		A person representing the chairman
	 * @param viceChairman	A person representing the vice-chairman
	 * @param secretary		A person representing the secretary
	 * @param treasurer		A person representing the treasurer
	 */
	public Committee(Person chairman, Person viceChairman, Person secretary, Person treasurer)
	{
		this.chairman = chairman;
		this.viceChairman = viceChairman;
		this.secretary = secretary;
		this.treasurer = treasurer;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * @return Person The committee chairman
	 */
	public Person getChairman()
	{
		return chairman;
	}

	/**
	 * @return Person The committee vice-chairman
	 */
	public Person getViceChairman()
	{
		return viceChairman;
	}

	/**
	 * @return Person The committee secretary
	 */
	public Person getSecretary()
	{
		return secretary;
	}

	/**
	 * @return Person The committee treasurer
	 */
	public Person getTreasurer()
	{
		return treasurer;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * @param chairman The committee chairman
	 */
	public void setChairman(Person chairman)
	{
		this.chairman = chairman;
	}

	/**
	 * @param viceChairman The committee vice-chairman
	 */
	public void setViceChairman(Person viceChairman)
	{
		this.viceChairman = viceChairman;
	}

	/**
	 * @param secretary The committee secretary
	 */
	public void setSecretary(Person secretary)
	{
		this.secretary = secretary;
	}

	/**
	 * @param treasurer The committee treasurer
	 */
	public void setTreasurer(Person treasurer)
	{
		this.treasurer = treasurer;
	}


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * @return The four committee officers, and any other members
	 */
	public String toString()
	{
		return  "Chairman: " + this.chairman + 
				" Vice-Chairman: " + this.viceChairman + 
				" Secretary: " + this.secretary + 
				" Treasurer: " + this.treasurer;
	}


	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/


	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**
	 * The chairman of the committee
	 */
	private Person chairman;
	/**
	 * The vice-chairman of the committee
	 */
	private Person viceChairman;
	/**
	 * The secretary of the committee
	 */
	private Person secretary;
	/**
	 * The treasurer of the committee
	 */
	private Person treasurer;


}	/*	End of CLASS:	Committee.java			*/