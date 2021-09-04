package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton div = new JButton();
	JButton mul = new JButton();
	JLabel label = new JLabel();
	JTextField input = new JTextField(20);
	JTextField input1 = new JTextField(20);

	public Calculator() {
		frame.add(panel);
		panel.add(add);
		panel.add(sub);
		panel.add(div);
		panel.add(mul);
		panel.add(input1);
		panel.add(input);
		panel.add(label);
		frame.setVisible(true);    
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		add.setText("add");
		sub.setText("sub");
		div.setText("div");
		mul.setText("mul"); // JLabel is for the answer
		frame.pack();
	}

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String number1 = input.getText();
		int number = Integer.parseInt(number1);
		String number2 = input.getText();
		int Snumber = Integer.parseInt(number2);
		int answer = 0;

		if (e.getSource() == add) {
			answer = add(number, Snumber);
		}
		if (e.getSource() == sub) {
			answer = add(number, Snumber);
		}
		if (e.getSource() == mul) {
			answer = add(number, Snumber);
		}
		if (e.getSource() == div) {
			answer = add(number, Snumber);

		}

		label.setText("" + answer);
		frame.pack();
	}
}
