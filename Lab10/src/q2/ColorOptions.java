package q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * driver class for ColorOptionsPanel.java
 * @author JC
 *
 */
public class ColorOptions {

    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        colorFrame.pack();
        colorFrame.setVisible(true);
    }
}