
import java.util.Scanner;

public class Homework1 {
	
	
	public static void main(String[] args) {
		
		//create scanner object / user prompt
		Scanner tempCheck = new Scanner(System.in);
		
		//initialize variable 
	    int f;
	    
	    // Prompt
	    System.out.println("Enter Farenheit Value:"); 
	    
	    // store user input in f as an integer
	    f = tempCheck.nextInt();   
	    
	    //formula
	    float c = (f - 32) * 5/9; 
	    
	    //conditions
	    if(c > 0) {
	    System.out.println("You've entered: " +f+ " Degres Farenheit, which is " +c+ " Degrees Celcius \nWear a Coat!");
	    }
	    else {
		    System.out.println("You've entered: " +f+ " Degres Farenheit, which is " +c+ " Degrees Celcius \nWear a Jacket!");
	    }
	    
	}//main 

}//Homework1 class
