import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
	
	
	//Voting Booth 

//     Copyright (c) The League of Amazing Programmers 2013-2017
//     Level 0

//1: Ask the user how old they are (in years)
String age = JOptionPane.showInputDialog("This is the official voting booth. How old are you?");
int Num = Integer.parseInt(age);


//2: If they are over 18, ask them who the next president should be
if(Num >= 18) {
	JOptionPane.showInputDialog("Who should the next President be?");
	JOptionPane.showMessageDialog(null, "Your response has been recorded.");
}
else {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
}
//3: If they are younger, tell them nobody cares what they think



}
}