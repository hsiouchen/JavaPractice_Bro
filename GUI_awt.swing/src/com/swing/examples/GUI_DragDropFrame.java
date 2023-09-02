package com.swing.examples;

import javax.swing.JFrame;

public class GUI_DragDropFrame extends JFrame {
	
	GUI_DragDropPanel dragPanel = new GUI_DragDropPanel();
	
	GUI_DragDropFrame() {	
		
		this.setTitle("Drag & Drop demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		
		this.add(dragPanel);
		this.setVisible(true);
	}


}
