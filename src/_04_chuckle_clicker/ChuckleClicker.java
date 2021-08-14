package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();

	void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button1);
		button.setText("joke");
		frame.pack();
		button1.setText("Punchline");
		button.addActionListener(this);
		button1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "cows go to the moovies");
		}

		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "where did the cows go. the moovies");

		}
	}
}
