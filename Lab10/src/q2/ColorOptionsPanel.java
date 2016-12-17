package q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Creates a panel that changes the background color based on the radio button selected
 * @author JC
 *
 */
public class ColorOptionsPanel extends JPanel {
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton[] colorButton;
    public ColorOptionsPanel() {
        // Set up heading and colors
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        // Instantiate a ButtonGroup object and a ColorListener object
        colorButton = new JRadioButton[5];
        colorButton[0] = new JRadioButton("Yellow", true);
        colorButton[1] = new JRadioButton("Cyan");
        colorButton[2] = new JRadioButton("Red");
        colorButton[3] = new JRadioButton("Green");
        colorButton[4] = new JRadioButton("Magenta");

        ColorListener listener = new ColorListener();
        ButtonGroup group = new ButtonGroup();
        
        for(int i=0; i<colorButton.length; i++){      
        group.add(colorButton[i]);
        colorButton[i].addActionListener(listener);
        colorButton[i].setBackground(Color.white);
        add(colorButton[i]);
        }
        
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // Group the radio buttons, add a ColorListener to each,
        // set the background color of each and add each to the panel.
        
    }

    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            for(int i = 0; i<5; i++) {
                if (colorButton[i].isSelected()==true) {
                    setBackground(color[i]);
                   
                }
                
                
                
            }
        }
    }
}