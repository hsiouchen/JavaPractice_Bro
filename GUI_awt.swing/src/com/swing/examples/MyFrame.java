package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLayout(null);
		
		this.getContentPane().setBackground(Color.black);
		this.pack();
		this.setVisible(true);
	}

}
