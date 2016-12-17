package q1;

public class Circle {

    public static final double PI = 3.14159;
    
    public static void main(String[] args) 
    { 
    
        int radius1 = 10; 
        double area1 = PI * radius1 * radius1;
        double circ1 = 2 * PI * radius1;
    
        System.out.println("The area of a circle with radius " + radius1 + " is " + area1); 
        System.out.println("The circumference of a circle with radius " + radius1
                            + " is " + circ1);
        
        int radius2 = 20; 
        double area2 = PI * radius2 * radius2; 
        double circ2 = 2 * PI * radius2;
        
        System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius2
                + " is " + circ2);
        
        double areadiff = area2 / area1;
        System.out.println("The area of the bigger circle is " + areadiff
                            + " times bigger than the area of the smaller circle");
        
        double circdiff = circ2 / circ1;
        System.out.println("The circumference of the bigger circle is " + circdiff
                            + " times longer than the circumference of the smaller circle");
        } 
    }
