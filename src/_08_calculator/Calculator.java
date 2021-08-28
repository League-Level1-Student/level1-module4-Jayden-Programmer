package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton div = new JButton();
	JButton mul = new JButton();
	JTextField input = new JTextField(); 
	JTextField input1 = new JTextField();
	public Calculator() {
	frame.add(panel);
	panel.add(add);
	panel.add(sub); 
	panel.add(div); 
	panel.add(mul);
	frame.setVisible(true); 
	frame.pack();
	add.setText("add");
	sub.setText("sub");
	div.setText("div");
	mul.setText("mul"); //JLabel is for the answer
	
	}
}







	
	
	
	
