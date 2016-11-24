package symphony.domain;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinancialTransaction 
{
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/* TODO:	Place constructors here.												*/

	public FinancialTransaction()
	{ 
		description=null;
		accountno = 0;
		timestamp=null;
	}

	public FinancialTransaction(String description, int accountno, double balance, Customer cust){
		this.description=description;
		this.accountno = accountno;
		
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/* TODO:	Place accessors here.													*/

	public String getDescription(){
		return description; 
	}

	public int getAccountNo(){
		return accountno;
	}

	public String getTimeStamp(){
		String time=sdf.format(timestamp);
		return time;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/* TODO:	Place modifier/mutator methods here.	
	 */
	
	public void setDescription(String description){
		this.description=description; 
	}
	public void setAccountNo(int accountno){
		this.accountno = accountno;
	}

	public void setTimeStamp(Timestamp timestamp){
		this.timestamp = timestamp;
		
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/


	private String description; 
	private int accountno;
	 private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	private double credit; 
	private double debit; 
	
}









