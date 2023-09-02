package com.swing.examples;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class GUI_JCheckBox extends JFrame implements ActionListener {
	
	// JCheckBox = 	A GUI component that can be selected or unselected

	JFrame frame = new JFrame();
	JButton button;
	JCheckBox checkBox;
	ImageIcon iconX;
	ImageIcon iconCheck;
	
	GUI_JCheckBox() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		
		iconX = new ImageIcon("icons8-x-48.png");
		iconCheck = new ImageIcon("icons8-check-48.png");
		
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		
		checkBox = new JCheckBox();
		checkBox.setFocusable(false);
		checkBox.setText("You are a new student.");
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		checkBox.setIcon(iconX);
		checkBox.setSelectedIcon(iconCheck);		
		
		
		this.add(checkBox);
		this.add(button);
		this.pack();
		this.setVisible(true); 		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {			
			
			//System.out.println(checkBox.isSelected());
			
			if (checkBox.isSelected()) {
				
				System.out.println("Welcome!");
			}
			else {
				System.out.println("You are not a new student!");
			}
			
			frame.dispose();
			button.setEnabled(false);
			
		}
		
	}

}

