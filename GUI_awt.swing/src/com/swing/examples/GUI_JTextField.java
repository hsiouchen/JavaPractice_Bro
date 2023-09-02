package com.swing.examples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI_JTextField extends JFrame implements ActionListener {
	
	// JTextField = 	A GUI textbox component that can be used to add, set or get text
	
	JFrame frame = new JFrame();
	JButton button;
	JTextField textField;
	
	GUI_JTextField() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 30));
		textField.setForeground(Color.green);
		textField.setBackground(Color.darkGray);
		textField.setCaretColor(Color.white);
		textField.setText("username");
		
		
		this.add(textField);
		this.add(button);
		this.pack();				// Adjust the size to fit the components
		this.setVisible(true); 		
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
			frame.dispose();
			textField.setEditable(false);
			button.setEnabled(false);
			System.out.println("Hello " + textField.getText());
		
		}
		
	}

}


