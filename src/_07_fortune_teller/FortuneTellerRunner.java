package _07_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
      	 SwingUtilities.invokeLater(new FortuneTeller());
      	 begin(); 
       }
    
    static void begin() {
    JOptionPane.showMessageDialog(null, "Can't give a hint I don't know where the location is myself.");
    
    
    }
}
