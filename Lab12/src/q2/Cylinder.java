package q2;

public class Cylinder extends Shape{
    private double radius; // radius in feet
    private double height;
    // ----------------------------------
    // Constructor: Sets up the sphere.
    // ----------------------------------

    public Cylinder(double r, double h) {
        super("Cylinder");
        height = h;
        radius = r;
    }

    // -----------------------------------------
    // Returns the surface area of the sphere.
    // -----------------------------------------
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // -----------------------------------
    // Returns the sphere as a String.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}