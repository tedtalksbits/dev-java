import javax.swing.*;
public class FirstStore {

	public static void main(String[] args) {
		
		String[] products = {"HP Laptop", "Dell Laptop", "Macbook Pro", "Chrome Book", "Lenovo Laptop", "Generic Laptop"};
		double[] prices = {1200.89, 1100.99, 1599.99, 499.97, 1280.86, 200.98};
		int[] inventory = {19, 9, 10, 25, 6, 100};
		String msg = "";
		
		//get initial menu option and show menu
		int menuoption = showMenu(products, prices);
		
		while(menuoption != -2) {
			// process the menu option while the user doesn't chose -2 to quit
			
			if(menuoption >= 0 && menuoption < products.length) {
				
				int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity to puchase"));
				
				if(quantity <= inventory[menuoption]) {
					
					//we have enough in inventory
					double totalcost = quantity * prices[menuoption]; 
					msg = "Product ordered: " + products[menuoption] + "\n";
					msg += "Quantity: " + quantity + "\n";
					msg += "Total: " + totalcost + "\n";
					JOptionPane.showMessageDialog(null, msg);
					
					//subtract quantity from inventory array
					inventory[menuoption] = inventory[menuoption] - quantity;
					
				}
				else {
					//not enough in inventory
					JOptionPane.showMessageDialog(null, "Not enough in stock!");
				}

			}
			else if(menuoption == -1) {
				//view inventory
				msg = "Here is the inventory of the store \n\n";
				
				for(int i = 0; i< products.length; i++) {
					msg += products[i] + " - " + inventory[i] + "\n";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
			else {
				//catch all 
				JOptionPane.showMessageDialog(null, "Not a valid option");
			}
			menuoption = showMenu(products, prices);
		}
	}
//	ends main
//	showMenu()
	public static int showMenu(String[] products, double[] prices) {
		String menumsg = "Welcome to the laptop store!! \n\n";
		menumsg += "-1 to view inventory\n";
		menumsg += "-2 to quit program\n\n";
		
		//output should be : index "-" products $price
		
		for(int i = 0; i < products.length; i++ ) {
			
			menumsg += i + " - " + products[i] + " $" +prices[i] + "\n";
		}
		
		return Integer.parseInt( JOptionPane.showInputDialog(menumsg));
	}
//	ends showMenu()
}
