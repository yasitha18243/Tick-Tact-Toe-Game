import javax.swing.JButton;

public class Model {
    
	static String currentPlayer = "1";
	
	public static void toggelPlayer() {  //method to toggle the player
		if(currentPlayer == "1") {
			currentPlayer = "2";
			
		}
		else {
			currentPlayer = "1";
		}
		
		
	}
	
	public static boolean Allfilled(JButton [][] board) { //method to check whether board is filled all
		int i, j = 0;
		 for(i = 0; i < board.length; i++) {
			 for(j = 0; j < board[0].length; j++) {
				if(board[i][j].getText().equals("")) {
					return false;
				} 
				 
			 }
		 }
		 return true;
	
	}
	
	public static boolean isWinner(JButton [][] board) {  //method to check whether is there a winner
		if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
			return true;
		}
		else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			return true;
		}
		else {
			return false;
		}
	}
}
