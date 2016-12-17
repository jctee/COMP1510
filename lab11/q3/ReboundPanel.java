package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.io.File.separator;

import static java.lang.Math.abs;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Represents the primary panel for the Rebound program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class ReboundPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 1009240907993547231L;

    /** Initial velocity increment. */
    private static final int DELTA =10;

    /** Image to rebound off the sides of the panel. */
    private static final ImageIcon IMAGE =
              new ImageIcon("/Users/JC/Documents/workspace/lab11/q3" + separator + "happyFace.gif");
    /** Image to rebound off the sides of the panel. */
    private static final ImageIcon IMAGE2 =
            new ImageIcon("/Users/JC/Documents/workspace/lab11/q3" + separator + "happyFace.gif");

    /** Timer to used for animation sequence. */
    private Timer timer;

    /** X location of image. */
    private int x;

    /** Y location of image. */
    private int y;
    
    /** X location of image2. */
    private int x2;

    /** Y location of image2. */
    private int y2;
    
    /** X2 distance to move image each timer increment. */
    private int moveX2 = 11;

    /** Y2 distance to move image each timer increment. */
    private int moveY2 = 12;

    /** X distance to move image each timer increment. */
    private int moveX = 3;

    /** Y distance to move image each timer increment. */
    private int moveY = 3;
    
    private int centerX;
    private int centerY;
    
    private int centerX2;
    private int centerY2;
    /**
    * Sets up the panel, including the timer for the animation.
    */
    public ReboundPanel() {
        final int width = 600;
        final int height = 200;
        final int delay = 30;
        final int initialY = 40;

        timer = new Timer(delay, new ReboundListener());

        x = 0;
        y = initialY;
        
        x2 =0;
        y2 = 90;

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.black);
        timer.start();
    }

    /**
    * Draws the image in the current location.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        IMAGE.paintIcon(this, page, x, y);
        
        IMAGE2.paintIcon(this, page, x2, y2);
        
    }

    /**
    * Represents the action listener for the timer.
    */
    private class ReboundListener implements ActionListener {
        /**
        * Updates the position of the image and possibly the direction
        * of movement whenever the timer fires an action event.
        * @param event Unused
        */
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;
            
            x2 += moveX2;
            y2 += moveY2;
//×óÎª¸º   ÓÒÎªÕý
            //first
            // If x is off the panel, change velocity to bring it back
            if (x <= 0) {
                moveX = abs(moveX);
            } else if (x >= getWidth() - IMAGE.getIconWidth()) {
                moveX = -abs(moveX);
            }
            
            // If y is off the panel, change velocity to bring it back
            if (y <= 0) {
                moveY = abs(moveY);
            } else if (y >= getHeight() - IMAGE.getIconHeight()) {
                moveY = -abs(moveY);
            }
            //second
            if (x2 <= 0) {
                moveX2 = abs(moveX2);
            } else if (x2 >= getWidth() - IMAGE.getIconWidth()) {
                moveX2 = -abs(moveX2);
            }
            
            // If y is off the panel, change velocity to bring it back
            if (y2 <= 0) {
                moveY2 = abs(moveY2);
            } else if (y2 >= getHeight() - IMAGE.getIconHeight()) {
                moveY2 = -abs(moveY2);
            }
            
            //together
            centerX = x + IMAGE.getIconWidth()/2;
            centerY = y + IMAGE.getIconWidth()/2;
            
            centerX2 = x2 + IMAGE.getIconWidth()/2;
            centerY2 = y2 + IMAGE.getIconWidth()/2;
            
           if(abs(centerX - centerX2) <= IMAGE.getIconWidth()&&abs(centerY - centerY2) <= IMAGE.getIconHeight()){
               
                moveX2 = -moveX2;
                moveY = -moveY;
                moveY2 = -moveY2;
            }

            repaint();
        }
    }
}