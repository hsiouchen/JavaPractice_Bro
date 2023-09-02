package com.swing.examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_JProgressBarTimer {
	final static int interval = 100;
	final static int barMax = 20;
	int counter;
	JLabel label;
	JProgressBar pb;
	Timer timer;
	JButton button;

	public GUI_JProgressBarTimer() {
		JFrame frame = new JFrame("Timer Progress Bar");
		button = new JButton("Start");
		button.addActionListener(new ButtonListener());

		pb = new JProgressBar(0, barMax);
		pb.setValue(0);
		pb.setStringPainted(true);

		label = new JLabel("Start to download");

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(pb);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(panel, BorderLayout.NORTH);
		panel1.add(label, BorderLayout.CENTER);
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		frame.setContentPane(panel1);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a timer.
		timer = new Timer(interval, new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				if (counter == barMax) {
					Toolkit.getDefaultToolkit().beep();
					timer.stop();
					button.setEnabled(true);
					pb.setValue(0);
					String str = "<html>" + "<font color=\"#FF0000\">" + "<b>" + "Downloading completed." + "</b>"
							+ "</font>" + "</html>";
					label.setText(str);
				}
				counter++;
				pb.setValue(counter);
			}
		});
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			button.setEnabled(false);
			counter = 0;
			String str = "<html>" + "<font color=\"#008000\">" + "<b>" + "Downloading is in process......." + "</b>"
					+ "</font>" + "</html>";
			label.setText(str);
			timer.start();
		}
	}

}
