import javax.swing.JOptionPane;

public class ArrayFun {

	public static void main(String[] args) {
		
		int size = Integer.parseInt(JOptionPane.showInputDialog("Enter array size"));
				
		int [] randomNumbers = new int[size];
		
		String msg = size + " Random Numbers: \n\n";
		
		//populate the array with random numbers 1:100
		
		for (int i = 0; i < randomNumbers.length; i++) {
			
			//random number between 1 - 100
			randomNumbers[i] = (int)(Math.random() * 100 + 1);
			
			//put each number on a new line
			msg += randomNumbers[i] + "\n";
		}
		
		
		//display
		JOptionPane.showMessageDialog(null, msg);

		
		//calculate the average value within the array
		
		int sum = 0;
		
		for(int i = 0; i < randomNumbers.length; i++) {
			
			sum += randomNumbers[i];
		}
		
		
		//casting - changing the data type temporarily using (dataType)
		double avg = sum / (double)randomNumbers.length;
		
		JOptionPane.showMessageDialog(null, "The average of the numbers is " + avg);
		
		
		//determine and print the maximum value within the array
		
		int max = randomNumbers[0];
		
		
		for(int i = 1; i < randomNumbers.length; i++) {
			if(randomNumbers[i] > max) {
				max = randomNumbers[i];

			}
		}
		
		JOptionPane.showMessageDialog(null, "The max number is " + max);
	}

}
