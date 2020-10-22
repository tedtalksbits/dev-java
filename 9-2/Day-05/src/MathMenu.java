import javax.swing.*;

public class MathMenu {

	public static void main(String[] args) {
		
		//get user input 
		int num1 = Integer.parseInt(JOptionPane.showInputDialog( "Enter first number"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog( "Enter second number"));
		
		//show user menu and get initial choice
		char menuchoice = showMenu();
		
		
		//logic 
		
		
		//while loop 
		while(menuchoice != 'q') {
			
			//process menu choice 
			if(menuchoice == 'a'){
				JOptionPane.showMessageDialog(null, "The sum of the numbers is " + (num1 + num2));
			}
			else if( menuchoice == 'v') {
				JOptionPane.showMessageDialog(null, "The average of the numbers is " + ((num1 + num2) / 2.0));
			}
			else if( menuchoice == 'n') {
				num1 = Integer.parseInt(JOptionPane.showInputDialog( "Enter new first number"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog( "Enter new second number"));
				JOptionPane.showMessageDialog(null, "Your numbers have been logged");
			}
			else if( menuchoice == 'm') {
				JOptionPane.showMessageDialog( null, num1 + " * "  + num2 + " = " + (num1*num2));
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid option");
			}
			
			menuchoice = showMenu();
		}//ends while loop

	}//ends main

	public static char showMenu() {
		
		String menumsg = "Welcome to the Marh Program!\n";
		menumsg += "Please select an option from the menu\n\n";
		menumsg += "(a)dd numbers\n";
		menumsg += "a(v)erage numbers\n";
		menumsg += "(m)ulitiply numbers\n";
		menumsg += "(n)ew numbers\n";
		menumsg += "(q)uit\n\n";
		
		return JOptionPane.showInputDialog(menumsg).toLowerCase().charAt(0);
		
	}//ends showMenu()
	

}//ends class
