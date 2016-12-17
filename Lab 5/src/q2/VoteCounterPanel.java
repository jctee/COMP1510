package q2;

import java.awt.*; 
import java.awt.event.*; 
import javax. swing. *; 

/**
 * <p>Make buttons and counters for the votes. </p>
 * 
 * @author JC
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel 
{ 
    private int votesForJoe; 
    private JButton joe; 
    private JLabel labelJoe; 
    
    private int votesForSam; 
    private JButton sam; 
    private JLabel labelSam;

    /**
     * <p>Make the button and string labels. </p>
     */
    public VoteCounterPanel() { 
        votesForJoe = 0; 
        joe = new JButton("Vote for Joe"); 
        joe.addActionListener(new JoeButtonListener()); 
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe); 
        add(joe); 
        add(labelJoe); 
        votesForSam = 0; 
        sam = new JButton("Vote for Sam"); 
        sam.addActionListener(new SamButtonListener()); 
        labelSam = new JLabel("Votes for Sam: " + votesForSam); 
        add(sam); 
        add(labelSam);
        setPreferredSize(new Dimension(300, 100)); 
        setBackground(Color.cyan); 
        
    }
    
    private class JoeButtonListener 
    implements ActionListener { 
        
        /**
         * <p>Increase the vote counter for Joe and change the message.</p>
         */
        public void actionPerformed(ActionEvent event) { 
            votesForJoe++; 
            labelJoe.setText("Votes for Joe: " + votesForJoe); 
            } 
        } 
    
    private class SamButtonListener 
    implements ActionListener { 
        
        /**
         * <p>Increase the vote counter for sam and change the message.</p>
         */
        public void actionPerformed(ActionEvent event) { 
            votesForSam++; 
            labelSam.setText("Votes for Sam: " + votesForSam); 
            } 
        } 
    
}
