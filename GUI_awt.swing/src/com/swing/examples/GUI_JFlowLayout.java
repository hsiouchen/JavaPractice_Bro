package com.swing.examples;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_JFlowLayout {
	
	// Layout Manager = Defines the natural layout for components within a container
	
	// FlowLayout	  =	Places components in a row, sized at their preferred size.
	//					If the horizontal space in the container is too small,
	//					the FlowLayout class uses the next available row.
	
	JFrame frame;
	JPanel panel;
	
	GUI_JFlowLayout() {
		
		frame = new JFrame();		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//frame.setLayout(new FlowLayout());		// SET FlowLayout, default stick from TOP CENTER
		//frame.setLayout(new FlowLayout(FlowLayout.LEADING)); 			// Stick from TOP LEFT corner
		//frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); 		// Stick from TOP RIGHT corner
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 	// Stick from CENTER between h-gap and hv
		
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(150, 250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		//JButton button1 = new JButton();
		//panel.add(button1);
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));

		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
