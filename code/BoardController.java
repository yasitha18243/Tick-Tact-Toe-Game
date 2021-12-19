import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BoardController extends Model implements ActionListener{
	
	private static JButton [][] buttonBoard = new JButton [3][3] ;
	private  JButton button;
 

	
	public BoardController(JButton boardbutton, JButton [][] board) {
		
		button = boardbutton;
		buttonBoard = board;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	  
	  if(e.getSource() == button) {	  
		if((button.getText().equals("")) && (isWinner(buttonBoard) == false)){          //checking the condition to update the board
		
			 button.setText(currentPlayer);  //updating the board
			 
			 
			 if(isWinner(buttonBoard) == true) {   //if the currentplayer wins then this result message will appear in another window
				 JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won!" );
			 }
			 
			 else if(isWinner(buttonBoard) == false && Allfilled(buttonBoard) == true) {  //if the match is drawn this message will appear
				 JOptionPane.showMessageDialog(null, "Game Over! Match has drawn");
			 }
			 else {   //if nothing happened player will be toggled.
			  toggelPlayer();
			 }
			 
			 
		
	    }
	  }
	  
			
		
		
	}

}
