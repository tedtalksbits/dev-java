import javax.swing.*;

public class ArrayClass {

	public static void main(String[] args) {
		
		int[] numlist = new int[5];
		
		for (int i = 0; i < numlist.length; i++) {
			
			numlist[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
			
		}
		
		String msg = "";
		
		for (int i = 0; i< numlist.length; i++) {
			msg += numlist[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
