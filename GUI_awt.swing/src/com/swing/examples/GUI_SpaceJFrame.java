package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUI_SpaceJFrame extends JFrame {
	
	GUI_SpaceJPanel panel;
	
	GUI_SpaceJFrame() {
		
		this.setTitle("Space enemy");		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		panel = new GUI_SpaceJPanel();
		this.add(panel);
		
		this.pack();
		this.setVisible(true);
		
	}

}
