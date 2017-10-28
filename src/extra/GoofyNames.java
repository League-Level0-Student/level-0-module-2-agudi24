//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name, e.g. mario
        String name = JOptionPane.showInputDialog("Enter your name:");
		// 2. Print upper case name to the console using .toUpperCase(), e.g.MARIO
        System.out.println(name.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
        name.substring(1,4);
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to change this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name, e.g. MaRiO

	}
}


