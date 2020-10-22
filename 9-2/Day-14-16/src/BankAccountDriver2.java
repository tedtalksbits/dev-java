
public class BankAccountDriver2 {
	public static void main(String[] args) {
		
		
		
		BankAccount paulAccount = new BankAccount("000012", 150.00, true);
		BankAccount testAccount = new BankAccount();
		
		System.out.println( "Balance: " + paulAccount.getBalance());
		paulAccount.deposit(1000.00);
		System.out.println("Balance after deposit: " + paulAccount.getBalance());
		
		if (paulAccount.withdraw(400.00) == true ) {
			
			System.out.println( "Balance: " + paulAccount.getBalance());
		}
		
		
		
		
		
		
	}
}
