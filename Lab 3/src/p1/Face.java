/**
 * 
 */
package p1;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 * @author JC
 *
 */
public class Face extends JApplet {
    
    
    private static final long serialVersionUID = 1L;

    /**
     * @param args
     */
    public void paint(Graphics page) {
        final int mid = 400;
        final int top = 50;
        
        Color myNewOrange = new Color (252, 223, 129); 
        page.setColor(myNewOrange);
        
        //head:
        final int headDiam = 500;
        page.fillOval(mid - headDiam / 2, top, headDiam, headDiam);
        
        //ears
        final int earDiam = 100;
        page.fillOval(mid - 300, top + 140, earDiam, earDiam ); //left ear
        page.fillOval(mid + 200, top + 140, earDiam, earDiam);
        
        //face
        page.setColor(Color.white);
        final int eyeDiam = 75;
        page.fillOval(mid - 110, top + 140 , eyeDiam, eyeDiam); //left eye
        page.fillOval(mid + 68, top + 140 , eyeDiam, eyeDiam); //right eye
        
        page.setColor(Color.black);
        final int pupilDiam = 25;
        page.fillOval(mid - 100, top + 150, pupilDiam, pupilDiam); //left pupil
        page.fillOval(mid + 75, top + 150, pupilDiam, pupilDiam); //right pupil
        page.fillArc(mid - 270, top + 165, earDiam / 2, earDiam / 2, 40, 240); //left earlobe
        page.fillArc(mid + 220, top + 165, earDiam / 2, earDiam / 2, 270, 210); //left earlobe
        page.drawLine(mid, top + 200, mid + 50, top + 250); //top of nose
        page.drawLine(mid + 50, top + 250, mid, top + 250); //bottom of nose
        final int mouthDiam = 150;
        page.fillOval(mid - 50, top + 300, mouthDiam, mouthDiam); //mouth
        
        //cap
        page.setColor(Color.red);
        page.fillArc(mid - headDiam / 2 + 30, top, headDiam - 60, headDiam/2, 0, 180); //cap
        page.setColor(Color.blue);
        page.fillRect(mid - headDiam / 2 + 30, top + 125, headDiam - 60, 15);//hat stripe
        

    }
}
