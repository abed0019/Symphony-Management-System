package cst8288_group;

import sun.util.calendar.Gregorian;

//http://stackoverflow.com/questions/21667793/java-simple-accounting-program
//company code
//general ledger account number
//80 byte description encode information in here so you can trance back maybe seat number and venue to trace back to my system to find out where it was generated

public class FinancialTransaction 
{

	private String description; //This will likely be a couple of things so maybe it's an array instead? 
	private int accountno;
	private Gregorian timestamp;
	private double credit; 
	private double debit; 
	private double  test;


	public FinancialTransaction()
	{ 
		description=null;
		accountno = 0;
		timestamp=null;
	}

	public FinancialTransaction(String description, int accountno, double balance, Customer cust){
		this.description=description;
		this.accountno = accountno;
		/*this.balance = balance;
		this.timestamp=timestamp;
		this.channel=channel; */
	}


	public String getDescription(){
		return description; 
	}

	public int getAccountNo(){
		return accountno;
	}
	/*public double getBalance(){
		return balance;
	}
	public double getTaxRate(){
		return taxrate;

	}
	public String getChannel(){
		return channel; 
	}

	public void setChannel(){
		this.channel=channel; 
	}*/
	public void setDescription(String description){//This will be seat number and client info
		this.description=description; 
	}
	public void setAccountNo(int id){
		this.accountno = accountno;
	}
	/*public void setBalance(double balance){
		this.balance=balance;
	}
	public void settaxrate(double taxrate){//Maybe obtain province of venue? Have a getter for that and then have a bunch of if statements for each province
		this.taxrate = taxrate;
	}*/

	public void setTimeStamp(Gregorian timestamp){//How do you generate a timestamp
		this.timestamp = timestamp;
	}


	public Gregorian getTimeStamp(){
		return timestamp;
	}

	/*public double debit (double amount){//replace debit with the ticket price... refund amount
		return balance -= amount;
	} 

	public double credit (double amount){//replace amount with ticket price
		return balance += amount;
	}*/
	Venue venue=new Venue();
}

/*
Description Traceability Venue Seat Number and Datetimestamp....Which Customer Name and ID getname getID

Account number (General Ledger Account Number)Like a bank account number

Debit or Credit to track financial transaction

Specify user... Teller online channel of service 

 */








