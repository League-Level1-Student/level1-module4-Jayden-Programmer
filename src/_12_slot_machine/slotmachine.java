package _12_slot_machine;

import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
JFrame frame = new JFrame(); 
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel label;
JLabel label1; 
JLabel label2;

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel(); 
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
public slotmachine() { 
	
	try {
		label2 = createLabelImage("orange.jpg");
		label = createLabelImage("cherry.jpg"); 
		label1 = createLabelImage("lemon.jpg");
		frame.add(panel);
		panel.add(label);
		panel.add(label1); 
		panel.add(label2);  
		panel.add(button);
		button.addActionListener(this);
		button.setText("fruits"); 
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}  
}
}


