//dummy driver just for testing 
public class BankAccDriver1 {

	public static void main(String[] args) {
		
		BankAccount newAccount = new BankAccount ("100292", 20001.00, false);
		BankAccount johnAccount = new BankAccount ("100232", 30000.00, true);
		
		if(newAccount.getBalance() > johnAccount.getBalance()) {
			if(newAccount.getSavingsStat() == true) {
				System.out.println("Account type: Savings");
			}
			else {
				System.out.println("Account type: Checking");
			}
			System.out.println("New account has a bigger balance with $" + newAccount.getBalance());
		}
		else {
			if(johnAccount.getSavingsStat() == true) {
				System.out.println("Account type: Savings");
			}
			else {
				System.out.println("Account type: Checking");
			}
			System.out.println("John account has a bigger balance with $" + johnAccount.getBalance());
		}
	}
	
}
