//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like Bananas?");
		//2. if they say no, 
		if(banana.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy.");
		}
		else if(banana.equalsIgnoreCase("Yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby? (use an -ing verb)");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
