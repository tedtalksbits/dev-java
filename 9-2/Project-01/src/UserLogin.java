import javax.swing.JOptionPane;

public class UserLogin {

	public static void main(String[] args) {

		String msg ="Not found";
		String[] usernames = {"apple", "banana", "car", "door", "erling"};
		String[] passwords = {"a", "b", "c", "d", "e"};
		int[] numlogs = {0,0,0,0,0};

		String choice = showMenu(usernames);
		
		while (!choice.equals("q")) {
			String username = JOptionPane.showInputDialog("Enter username");
			String password = JOptionPane.showInputDialog("Enter Password");
			for(int i = 0; i < usernames.length; i++) {
				
				if (username.equals(usernames[i]) && password.equals(passwords[i])) {
					msg = "You are now logged in!! \n\n";
					numlogs[i]++;
					msg += "Total number of logins is " + numlogs[i];
					
					if(!username.equals(usernames[i])) {
						msg = "not found";
					}
				}
				
			}
	
			JOptionPane.showMessageDialog(null, msg);
			choice = showMenu(usernames);
			
		}
		
		
		
		
	}
//	ends main
//	showMenu()
	public static String showMenu(String[] usernames) {
		String menumsg = "Select an option --> \n\n";
		menumsg += "(L)ogin to account\n";
		menumsg += "(q)uit program\n\n";
		
		
		return JOptionPane.showInputDialog(menumsg);
	}

}
