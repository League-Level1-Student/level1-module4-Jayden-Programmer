package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
	


}
	static void makeButtons() {
	JOptionPane.showMessageDialog(null, "Make Buttons");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton button = new JButton();
	JButton button1 = new JButton(); 
	frame.add(panel);
	panel.add(button);
	button.setText("joke");
	frame.pack();
	button1.setText("Punchline");
	button.addActionListener(this);
	button1.addActionListener(this); 
	
	
	}
}
