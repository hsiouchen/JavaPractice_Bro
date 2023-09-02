package com.swing.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_KeyListenerRocket extends JFrame implements KeyListener {

	JLabel label;
	ImageIcon icon;

	GUI_KeyListenerRocket() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		icon = new ImageIcon("rocket.png");

		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		label.setIcon(icon);
		this.getContentPane().setBackground(Color.black);

		this.addKeyListener(this);

		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Invoked when a key is typed. Uses KeyChar, char output

		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX() - 5, label.getY());
			break;
		case 'd':
			label.setLocation(label.getX() + 5, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY() - 5);
			break;
		case 'x':
			label.setLocation(label.getX(), label.getY() + 5);
			break;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Invoked when a physical key is pressed down. Uses KeyCode, int
		// output

		switch (e.getKeyCode()) {
		case 100:
		case  37:
			label.setLocation(label.getX() - 5, label.getY());
			break;
		case 102:
		case 39:
			label.setLocation(label.getX() + 5, label.getY());
			break;
		case 104:
		case 38:
			label.setLocation(label.getX(), label.getY() - 5);
			break;
		case 98:
		case 40:
			label.setLocation(label.getX(), label.getY() + 5);
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a button is released

		System.out.println("You released key char: " + e.getKeyChar()); // You released key char: a
		System.out.println("You released key char: " + e.getKeyCode()); // You released key char: 65
	}

}
