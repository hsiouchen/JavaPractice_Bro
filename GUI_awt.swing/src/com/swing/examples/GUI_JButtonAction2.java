package com.swing.examples;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_JButtonAction2  extends JFrame {

	GUI_JButtonAction2() {
		
		JButton button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(e -> System.out.println("You hit the button"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		
		this.add(button);
		
	}
}
