package com.swing.examples;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//public class MyFrame extends JFrame {
public class GUI_JFrame {
	
	// JFrame = a GUI window to add components to
	
	GUI_JFrame() {
	
		JFrame frame = new JFrame();	// Only Creates a frame
		
		frame.setTitle("JFrame title");	// SET title of frame
		
		
		// SET the x-dimension and y-dimension of frame
		// before set frame visible SET the frame size 
		frame.setSize(420, 420);
		
		// prevent frame from being resized
		// maximize button no working anymore
		frame.setResizable(false);
		
		
		// default HIDE_ON_CLOSE, still run in the background
		// SET when hit the X button, will 
		// exit out of application
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Another setting: DO_NOTHING_ON_CLOSE
		
		
		// make frame visible (no content very small)
		frame.setVisible(true);         
		
		
		ImageIcon icon = new ImageIcon("sun.png");	// create an imageIcon				
		frame.setIconImage(icon.getImage());		// change icon of frame
		
		
		// frame.getContentPane().setBackground(Color.gray);		// change color of background
		// frame.getContentPane().setBackground(new Color(235, 235, 245));		// change color of background
		frame.getContentPane().setBackground(new Color(0xb5ac96));		// change color of background
		
	}
	
}

