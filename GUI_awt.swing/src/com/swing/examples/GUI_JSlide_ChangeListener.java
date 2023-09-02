package com.swing.examples;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI_JSlide_ChangeListener implements ChangeListener {
	
	// JSlide =	GUI component that lets user enter a value
	//			by using an adjustable sliding knob on a track

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	GUI_JSlide_ChangeListener() {
		
		frame = new JFrame("Slide with ChangeListener");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);
		
		frame.setSize(420, 420);
		
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		slider.setOrientation(SwingConstants.VERTICAL);
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		
		slider.addChangeListener(this);
		
		
		label.setText("°C = ");
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {

		if (e.getSource() == slider) {
			label.setText("°C = " + slider.getValue());
		}
		
	}
}

