package q5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>Draws a pie chart with eight equal slices
 * all coloured differently.</p>
 *
 * @author John Tee, Set D
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;
    
    /**
     * <p>The length of the window horizontally.<p>
     */
    private static final int X_WINDOW = 350;
    
    /**
     * <p>The length of the window vertically.<p>
     */
    private static final int Y_WINDOW = 220;
    
    /**
     * <p>X-coordinate used to draw the circle.<p>
     */
    private static final int X_START = 50;
    
    /**
     * <p>Y-coordinate used to draw the circle.<p>
     */
    private static final int Y_START = 50;
    
    /**
     * <p>Diameter of the circle.<p>
     */
    private static final int DIAM = 80;
    
    /**
     * <p>Number of degrees used for each slice of the pie chart.<p>
     */
    private static final int SLICE = 45;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!"); // title of the application
        //sets default close operation to exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create a new content pane
        setContentPane(new PieChartPanel());
        // sets size of the starting window
        setSize(X_WINDOW, Y_WINDOW); 
        //makes the pie chart visible
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class PieChartPanel extends JPanel {
        
        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.white); //set the background color to white
            g.setColor(Color.black); //set the color to black
            //write Pie chart as a caption
            g.drawString("Pie chart", X_POSITION, Y_POSITION);
            //draw the outline of the circle
            g.drawOval(X_START, Y_START, DIAM, DIAM);
            
            g.setColor(Color.red); //set the color to red
            //draw the first slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, 0, SLICE);
            
            int ang = SLICE; //set starting angle to 45 degrees
            
            g.setColor(Color.orange); //set the color to orange
            //draw the second slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 90 degrees
            
            g.setColor(Color.yellow); //set the color to yellow
            //draw the third slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 135 degrees
            
            g.setColor(Color.green); //set the color to green
            //draw the fourth slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 180 degrees
            
            g.setColor(Color.blue); //set the color to blue
            //draw the fifth slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 225 degrees
            
            g.setColor(Color.magenta); //set the color to magenta
            //draw the sixth slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 270 degrees
            
            g.setColor(Color.cyan); //set the color to cyan
            //draw the seventh slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
            
            ang = ang + SLICE; //set starting angle to 315 degrees
            
            g.setColor(Color.gray); //set the color to gray
            //draw the eight slice of the pie chart
            g.fillArc(X_START, Y_START, DIAM, DIAM, ang, SLICE);
        }
    }

    /**
     * <p>The main method.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new PieChart(); //creates the object pie chart
    }
}
