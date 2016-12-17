package q2;

import javax.swing.JFrame; 

/**
 * <p>Opens the window that . </p>
 * 
 * @author JC
 * @version 1.0
 */
public class VoteCounter { 
  
    /**
     * <p>This is the main method. </p>
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