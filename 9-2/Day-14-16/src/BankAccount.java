
public class BankAccount {
//	instance variables
	
	private String accNumber;
	private double accBalance;
	private boolean savings;
	
// constructor method - build the object 
//	(takes data from the driver and assigns it to the instance variables)
	public BankAccount(String a, double b, boolean s) {
		this.accNumber = a;
		this.accBalance = b;
		this.savings = s;
	}
	
//	defaults constructor
	public BankAccount() {
		
		this.accNumber = "00000";
		this.accBalance = 0.0;
		this.savings = false;
		
	}
	
	
//	getter methods
	public String getAccNum() {
		return this.accNumber;
	}
	
	public double getBalance() {
		return this.accBalance;
	}
	
	public boolean getSavingsStat() {
		return this.savings;
	}
	
	public void deposit(double depositAmount) {
		this.accBalance += depositAmount;
	}
	
	public boolean withdraw(double withdrawal) {
		if(withdrawal <= this.accBalance) {
			this.accBalance -= withdrawal;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Account Number: " + this.accNumber + "\nBalance: " + this.accBalance + "\nSavings Account: "+this.getSavingsStat();
	}
}
