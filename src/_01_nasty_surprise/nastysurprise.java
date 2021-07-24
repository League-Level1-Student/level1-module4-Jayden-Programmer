package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	
	

	public void setup() { 
	    
	    	
	    	
	    	
	    	JFrame frame = new JFrame(); 
	    	JPanel panel = new JPanel(); 
	    	
	    	trick.setText("Trick");
	    	treat.setText("Treat");
	    	
	    	trick.addActionListener(this);
	    	treat.addActionListener(this);
	    	
	    	
	    	
	    	
	     
	        frame.setVisible(true);
	        frame.add(panel);
	        panel.add(treat);
	        panel.add(trick);
	        frame.setTitle("Trick or Treat"); 
	        frame.pack();
	        
	        
	     }
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == trick) {
			String Url = "https://i0.wp.com/bestlifeonline.com/wp-content/uploads/2019/12/shutterstock_1290320698.jpg?resize=1024%2C683&ssl=1";
			showPictureFromTheInternet(Url); 
		}
		if (e.getSource() == treat) {
			String Url = "https://theapopkavoice.com/wp-content/uploads/2020/08/Rent-due.jpg";
			showPictureFromTheInternet(Url);
		}
	}
}
