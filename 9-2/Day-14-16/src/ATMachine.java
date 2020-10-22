// driver classes must have main method
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Random;

public class ATMachine {

	public static void main(String[] args) {
//	images 
		ImageIcon bank = new ImageIcon("bank.png");
		ImageIcon success = new ImageIcon("success.png");
		ImageIcon error = new ImageIcon("error.png");
		ImageIcon yes = new ImageIcon("yes.png");
		ImageIcon account = new ImageIcon("account.png");
		
		boolean savOpt = false;
//	start menu
		//generate random number
		Random random = new Random();
		long p = random.nextInt(10000000);
		String s = String.valueOf(p);
		
		//intro screen
		JOptionPane.showMessageDialog(null, "Welcome to Tedane Bank of New York First Union \n\n Click 'Okay' to create an account!", "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, bank);
		JOptionPane.showMessageDialog(null, "Account: " + s +"\n has been created successfully! \n", "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, success);
		
		
//	main menu
		
		double bal = Double.parseDouble(JOptionPane.showInputDialog("Enter starting balance"));
		char savChoice = savingAcc();
		
		if (savChoice == 'y' ) {
			savOpt = true;
		}
	
		
		BankAccount userAcct = new BankAccount (s, bal, savOpt);
		
		char menuchoice = showMenu();
		
		while(menuchoice != 'q') {
			
			//handle deposit option
			if(menuchoice == 'd') {
				double deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount"));
				userAcct.deposit(deposit);
				JOptionPane.showMessageDialog(null, "Deposit Successful!\n" + userAcct, "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, yes);
			}
			//handle withdraw option
			else if (menuchoice == 'w') {
				double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw"));
				if(userAcct.withdraw(withdraw) == true) {
					JOptionPane.showMessageDialog(null, "Withdrawal Success! \n" + userAcct, "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, yes);
				}
				else {
					JOptionPane.showMessageDialog(null, "Insufficient funds \n" + userAcct, "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, error);
				}
			}
			//handle check balance option
			else if(menuchoice == 'c') {
				JOptionPane.showMessageDialog(null, userAcct, "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, account);
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Menu Option", "Bank of Tedane First Union",JOptionPane.INFORMATION_MESSAGE, error);
			}
			
			menuchoice = showMenu();
		}//ends while !q loop
		
		
		
		

	}//end main
	public static char showMenu() {
		String menumsg = "Welcome to the ATMachine\n\n";
		menumsg += "(d)eposit\n";
		menumsg += "(w)ithdraw\n";
		menumsg += "(c)heck-balance\n";
		menumsg += "(q)uit\n";
		
		return JOptionPane.showInputDialog( menumsg ).toLowerCase().charAt(0);
	}//end showMenu
	
	public static char savingAcc() {
		String savOpt = "Would You Like to make this a savings account? y/n";
		
		return JOptionPane.showInputDialog(savOpt).toLowerCase().charAt(0);
	}

}
