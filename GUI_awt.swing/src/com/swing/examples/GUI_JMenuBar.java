package com.swing.examples;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI_JMenuBar extends JFrame implements ActionListener {

	JMenuBar menuBar;
	
	JMenu menuFile;
	JMenu menuEdit;
	JMenu menuHelp;
	
	JMenuItem itemLoad;
	JMenuItem itemSave;
	JMenuItem itemExit;
	
	ImageIcon iconLoad;
	ImageIcon iconSave;
	ImageIcon iconExit;
	
	GUI_JMenuBar() {
		
		this.setTitle("JMenuBar Demo");	// SET title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		this.setLayout(new FlowLayout());
		
		iconLoad = new ImageIcon("load.png");
		iconSave = new ImageIcon("save.png");
		iconExit = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		
		menuFile = new JMenu("File");
		menuEdit = new JMenu("Edit");
		menuHelp = new JMenu("Help");
		
		itemLoad = new JMenuItem("Load");
		itemSave = new JMenuItem("Save");
		itemExit = new JMenuItem("Exit");
		
		itemLoad.addActionListener(this);
		itemSave.addActionListener(this);
		itemExit.addActionListener(this);
		
		// Short_Cut ----------------------
		menuFile.setMnemonic(KeyEvent.VK_F); 	// Alt + f for file
		menuEdit.setMnemonic(KeyEvent.VK_E); 	// Alt + e for edit
		menuHelp.setMnemonic(KeyEvent.VK_H); 	// Alt + h for help
		
		itemLoad.setMnemonic(KeyEvent.VK_L); 	// l for load
		itemSave.setMnemonic(KeyEvent.VK_S);	// s for save
		itemExit.setMnemonic(KeyEvent.VK_X); 	// x for exit
		// Short_Cut ----------------------
		
		itemLoad.setIcon(iconLoad);
		itemSave.setIcon(iconSave);
		itemExit.setIcon(iconExit);
		
		
		
		menuFile.add(itemLoad);
		menuFile.add(itemSave);
		menuFile.add(itemExit);

		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuHelp);

		this.setJMenuBar(menuBar);
		this.setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == itemLoad) {
			System.out.println("\"Loaded\" a file");
		}
		if (e.getSource() == itemSave) {
			System.out.println("\"Saved\" a file");
		}
		if (e.getSource() == itemExit) {
			System.exit(0);
		}
		
	}

}
