package com.swing.examples;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.AbstractAction;
import javax.swing.*;

public class GUI_KeyBindingsGame {
	
	// Key Bindings = 	bind an Action to a KeyStroke
	//					don't require you to click a component to give it focus
	//					all Swing components use Key Bindings
	//					increased flexibility compared to 'KeyListeners'
	//					can assign key strokes to individual Swing components
	
	// ex. game have two players they can have different Key Bindings
	
	JFrame frame;
	JLabel label;

	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	GUI_KeyBindingsGame() {
	
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBounds(100, 100, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		
		upAction    = new    UpAction();
		downAction  = new  DownAction();
		leftAction  = new  LeftAction();
		rightAction = new RightAction();
		
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");		
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getInputMap().put(KeyStroke.getKeyStroke('x'), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		
		frame.add(label);
		frame.setVisible(true);
		
	}

	
	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation( label.getX(), label.getY() - 10 );			
		}
		
	}
	
	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation( label.getX(), label.getY() + 10 );			
		}
		
	}
	
	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation( label.getX() - 10, label.getY() );			
		}
		
	}
	
	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation( label.getX() + 10, label.getY() );			
		}
		
	}
	
}
