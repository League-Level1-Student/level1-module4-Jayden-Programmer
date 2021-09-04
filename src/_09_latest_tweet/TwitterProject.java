package _09_latest_tweet;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TwitterProject implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton button = new JButton();
	JTextField field = new JTextField(20); 
	JLabel label = new JLabel();
	public void Twitter() {
	frame.add(panel);
	panel.add(button);
	panel.add(field);
	panel.add(label);
	button.addActionListener(this);
	frame.setTitle("The Amazing Tweet Reciever"); 
	}
}