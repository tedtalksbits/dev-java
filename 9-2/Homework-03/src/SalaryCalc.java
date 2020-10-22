import javax.swing.JOptionPane;

public class SalaryCalc {

	public static void main(String[] args) {
		
		String spacer = " **************** ";
		//obtain user input using JOptionPane
		
		double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));
		int years = Integer.parseInt(JOptionPane.showInputDialog("How many years?"));
		
		//calculate bonus
		double bonus = 0.05 * salary;
		
		//create output message
		String msg = "Bonus Calculator\n\n";
		msg+= "\nSalary: " + salary;
		msg+= "\nYears: " + years + "\n\n";
		

		//loop
		for(int i = 1; i <= years; i++ ) {
			
			salary += bonus;
			
			msg += "Year " + i + spacer + salary +"\n";

			
			//for some reason /t wasn't working so I made my own spacer ;)
		}
		//display output message
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
