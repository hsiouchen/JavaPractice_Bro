package com.swing.examples;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI_JOptionPane {
	
	// JOptionPane = 	pop up a standard dialog box that prompts users for a value
	//					or informs them of something.
	
	GUI_JOptionPane() {
		
		//JOptionPane.showMessageDialog(null, "This is for JOptionPane PLAIN_MESSAGE", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is for JOptionPane INFORMATION_MESSAGE", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is for JOptionPane QUESTION_MESSAGE", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is for JOptionPane WARNING_MESSAGE", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is for JOptionPane ERROR_MESSAGE", "title", JOptionPane.ERROR_MESSAGE);
		
//		while(true)  {
//			JOptionPane.showMessageDialog(null, "This is for JOptionPane WARNING_MESSAGE", "title", JOptionPane.WARNING_MESSAGE);
//		}
		
		//JOptionPane.showConfirmDialog(null, "This is for JOptionPane YES_NO_CANCEL_OPTION", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//JOptionPane.showConfirmDialog(null, "This is for JOptionPane YES_NO_CANCEL_OPTION", "title", JOptionPane.OK_CANCEL_OPTION);
		
		// Return value, Yes: 0, No: 1, Cancel: 2
		//System.out.println(JOptionPane.showConfirmDialog(null, "This is for JOptionPane YES_NO_CANCEL_OPTION", "title", JOptionPane.YES_NO_CANCEL_OPTION));
		
		// Return value,  OK: 0,        Cancel: 2
		//System.out.println(JOptionPane.showConfirmDialog(null, "This is for JOptionPane YES_NO_CANCEL_OPTION", "title", JOptionPane.OK_CANCEL_OPTION));
		
//		int answer = JOptionPane.showConfirmDialog(null, "Are you new here?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//		if ( answer == 0 ) {
//			String name = JOptionPane.showInputDialog("What is your name? ");
//			System.out.println("Hello " + name);
//		} 
//		else if ( answer == 1 ) {
//			System.out.println("Take a seat.");
//		}
//		else {
//			answer = 99;
//		}
		
		String[] responses = {"I like swimming", "I don't like swimming", "I can not swim" };
		
		ImageIcon icon = new ImageIcon("icons8-face-48.png");
		JOptionPane.showOptionDialog(null, 
									"Do you like swimming?", "JOptionPane", 
									JOptionPane.YES_NO_CANCEL_OPTION, 
									JOptionPane.INFORMATION_MESSAGE, 
									icon, responses, 0);
		
	}

}

