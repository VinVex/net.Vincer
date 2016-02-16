package net.terres.workset;

import java.awt.*;
import javax.swing.*; 

public class GameWindow {
	
	private JFrame mainframe;
	private JLabel headerLabel;
	private JLabel footerLabel;
	private JButton butLower;
	private JButton butHigher;
	private JButton butHit;
	private JPanel controlPanel;
	
	public void GameLayout(){
		prepareGUI();
	}
	
	private void prepareGUI(){
		mainframe = new JFrame("GuessDaNumber");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setLayout(new GridLayout(3, 1));
		
		mainframe.setSize(640, 480);
		mainframe.setMinimumSize(new Dimension(640, 480));
		
		headerLabel = new JLabel("Header",JLabel.CENTER);
		footerLabel = new JLabel("Footer",JLabel.CENTER);
		butHigher = new JButton("Greather");
		
		mainframe.add(headerLabel);
		//mainframe.add(footerLabel);
		//mainframe.add(butHigher);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
		
		
	}
	   void showFlowLayoutDemo(){
		      headerLabel.setText("Layout in action: FlowLayout");      

		      JPanel panel = new JPanel();
		      panel.setBackground(Color.darkGray);
		      panel.setSize(200,200);
		      FlowLayout layout = new FlowLayout();
		      layout.setHgap(10);              
		      layout.setVgap(10);
		      panel.setLayout(layout);        
		      panel.add(new JButton("OK"));
		      panel.add(new JButton("Cancel"));       

		      mainframe.setVisible(true);  
		   }

	
	
}
