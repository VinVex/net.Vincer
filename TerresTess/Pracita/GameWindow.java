

import java.awt.*;
import javax.swing.*; 

public class GameWindow extends JFrame {
	
	private static int WIDTH = 800;
	private static int HEIGHT = 600;
	
	public static void windowStart(){
		
		
		
		JFrame guiWindow = new JFrame();	
		guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiWindow.setTitle("GuessDaNumber");
		guiWindow.setSize(WIDTH, HEIGHT);

		Box theBox = Box.createHorizontalBox();
		
		JButton button1= new JButton("Button 1");
		
		
		theBox.add(button1);
		button1.
		
		guiWindow.add(theBox);
		guiWindow.setVisible(true);
	}
	
	
	
}
