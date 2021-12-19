import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetController extends Model implements ActionListener {
      
	 private static JButton reset;
	 private static JButton [][] buttonBoard;
	 
	 public ResetController(JButton button, JButton [][] board) {
		 reset = button;
		 buttonBoard = board;
	 }
	 @Override
	 public void actionPerformed(ActionEvent e) { //resetting the board on the click
		if(e.getSource() == reset) { 
		 for(int i = 0; i < 3; i++) {
			 for(int j = 0; j < 3; j++) {
				 buttonBoard[i][j].setText("");
				 currentPlayer = "1";
			 }
		 }
		}
	 }
}
