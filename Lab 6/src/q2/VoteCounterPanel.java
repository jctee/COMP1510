package q2;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing. *; 

/**
 * Creates a voting system and displays if Joe or Sam is winning.
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
    private JLabel labelWinning;
    
    /**
     * Create buttons, labels, and counts votes
     */
    public VoteCounterPanel() 
    { 
        
        votesForJoe = 0; 
        votesForSam = 0; 

        joe = new JButton("Vote for Joe"); 
        joe.addActionListener(new JoeButtonListener());
        sam = new JButton("Vote for Sam"); 
        sam.addActionListener(new SamButtonListener()); 
    
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe); 
        add(joe); 
        add(labelJoe); 
        
        labelSam = new JLabel("Votes for Sam: " + votesForSam); 
        add(sam); 
        add(labelSam); 
        
        labelWinning = new JLabel("It's a tie.");
        add(labelWinning);
    
        setPreferredSize(new Dimension(250, 100)); 
        setBackground(Color.cyan);
    } 
        
        private class JoeButtonListener implements ActionListener 
        { 
            public void actionPerformed(ActionEvent event) 
            { 
                votesForJoe++; 
                labelJoe.setText("Votes for Joe: " + votesForJoe);
                if (votesForJoe > votesForSam) {
                    labelWinning.setText("Joe is winning!");
                } else if (votesForJoe < votesForSam) {
                    labelWinning.setText("Sam is winning!");
                } else {
                    labelWinning.setText("It's a tie.");
                        }
             }
         }
        
        private class SamButtonListener implements ActionListener 
        { 
            public void actionPerformed(ActionEvent event) 
            { 
                votesForSam++; 
                labelSam.setText("Votes for Sam: " + votesForSam); 
                if (votesForJoe > votesForSam) {
                    labelWinning.setText("Joe is winning!");
                } else if (votesForJoe < votesForSam) {
                    labelWinning.setText("Sam is winning!");
                } else {
                    labelWinning.setText("It's a tie.");
                        }
             }
         }
} 
 

