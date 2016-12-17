package q1;

import javax.swing.*;

/**
 * driver class for TelephonePanel.java
 * 
 * @author JC
 * @version 1.0
 */
public class Telephone
{   
    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args)
    {
    
    JFrame frame = new JFrame("Telephone");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TelephonePanel());
    frame.pack();
    frame.setVisible(true);
    }
}
    