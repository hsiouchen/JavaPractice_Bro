package com.swing.examples;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class GUI_JProgressBar {
	
	JFrame frame;
	JProgressBar bar;
	JProgressBar barDown;
	
	int counter = 0;
	
	
	GUI_JProgressBar() {
		
		frame = new JFrame("ProgressBar Demo");
		
		bar = new JProgressBar();
		
		bar.setValue(0);
		bar.setBounds(0, 0, 500, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.RED);
		bar.setBackground(Color.DARK_GRAY);					
		bar.setVisible(true);
		
		
//		barDown = new JProgressBar(0, 500);
//
//		barDown.setValue(0);
//		barDown.setBounds(0, 0, 500, 50);
//		barDown.setStringPainted(true);	
//		barDown.setFont(new Font("MV Boli", Font.BOLD, 25));
//		barDown.setForeground(Color.black));
//		barDown.setBackground(Color.red;				
//		barDown.setVisible(true);	
		
		
		frame.add(bar);
		//frame.add(barDown);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();		
		//countDown();
	}
	
	public void fill() {
		
		int counter = 0;
		
		while(counter<=100) {
			
			bar.setValue(counter);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}	
		bar.setString("Done! :)");
		
	}
	
	public void countDown() {
		
		int counter = 500;
		
		while(counter>0) {
			
			barDown.setValue(counter);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter-=1;
		}	
		barDown.setString("Done! :)");
		
	}



}

