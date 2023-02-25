package dIALOGBOX;
import javax.swing.JOptionPane;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;

	      // Get the user's name.
	      name = JOptionPane.showInputDialog("What is your name? ");

	      // Display message
	      JOptionPane.showMessageDialog(null, "Hello " + name);
	   }
	}


