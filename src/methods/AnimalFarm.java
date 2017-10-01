package methods;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		String animal = JOptionPane.showInputDialog("What animal do you want? Choose from a Cow, Duck, Dog, Wolf, Cat, or a Llama:");
		if (animal.equalsIgnoreCase("Cow")){
		playMoo();
		}
		else if (animal.equalsIgnoreCase("Duck")) {
        	playQuack();
        }
		else if (animal.equalsIgnoreCase("Dog") || animal.equalsIgnoreCase("Wolf")){
        	playWoof();
        }
		else if (animal.equalsIgnoreCase("Cat")) {
        	playMeow();
        }
		else if (animal.equalsIgnoreCase("Llama")) {
        	playLlama();
        }
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		for(int i=0; i<4; i++) {
		playNoise(mooFile);
		}
	}

	void playQuack() {
		for(int i=0; i<4; i++) {
		playNoise(quackFile);
		}
	}

	void playWoof() {
		for(int i=0; i<4; i++) {
		playNoise(woofFile);
		}
	}
    
	void playMeow() {
		for(int i=0; i<4; i++) {
		playNoise(meowFile);
		}
	}
	void playLlama() {
		for(int i=0; i<4; i++)
		playNoise(llamaFile);
	}
	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(1400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
