import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GUI_DragDropPanel extends JPanel {

	ImageIcon image;
	
//	final int WIDTH;
//	final int HEIGHT;
	
	Point imageCorner;
	Point prevPoint;
	
	
	GUI_DragDropPanel() {
		
		image = new ImageIcon("face-smile.png");
//		WIDTH = image.getIconWidth();
//		HEIGHT = image.getIconHeight();
		
		imageCorner = new Point(0, 0);
		
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
		
	}
	
	private class ClickListener extends MouseAdapter {

		public void mousePressed(MouseEvent e) {			
			prevPoint = e.getPoint();
			//System.out.println("prevPoint 1:  " +prevPoint);
		}
		
	}
	
	private class DragListener extends MouseMotionAdapter {
		
		public void mouseDragged(MouseEvent e) {
			
			Point currentPoint = e.getPoint();
			
			//System.out.println("currentPoint: " + currentPoint);
			
			imageCorner.translate(
					(int)( currentPoint.getX() - prevPoint.getX() ), 
					(int)( currentPoint.getY() - prevPoint.getY() )
			);
			
			prevPoint = currentPoint;
			//System.out.println("prevPoint 2:  " +prevPoint);
			repaint();
			
		}
		
	}
	
	
}
