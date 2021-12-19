import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitController extends Model implements ActionListener {
   private JButton Exit;
   
   public ExitController(JButton button) {
	   Exit = button;
   } 

  @Override
  public void actionPerformed(ActionEvent e) {  //exiting the game on the click
	  System.exit(0);
	
  }
   
}
