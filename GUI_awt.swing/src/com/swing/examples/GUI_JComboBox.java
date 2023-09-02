package com.swing.examples;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GUI_JComboBox extends JFrame implements ActionListener {
	
	// JComboBox = 	A component that combines a button or editable field and a drop-down list
	
	JFrame frame = new JFrame();
	
	// Using Wrap Classes
	JComboBox<String> comboBox;
	JComboBox<Integer> comboBoxInt;
	
	
	GUI_JComboBox() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
				
		
		String[] animals = {"dog", "cat", "bird"};
		comboBox = new JComboBox<String>(animals);
		comboBox.addActionListener(this);		
		
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("pig", 0);
		//comboBox.setSelectedIndex(0);
		//comboBox.removeItem("horse");
		//comboBox.removeItemAt(0);
		comboBox.removeAllItems();
		
		
		Integer[] numbers = {1, 2, 3};
		comboBoxInt = new JComboBox<Integer>(numbers);
		comboBoxInt.setVisible(true);
		
		
		this.add(comboBox);
		this.add(comboBoxInt);
		
		this.pack();
		this.setVisible(true); 	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == comboBox ) {
			//System.out.println("You selected " + comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
		
	}

}
