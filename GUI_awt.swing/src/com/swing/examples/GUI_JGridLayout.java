package com.swing.examples;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_JGridLayout {
	
	// Layout Manager = Defines the natural layout for components within a container
	
	// GridLayout	  =	Places components in a grid of cells.
	//					Each component takes all the available space within its cell,
	//					and each cell is the same size.	
	
	JFrame frame;
	
	GUI_JGridLayout() {
		
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		

		//frame.setLayout(new GridLayout());			// default one row and one columns
		//frame.setLayout(new GridLayout(9, 1));		// SET 9 rows and one column
		frame.setLayout(new GridLayout(3, 3));			// SET 3 rows and 3 columns (or columns)
		frame.setLayout(new GridLayout(3, 3, 10, 10));	// SET 3 rows and 3 columns and h-gap, v-gap		
		

		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		
		frame.setVisible(true);
		
	}

}
