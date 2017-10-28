//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class RocketShip {
	public static void main(String[] args) {
		
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String start = JOptionPane.showInputDialog("Start counting from 10");
		// 3. convert the user's answer to an int (Integer.parseInt)
        Integer.parseInt(start);
		// 4. count down from user's starting point
        System.out.println("10");
        System.out.println("9");
        System.out.println("8");
        System.out.println("7");
        System.out.println("6");
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Blast Off!");
		// 1. count down from 10 to 0 (print each number)

		// 5. when the counting is done, print "blastoff!"
		// 6. replace the print commands with calls to the speak() method 
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

