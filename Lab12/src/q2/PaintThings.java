package q2;

//***********************************************************
//PaintThings.java
//
//Computes the amount of paint needed to paint various
//things. Uses the amount method of the paint class which
//takes any Shape as a parameter.
//***********************************************************
import java.text.DecimalFormat;
/**
 * Creates some shapes and a Paint object
 * and prints the amount of paint needed.
 * @author JC
 *
 */
public class PaintThings {
    /**
     * This is the main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;
        
        deck = new Rectangle(20, 35);
        bigBall = new Sphere (15);
        tank = new Cylinder(10, 30);

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}