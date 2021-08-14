package _05_typing_tutor;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	currentLetter =  generateRandomLetter(); 
	

	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
		label.setText(currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(generateRandomLetter);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.pack();
	}
}
