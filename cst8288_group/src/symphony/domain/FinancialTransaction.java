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
 * Parametized constructor
 * @param description
 * @param accountno
 * @param timestamp2
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

	/* ATTRIBUTES	-----------------------------------------------------	*/


	private String description; 
	private int accountno;
	 private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	 String timestamp2;
	private double credit; 
	private double debit; 
	private int ticketSold;
	
}









