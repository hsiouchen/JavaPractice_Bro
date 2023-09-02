package com.swing.examples;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GUI_Graphics2DPanel extends JPanel {
	
	Image image;
	
	GUI_Graphics2DPanel() {
		
		this.setPreferredSize(new Dimension(500, 500));
		this.setBackground(Color.lightGray);
	}
	
	
	public void paint(Graphics g) {
		
		image = new ImageIcon("pencils.jpg").getImage();
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, 500, 500, null);
		
		g2D.setPaint(Color.green);
		g2D.setStroke(new BasicStroke(5)); // 5 pixels
		g2D.drawLine(0,  0, 500, 500);
		g2D.setPaint(Color.cyan);
		g2D.drawRect(100, 50, 180, 120);
		
		g2D.setPaint(Color.pink);
		g2D.fillRect(150,  100,  150, 150);
		
		g2D.setPaint(Color.magenta);
		g2D.drawOval(200, 75, 150, 200);
		
		g2D.setPaint(Color.yellow);
		g2D.drawOval(0, 200, 100, 100);
		
		g2D.setPaint(Color.orange);
		g2D.fillOval(300, 200, 100, 100);
		
		g2D.setPaint(Color.blue);
		g2D.drawArc(300, 0, 150, 150, 0, 180);
		
		g2D.setPaint(Color.red);
		g2D.fillArc(0, 0, 150, 150, 0, 180);
		g2D.setPaint(Color.white);
		g2D.fillArc(0, 0, 150, 150, 180, 180);
		
		g2D.setPaint(Color.gray);
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {400, 250, 400};
		g2D.drawPolygon(xPoints, yPoints, 3);
		
		g2D.setPaint(Color.magenta);
		int[] x2Points = {20, 100, 100, 150};
		int[] y2Points = {250, 200, 350, 350};
		g2D.fillPolygon(x2Points, y2Points, 4);
		
		g2D.setPaint(Color.darkGray);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 20));
		g2D.drawString("String start from Frame's TOP LEFT corner", 0, 50);
		
		
		
		
	}

}
