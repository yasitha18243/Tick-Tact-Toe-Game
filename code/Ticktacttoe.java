import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.Timer; //for timer

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticktacttoe extends JPanel {
    JButton [][] buttonBoard;       //button array for the ticktaktoe
    JButton reset;                  //reset button
    JButton exit;                   //exit button
    JPanel gridPanel;               //panel to store the grid
    JPanel panel;                   //panel to store the exit, reset buttons
    
    public Ticktacttoe(){
    	super(new BorderLayout());
    	
    	//setting the grid panel
        gridPanel = new JPanel();               
        gridPanel.setLayout(new GridLayout(3, 3));
        gridPanel.setPreferredSize(new Dimension(300, 300));
    	
    	buttonBoard = new JButton [3][3];
    	BoardInitializer();             //initializing the button board
    	
    	//setting the panel to place exit and reset buttons
    	panel = new JPanel();
        panel.setPreferredSize(new Dimension(50, 50));
        
        //placing reset button
    	reset = new JButton("Reset");
    	reset.addActionListener(new ResetController(reset, buttonBoard)); 
    	panel.add(reset, BorderLayout.WEST);
    	
    	//placing exit button
    	exit = new JButton("Exit");
    	exit.addActionListener(new ExitController(exit));
    	panel.add(exit, BorderLayout.EAST);
    	
    	//placing the created panel on the borderlayout
    	add(gridPanel, BorderLayout.NORTH);
    	add(panel, BorderLayout.SOUTH);
    }
    
    public void BoardInitializer() {          //this method is to initialize the button board
    	for(int i = 0; i < 3; i++) {
    		for(int j = 0; j < 3; j++) {
    			JButton button = new JButton();
    			buttonBoard[i][j] = button; 
    			button.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 50));
    	        button.addActionListener((new BoardController(button, buttonBoard)));
		        button.setPreferredSize(new Dimension(50, 50));
		       
		        gridPanel.add(button);
    		}
    	}
    }
	public static void main(String [] args) { 
		
		JFrame frame = new JFrame("TAK TIK TOE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Ticktacttoe();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}

     
}
