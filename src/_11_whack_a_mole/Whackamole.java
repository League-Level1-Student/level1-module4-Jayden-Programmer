package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton molebutton;
	Date date = new Date();
	int endgame = 0; 

	public Whackamole() {
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 8));
		frame.setVisible(true);
		drawButton(new Random().nextInt(24));  
		frame.pack();
	}

	public void drawButton(int molenumber) {
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == molenumber) {
				molebutton = button;
				molebutton.setText("mole");
				
				
			}
		}
	}
	 static void speak(String words) {
		        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
		            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
		                    + words + "');\"";
		            try {
		                Runtime.getRuntime().exec( cmd ).waitFor();
		            } catch( Exception e ) {
		                e.printStackTrace();
		            }
		        } else {
		            try {
		                Runtime.getRuntime().exec( "say " + words ).waitFor();
		            } catch( Exception e ) {
		                e.printStackTrace();
		            }
		        }
		    } 
	 private void endGame(Date timeAtStart, int molesWhacked) {
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}
	 private void playSound(String fileName) { 
		    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		    sound.play();
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (molebutton == e.getSource()) {
			endgame++;
			
		}
			if (endgame == 10) {
			endGame(date,10);
		}		
			
		
		

	}
}

