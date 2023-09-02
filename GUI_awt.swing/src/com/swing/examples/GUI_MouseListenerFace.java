package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_MouseListenerFace extends JFrame implements MouseListener {

	JLabel label;
	ImageIcon smile;
	ImageIcon grin;
	ImageIcon cool;
	ImageIcon angry;
	ImageIcon confused;

	GUI_MouseListenerFace() {
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		this.setLayout(new FlowLayout());

		smile = new ImageIcon("face-smile.png");
		grin = new ImageIcon("face-grin.png");
		cool = new ImageIcon("face-cool.png");
		angry = new ImageIcon("face-angry.png");
		confused = new ImageIcon("face-confused.png");
		
		label = new JLabel();		
		label.setIcon(smile);
		label.addMouseListener(this);
		
		
		this.add(label);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked
		// (pressed and released) on a component
		label.setIcon(confused);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		label.setIcon(angry);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		label.setIcon(grin);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		label.setIcon(cool);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		label.setIcon(smile);

	}
}
