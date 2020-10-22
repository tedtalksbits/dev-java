import javax.swing.*; 
import javax.swing.UIManager;


public class BowlingCalculator {

	public static void main(String[] args) {
		
		
		String linebreak = "\n";
		
		// Obtain user input 
		String name = JOptionPane.showInputDialog("Enter Bowler's Name");
		int score1 = getValidScore("Score 1");
		int score2 = getValidScore("Score 2");
		int score3 = getValidScore("Score 3");
		
		//calculate average 
		double avg = (score1 + score2 + score3) / 3.0;
		
		//construct output
		String msg = "Bowlers name is " + name;
		msg += linebreak + "Score 1 is " + score1;
		msg += linebreak + "Score 2 is " + score2;
		msg += linebreak + "Score 3 is " + score3;
		msg += linebreak + linebreak + "Bowling avergae is " + avg;
		
		//display outcome
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}//ends main
	
	public static int getValidScore(String scorenum) {
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("Enter " + scorenum));
		
		while (score < 0 || score > 300) {
			score = Integer.parseInt(JOptionPane.showInputDialog(score +" is invalid\n Enter " +scorenum+ " again"));
		}
		return score;
		

	}
	
	
}//ends class 
