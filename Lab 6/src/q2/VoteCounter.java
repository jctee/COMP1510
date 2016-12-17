package q2;

import javax.swing.JFrame; 

/**
 * This is the driver class for VoteCounterPanel.java
 * @author JC
 * @version 1.0
 */
public class VoteCounter { 
    
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().add(new VoteCounterPanel()); 
        frame.pack(); 
        frame.setVisible(true); 
} 
} 