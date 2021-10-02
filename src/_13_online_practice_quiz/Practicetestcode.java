package _13_online_practice_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practicetestcode implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JLabel label = new JLabel();
	JTextField field = new JTextField(20);

	public Practicetestcode() {
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(label);
		panel.add(field);
		frame.setVisible(true);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String answer = field.getText();
			if (answer.equals("e")) {
				JOptionPane.showMessageDialog(null, "Correct answer!");

			}
			else {
			JOptionPane.showMessageDialog(null, "Incorrect answer!");
			}
		}
			if (button1 == e.getSource()) {
				JOptionPane.showMessageDialog(null, "It rhymes with d,g and b");
			}	
		}
	}

