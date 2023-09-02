package com.swing.examples;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_JButtonAction extends JFrame implements ActionListener {
	
	// JButton = a buton that performs an action when clicked on
	
	JButton button;
	JLabel label;
	
	GUI_JButtonAction() {	
		
		
		label = new JLabel();
		
		ImageIcon iconLabel = new ImageIcon("thumbs-up.png");
		label.setIcon(iconLabel);
		label.setBounds(125, 200, 250, 250);
		label.setVisible(false);
		
		
		
		ImageIcon icon = new ImageIcon("point.png");
		
		button = new JButton();

		button.setBounds(125, 80, 250, 100);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);	
		
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-8);
		button.setForeground(Color.blue);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			System.out.println("You hit the button");
			
			label.setVisible(true);
			
			// if like to set button can click one and then disable
			button.setEnabled(false);
		}
		
	}

}
