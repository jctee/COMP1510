package q2;
/**
 * Abstract class for the shapes
 * @author JC
 * @version 1.0
 */
public abstract class Shape {
    private String shapeName;
     
    /**
     * constructs shape with name
     * @param n
     */
    public Shape(String n) {
        shapeName = n;
    }

    /**
     * abstract class for area
     * @return null
     */
    public abstract double area();

    /**
     * Overridden toString method that returns shape name
     */
    public String toString() {
        return shapeName;
    }
}