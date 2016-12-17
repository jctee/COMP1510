package p1;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Pie extends JApplet {

    private static final long serialVersionUID = 1L;

    /**
     * @param args
     */
    public void paint(Graphics page) {
        final int mid = 250;
        final int top = 50;
        
         
        page.setColor(Color.black);
        
        //circle:
        final int diam = 250;
        page.drawOval(mid - diam / 2, top, diam, diam);
        
        //sections:
        page.setColor(Color.red);
        page.fillArc(mid - diam / 2, top, diam, diam, 0, 126); //Rent and Utilities
        page.setColor(Color.orange);
        page.fillArc(mid - diam / 2, top, diam, diam, 126, 54); //Transportation
        page.setColor(Color.yellow);
        page.fillArc(mid - diam / 2, top, diam, diam, 180, 54); //Food
        page.setColor(Color.green);
        page.fillArc(mid - diam / 2, top, diam, diam, 234, 90); //Educational
        page.setColor(Color.blue);
        page.fillArc(mid - diam / 2, top, diam, diam, 324, 36); //Miscellaneous
        
        //labels
        page.setColor(Color.black);
        page.drawString("Rent and Utilities, 35%", mid, top);
        page.drawString("Transportation, 15%", mid - 220, top + 50);
        page.drawString("Food, 15%", mid - 180, top + 200);
        page.drawString("Educational, 25%", mid, top + 260);
        page.drawString("Miscellaneous, 10%", mid + 125, top + 125);
    }
}
