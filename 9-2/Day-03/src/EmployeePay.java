import javax.swing.*; 

public class EmployeePay {

	public static void main(String[] args) {
		//get rid of annoying \n
		String newline = "\n";
		
		//obtain user input must parse if needed 
		
			//--get users name
		String empName = JOptionPane.showInputDialog("Enter Employee Name");
		double payrate = Double.parseDouble(JOptionPane.showInputDialog("Enter Pay Rate"));
		int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours Worked"));
		
			//--calculate total pay
		double totalpay = payrate * hours;
		
		
		//construct output 
		String msg = "Employee name is " + empName;
		msg += newline + "Hours worked is " + hours;
		msg += newline + "Payrate is $" + payrate;
		msg += newline + newline + "Total pay is $" + totalpay;
		
		//display the output 
		JOptionPane.showMessageDialog(null, msg);
	}

}
