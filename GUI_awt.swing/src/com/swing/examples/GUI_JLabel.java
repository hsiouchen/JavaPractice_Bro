package com.swing.examples;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI_JLabel {
	
	// JLabel = a GUI display area for a string of text, an image, or both
	
	JFrame frame;
	JLabel label;	
	ImageIcon image;
	
	GUI_JLabel() {
		
		label = new JLabel();
		image = new ImageIcon("digital-nomad .png");
		
		label.setIcon(image);
		
		
		label.setText("Hi, do you even code?");
						
		label.setHorizontalTextPosition(JLabel.CENTER);		// SET text LEFT, CENTER, RIGHT, of ImageIcon
		
		label.setVerticalTextPosition(JLabel.TOP);			// SET text TOP, CENTER, BOTTOM of ImageIcon

		label.setForeground(Color.CYAN);					// SET font color of text

		label.setFont(new Font("MV Boli", Font.PLAIN, 24));	// SET font of text
		
		label.setIconTextGap(50);							// SET gap of text to ImageIcon	
		
		label.setBackground(Color.LIGHT_GRAY);				// SET background color
		
		label.setOpaque(true);								// SET display background color
		
		Border border = BorderFactory.createLineBorder(Color.orange, 3);
		label.setBorder(border);
		
		// SET x,y position within frame at well as dimensions and set the Label's display size
		// label.setLayout( ) value have to be null
		//label.setBounds(100, 100, 250, 250);	
		
		
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//frame.setLayout(null);
		
		frame.add(label);
		
		// if have SET JFrame.pack() then no necessary to set the x, y dimension
		//frame.setSize(500, 500);		
		
		// Will resize the Frame to fix the layout's preferred size 
		// no need to set Layout() and setSize()
		// could try to change the text font size to 60
		// * add all of components
		frame.pack();
		
		frame.setVisible(true);
		
	}

}
