package com.swing.examples;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_JLabelFIndIP extends JFrame implements ActionListener {
	
	JTextField textField;
	JLabel label;
	JButton button;

	GUI_JLabelFIndIP() {
		textField = new JTextField();
		textField.setBounds(50, 50, 150, 20);
		
		label = new JLabel();
		
		label.setText("Enter Domain Name");		
		label.setHorizontalTextPosition(JLabel.CENTER);		// SET text LEFT, CENTER, RIGHT, of ImageIcon		
		label.setVerticalTextPosition(JLabel.TOP);			// SET text TOP, CENTER, BOTTOM of ImageIcon
		label.setForeground(Color.blue);					// SET font color of text
		label.setFont(new Font("Helvetica", Font.PLAIN, 16));	// SET font of text
		label.setBounds(50, 100, 300, 20);

		
		button = new JButton();
		
		button = new JButton("Find IP");
		button.setBounds(210, 50, 90, 20);
		button.addActionListener(this);
		
		this.add(button);
		this.add(textField);
		this.add(label);
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String host = textField.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			label.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}

