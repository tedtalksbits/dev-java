import javax.swing.JOptionPane;

public class ArraysHomework {

	public static void main(String[] args) {
		
//		make empty array size 20
		int[] numlist = new int[20];
		
//		get user input
		int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 10 and 500"));
		
		
//		make output message 
		String msg = "";
		
		
//		check input
//		input must NOT be <10 or >500
		while (userInput < 10 || userInput > 500) {
			
		 userInput = Integer.parseInt(JOptionPane.showInputDialog("Invalid Number! Enter a number between 10 and 500"));
		
		}
		
// 		populate array with random numbers starting with user input 		
			for(int i = 0; i < numlist.length; i++) {
				
				numlist[i] = (int)(Math.random() * userInput + 1);
			
//		each value separated by "," except last value
				if( i < numlist.length - 1) {
					
					msg += numlist[i] + ", ";
					
				}
				else {
					msg += numlist[i];
				}
		
			}//ends for loop
				
		
		
		JOptionPane.showMessageDialog(null, msg + "\n\n");
		
		//******************************************ODD / EVEN********************************//
		
// 		check for even and odd numbers
		
		 int oddcount = 0;
		 int evencount = 0;
		 
		 for(int i = 0; i < numlist.length; i++) {
			if (numlist[i] % 2 == 0) {
				evencount ++;
			}
			else {
				oddcount++;
			}
		 }
		msg += "\n\nNumber of Odd Numbers: " + oddcount;
		msg += "\n\nNumber of Even Numbers: " + evencount;
		JOptionPane.showMessageDialog(null, msg + "\n\n");
		
		
		//******************************************GREATER THAN 100********************************//
		
		msg+= "\n\nNumbers Greater than 100: ";
		
		for(int i= 0; i < numlist.length; i++) {
			
			if(numlist[i] > 100) {
				
				if( i < numlist.length - 1) {
					
					msg += numlist[i] + ", ";
					
				}
				else {
					
					msg += numlist[i];
					
				}
			}
			
		}
		 
		JOptionPane.showMessageDialog(null, msg);
		
		//****************************************** % 3 ********************************//
		msg += "\n\nNumbers divisible by 3: ";
		
		for(int i = 0; i < numlist.length; i++) {
			
			if (numlist[i] % 3 == 0) {
				
				if( i < numlist.length - 1) {
					
					msg += numlist[i] + ", ";
					
				}
				else {
					
					msg += numlist[i];
					
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
	}//ends main

}//ends class
