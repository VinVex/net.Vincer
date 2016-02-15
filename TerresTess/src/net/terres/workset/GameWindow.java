package net.terres.workset;

import java.awt.*;
import javax.swing.*; 

public class GameWindow {
	static void createWindow(){
		JFrame mainWindow = new JFrame("GuessDaNumber");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(640, 480);
		mainWindow.setMinimumSize(new Dimension(640, 480));
		JPanel panel = new JPanel();
		
		JLabel textLabel = new JLabel("I'm a label in the window");
		


		
		JButton button1 = new JButton("Greater");
		JButton button2 = new JButton("Hit");
		JButton button3 = new JButton("Smaller");
		
		
		
		mainWindow.add(panel);
		mainWindow.add(textLabel);
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		 


		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}
	
}
