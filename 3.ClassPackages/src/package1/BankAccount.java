package package1;

public class BankAccount {//start class
	public String accountName;
	public String accountPin;
	public int accountBalance;
	
	//********************** Constructors****************************
	//constructor
	public BankAccount(String accountName,String accountPin,int accountBalance) {//start constructor
		this.accountName=accountName;
		this.accountPin=accountPin;
		this.accountBalance=accountBalance;
		
	}//end constructor
	// empty constructor
	public BankAccount() {}//end empty constructor
	
	//********************** Get/Set METHODS****************************
	public String getAccountName() {
		return accountName;
	}//end get method
	public String getAccountPin() {
		return accountPin;
	}//end get method
	public int getAccountBalance() {
		return accountBalance;
	}//end get method
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}//end set method
	public void setAccountPin(String accountPin) {
		this.accountPin = accountPin;
	}//end set method
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}//end set method
	//********************* OTHER METHODS****************************
	public void bankStatement() {
		System.out.println("Account Name"+getAccountName());
		System.out.println("Account Pin"+getAccountPin());
		System.out.println("Account Balance"+getAccountBalance());
		
	}//end method
	
}//end class
