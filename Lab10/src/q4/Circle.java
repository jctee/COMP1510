package q4;

import java.awt.*;
import java.util.Random;

/**
 * Creates a circle
 * @author JC
 *
 */
public class Circle {
    private int centerX, centerY;
    private int radius;
    private Color color;
    static Random generator = new Random();

    /**
     * Creates a circle with center at point given, random radius and color
     * radius 25..74
     * color RGB value 0..16777215 (24-bit)
     * @param point
     */
    public Circle(Point point) {
        radius = Math.abs(generator.nextInt()) % 50 + 25;
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        centerX = point.x;
        centerY = point.y;
    }

    /**
     * Draws circle on the graphics object given
     * @param page
     */
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
    
    /**
     * move circle
     * @param p
     */
    public void move(Point p){
        centerX = p.x;
        centerY = p.y;
    }
    /**
     * checks if click is inside circle
     * @param p
     * @return
     */
    public boolean isInside(Point p) {
        if(Math.sqrt(Math.pow((p.x-centerX), 2) +Math.pow((p.y-centerY), 2))<radius    ) {
            return true;
        } else {
            return false;
        }
    }
}