package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_MouseListener extends JFrame implements MouseListener {
	
	JLabel label;
	ImageIcon smile;
	ImageIcon grin;
	ImageIcon cool;
	ImageIcon angry;
	
	
	GUI_MouseListener() {
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);		
		this.setLayout(null);
		
		
		label = new JLabel();		
		label.setBounds(0, 0, 128, 128);
		label.setBackground(Color.darkGray);
		label.setOpaque(true);
		
		
		//label.addMouseListener(this);
		this.addMouseListener(this);
		
		
		this.add(label);
		
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked 
		// (pressed and released) on a component
		System.out.println("Clicked the mouse");
		//label.setBackground(Color.red);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("Pressed the mouse");
		label.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("Released the mouse");
		label.setBackground(Color.green);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("Entered the mouse");
		label.setBackground(Color.blue);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("Exited the mouse");
		label.setBackground(Color.magenta);
		
	}

}
