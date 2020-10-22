import javax.swing.*;
public class SearchArray {

	public static void main(String[] args) {

		
		
		int[] numlist = new int[10];
		
		char runagain = 'y';
		
		int searchval;
		
		boolean numfound = false;
		
		int max_array_val = 20;
		
		String msg = "";
		
		//populate the array with random numbers btw 1 & 20
		for (int i = 0; i < numlist.length; i++) {
			
			numlist [i] = (int)(Math.random() * max_array_val + 1);
			
		}//ends for loop
		
		while (runagain == 'y') {
			
			//clear msg
			msg = "";
			
			numfound = false;
			
			searchval = Integer.parseInt(JOptionPane.showInputDialog("Enter Number a value between 1 and " +max_array_val+ "\n"));
			
			while(searchval < 1 || searchval > max_array_val) {
				searchval = Integer.parseInt(JOptionPane.showInputDialog("Value out of range, enter a new value between 1 and " +max_array_val+ "\n"));
			}
			//perform the search
			for (int i = 0; i< numlist.length; i++) {
				if(searchval == numlist[i]) {
					
					msg += searchval +" was found at position " + i +"\n"; 
					numfound = true;
				}
				
				
			}//end search loop
			
			if(numfound == false) {
				msg = "Sorry, " + searchval + " was not found"; 
			}
			
			JOptionPane.showMessageDialog(null, msg);
			
			runagain = JOptionPane.showInputDialog("Perform another search? (y/n)").charAt(0);
		}
		
		
		
//end of main
	}

//	ends class
}
