package q4;

import java.util.Scanner;

/**
 * <p>This class asks the user to input a value 
 * to represent a side length of a cube. The class then
 * returns the value of the surface area and the
 * volume of the cube represented by the given side lenght</p>
 *
 * @author John Tee, Set D
 * @version 1.0
 */
public class Cube {
    
    /** 
     * <p> Number of sides in a cube.<p>
     */
    private static final int SIDES = 6;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        int length; // side of the cube
        int volume; // volume of the cube
        int sa; // surface area of the cube
        
        Scanner scan = new Scanner(System.in);
        
        //Asks the user for a value to represent the side length of a cube
        System.out.print("Enter the length of the side of a cube: ");
        length = scan.nextInt(); // scans for user input
        
        volume = length * length * length; // calculate volume
        sa = length * length * SIDES; // calculate the surface area
        
        // prints out the volume of the cube
        System.out.println("The volume of the cube is: " + volume);
        //prints out the surface area of the cube
        System.out.println("The surface area of the cube is: " + sa);
        
        System.out.println("Question four was called and ran sucessfully.");
        
        scan.close(); // closes the scanner
    }

}
