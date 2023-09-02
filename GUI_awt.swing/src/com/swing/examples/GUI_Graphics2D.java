package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class GUI_Graphics2D extends JFrame {
	
	GUI_Graphics2DPanel myPanel;
	
	GUI_Graphics2D() {
		
		myPanel = new GUI_Graphics2DPanel();
		
		this.setTitle("GUI_Graphics2D");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		

		this.add(myPanel);

		this.pack();
		this.setVisible(true);
		
	}


}
