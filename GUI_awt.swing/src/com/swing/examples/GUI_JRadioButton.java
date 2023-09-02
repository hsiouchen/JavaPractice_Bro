package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class GUI_JRadioButton extends JFrame implements ActionListener {
	
	JFrame frame;
	JRadioButton radioButton1;
	JRadioButton radioButton2;
	JRadioButton radioButton3;
	ImageIcon iPizza; 
	ImageIcon iBurger; 
	ImageIcon iHotdog;
	
	JLabel label;
	
	
	GUI_JRadioButton() {
		
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		iPizza = new ImageIcon("pizza.png");
		iBurger = new ImageIcon("burger.png");
		iHotdog = new ImageIcon("hotdog.png");
		
		radioButton1 = new JRadioButton("pizza");
		radioButton2 = new JRadioButton("hamburger");
		radioButton3 = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		
		radioButton1.setIcon(iPizza);
		radioButton2.setIcon(iBurger);
		radioButton3.setIcon(iHotdog);

		radioButton1.addActionListener(this);
		radioButton2.addActionListener(this);
		radioButton3.addActionListener(this);
		
		label = new JLabel();
		label.setFont(new Font("Helvetica", Font.PLAIN, 24));	// SET font of text
		label.setBackground(Color.DARK_GRAY);
		label.setOpaque(true);								// SET display background color
		label.setForeground(Color.yellow);;

		
		frame.add(radioButton1);
		frame.add(radioButton2);
		frame.add(radioButton3);
		
		frame.add(label);
		
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == radioButton1 ) {
			label.setText("You ordered pizza.");
			//System.out.println("You ordered pizza.");
		} 
		else if ( e.getSource() == radioButton2 ) {
			label.setText("You ordered a hamburger.");
			//System.out.println("You ordered a hamburger.");
		}
		else {
			label.setText("You ordered a hotdog.");
			//System.out.println("You ordered a hotdog.");
		}		
		
	}

}

