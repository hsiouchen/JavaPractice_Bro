import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner scan = new Scanner(System.in);
		
		File file = new File("Over the Mountain.wav");
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		// background play
		// <terminated>
		// Create Scanner
		//clip.start();

		
		String response = "";
		
		while (!response.equals("Q" )) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter you choice: ");
			
			response = scan.next();
			response = response.toUpperCase();
			
			switch(response) {
				case("P"):
					clip.start();
					break;
				case("S"):
					clip.stop();
					break;
				case("R"):
					clip.setMicrosecondPosition(0);
					break;
				case("Q"):
					clip.close();
					break;
				default:
					System.out.println("Not a valid response");
			}
		}		
		System.out.println("Byeeeee!");
		
		
		
		
		
	}

}
