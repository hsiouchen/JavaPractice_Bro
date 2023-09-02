package com.swing.examples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI_SpaceJPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;

	Image spacename;
	Image bgImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	GUI_SpaceJPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		spacename = new ImageIcon("spaceman.png").getImage();
		bgImage = new ImageIcon("sky.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();
		
	}

	public void paint(Graphics g) {
		
		super.paint(g);			// paint background
		
		Graphics2D g2D = (Graphics2D) g;
		g.drawImage(bgImage, 0, 0, bgImage.getWidth(null), bgImage.getHeight(null), null);
		g.drawImage(spacename, x, y, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if ( x >= PANEL_WIDTH-spacename.getWidth(null)  || x < 0) {
			xVelocity = xVelocity * -1;
		}		
		x = x + xVelocity;
		
		if ( y >= PANEL_HEIGHT-spacename.getHeight(null)  || y < 0) {
			yVelocity = yVelocity * -1;
		}		
		y = y + yVelocity;
		
		repaint();
		
	}

}
