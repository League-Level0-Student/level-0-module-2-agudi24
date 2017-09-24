import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String feet = JOptionPane.showInputDialog("This is a Rollercoaster. What is your height in feet?");
	int Num = Integer.parseInt(feet);
	Num = Num * 12;
	String inch = JOptionPane.showInputDialog("This is a Rollercoaster. What is your height in inches?");
	int Num2 = Integer.parseInt(inch);
	Num = Num + Num2;
	if (Num >= 48) {
		JOptionPane.showMessageDialog(null, "You can go on the roller coaster. Have fun!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, you are not tall enough to go on this roller coaster.");
	}
}
}
