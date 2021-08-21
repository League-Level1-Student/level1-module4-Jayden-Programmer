package _05_typing_tutor;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	

	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f)); 
		label.setHorizontalAlignment(JLabel.CENTER); 
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.pack();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub 
		System.out.println(e.getKeyChar()); 
		if (currentLetter == e.getKeyChar()) {
		System.out.println("That is correct");
		panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("That is inncorrect");
		panel.setBackground(Color.RED);
		
		
		}
		currentLetter = generateRandomLetter(); 
		label.setText("" + currentLetter);
	}	



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
