package com.swing.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class GUI_JFileChooser extends JFrame implements ActionListener {
	
	// JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving)
	
	JButton button;
	
	GUI_JFileChooser() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		
		this.add(button);
		this.pack();
		this.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			
			JFileChooser fileChooser = new JFileChooser();
			//System.out.println(fileChooser.showOpenDialog(null)); // return value: 0 or 1
			
			//fileChooser.setCurrentDirectory(new File("."));
			fileChooser.setCurrentDirectory(new File("/home/code/Desktop"));
			
			int response = fileChooser.showOpenDialog(null);		// select file to open
			//int response = fileChooser.showSaveDialog(null);		// select file to save
			
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);		// /home/code/Desktop/showOpenDialog.txt
			}
			
		}
		
	}

}
