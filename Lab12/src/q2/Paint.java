package q2;

/**
 * Represents a type of paint that has a fixed area.
 * @author JC
 * @version 1.0
 */
public class Paint {
    private double coverage; // number of square feet per gallon
   
    /**
     * Constructs the paint a coverage
     * @param c coverage of type double
     */
    public Paint(double c) {
        coverage = c;
    }

    /**
     * returns the amount of paint needed
     * @param s
     * @return
     */
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        s.area();
        return s.area()/coverage;
    }
}