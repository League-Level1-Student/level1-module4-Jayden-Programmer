package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(20);
	JLabel label = new JLabel();
	JTextField field1 = new JTextField(20);

	public PigLatin() {
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(field1);
		panel.add(label);
		frame.setVisible(true);
		button.addActionListener(this);
		button.setText("Transalate");
		frame.setTitle("Jayden's Pig Latin Transalator"); 
		frame.pack();

	}

		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input = field.getText(); 
			input = PigLatinTranslator.translate(input);
			field1.setText(input); 
			
			
		}
}
