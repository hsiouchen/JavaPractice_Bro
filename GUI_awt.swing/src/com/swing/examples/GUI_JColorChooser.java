package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_JColorChooser extends JFrame implements ActionListener {

	JButton button;
	JLabel  label;
	
	GUI_JColorChooser() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		label = new JLabel();
		
		button.addActionListener(this);
		
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText(" GUI_JColorChooser ");
		label.setFont(new Font("cursive", Font.PLAIN, 60));
		
		
		
		this.add(label);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {

			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "GUI_JColorChooser", Color.black);
			
			//System.out.println(color);	// java.awt.Color[r=255,g=255,b=51]
			label.setForeground(color);
			button.setBackground(color);
			
		}
		
	}
	
}
