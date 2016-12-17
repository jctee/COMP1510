package q2;

public class Rectangle extends Shape{
    private double height; 
    private double width;
    // ----------------------------------
    // Constructor: Sets up the sphere.
    // ----------------------------------

    public Rectangle(double h, double w) {
        super("Rectangle");
        height = h;
        width = w;
    }

    // -----------------------------------------
    // Returns the surface area of the sphere.
    // -----------------------------------------
    public double area() {
        return height * width;
    }

    // -----------------------------------
    // Returns the sphere as a String.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of width " + width + " and height " + height;
    }

}