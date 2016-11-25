package symphony.domain;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class represents a financial transaction
 * It provides a description, account number, a timestamp
 * It also has credit and debit variables to be used as part of a general ledger 
 * @author Kathleen McNulty
 * 
 */
public class FinancialTransaction 
{
	/* CONSTRUCTORS	--------------------------------------------------	*/
												
/**
 * Default Constructor
 */
	public FinancialTransaction()
	{ 
		description=null;
		accountno = 0;
		timestamp2="";
	}
/**
 * Parameterized constructor
 * @param description- text description of financial transaction
 * @param accountno- client account number financial transaction
 * @param timestamp2- a formated string for when the financial transaction occured
 */
	public FinancialTransaction(String description, int accountno, String timestamp2){
		this.description=description;
		this.accountno = accountno;
		this.timestamp2=timestamp2;
		
	}

	/* ACCESSORS	-----------------------------------------------------	*/
												
/**
 * This provides the general description of the financial transaction
 * @return description
 */
	public String getDescription(){
		return description; 
	}
	
/**
 * This provides the account number of the customer associated with each financial activity
 * @return accountno
 */
	public int getAccountNo(){
		return accountno;
	}

	/**
	 * This provides a formated timestamp
	 * @return timestamp2
	 */
	public String getTimeStamp(){
		String timestamp2=sdf.format(timestamp);
		return timestamp2;
	}
/**
 * This method provides a credit activity amount
 * @return credit
 */
	public double getCredit() {
	return credit;
}
	/**
	 * This method provides a debit activity amount
	 * @return debit
	 */

	public double getDebit() {
		return debit;
	}
	
	

	/* MODIFIERS	-----------------------------------------------------	*/

	/**This updates or creates the description of the finacial transaction
	 * @param description
	 */
	public void setDescription(String description){
		this.description=description; 
	}
	/**
	 * This updates or creates the account number of the associated with the financial transaction activity
	 * @param accountno
	 */
	public void setAccountNo(int accountno){
		this.accountno = accountno;
	}
/**
 * This creates the timestamp for the financial activity
 * @param timestamp
 */
	public void setTimeStamp(Timestamp timestamp){
		this.timestamp = timestamp;
		
	}
	
	/**
	 * This creates or updates a credit activity amount to be used for a general ledger
	 * @param credit
	 */
	public void setCredit(double credit) {
		this.credit = credit;
	}
	/**
	 * This creates or updates a debit activity amount to be used for a general ledger
	 * @param debit
	 */
	public void setDebit(double debit) {
		this.debit = debit;
	}


	/* ATTRIBUTES	-----------------------------------------------------	*/



/**This variable is a text description of the transaction**/
	private String description;
/**This variable is the account number of the client**/
	private int accountno;
	/**This variable is a formated timestamp **/
	 private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	 /**This object obtains an unformatted timestamp**/
	 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	 /**This variable is a formated String representation of a timesttamp**/
	 String timestamp2;
	 /**This variable is a credit activity amount**/
	private double credit; 
	 /**This variable is a debit activity amount**/
	private double debit; 

	
}









