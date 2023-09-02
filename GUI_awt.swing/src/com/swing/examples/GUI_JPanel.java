package com.swing.examples;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_JPanel {
	
	// JPanel = a GUI component that functions as a container to hold other components

	GUI_JPanel() {	
		
		ImageIcon icon = new ImageIcon("thumb-up.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");		
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		

		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setBackground(Color.red);
		
		//label.setVerticalAlignment(JLabel.TOP);
		//label.setHorizontalAlignment(JLabel.LEFT);
		//redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setBackground(Color.blue);
		
		//label.setForeground(Color.white);
		//label.setVerticalAlignment(JLabel.BOTTOM);
		//label.setHorizontalAlignment(JLabel.LEFT);
		//bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setBackground(Color.green);
		
		//label.setVerticalAlignment(JLabel.BOTTOM);
		//label.setHorizontalAlignment(JLabel.RIGHT);
		//greenPanel.setLayout(new BorderLayout());
		
		label.setBounds(50, 0, 150, 150);
		
		greenPanel.setLayout(null);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true); 
		
		//redPanel.add(label);
		//bluePanel.add(label);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true); 
		
		
	}
}
