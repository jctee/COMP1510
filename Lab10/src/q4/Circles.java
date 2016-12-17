package q4;

import javax.swing.JFrame;

/**
 * This is the driver class for Circles.java
 * @author JC
 *
 */
public class Circles {
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new CirclePanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}
