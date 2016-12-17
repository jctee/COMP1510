package q3;

import java.util.Scanner;

/**
 * <p>This class asks the user for 2 numbers.
 * Then calculates the sum, difference, product,
 * and quotient of the 2 numbers. </p>
 *
 * @author John Tee, Set D
 * @version 1.0
 */
public class Arithmetic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // initializes scanner
        
        float value1; // first user input
        float value2; // second user input
        float sum; // sum of 2 values
        float diff; // difference of 2 values
        float prod; // product of 2 values
        float quot; // quotient of 2 values
        
        System.out.print("Enter 2 values, separated by a space: ");
        // prompts user to enter 2 values
        value1 = scan.nextFloat(); // scans for user input
        value2 = scan.nextFloat(); // scans for user input
        
        sum = value1 + value2; // get the sum of the 2 values
        diff = value1 - value2; // get the difference of the 2 values
        prod = value1 * value2; // get the product of the 2 values
        quot = value1 / value2; // get the quotient of the 2 values
        
        //prints out the sum of the 2 numbers
        System.out.println("The sum of the 2 numbers is: " + sum);
        //prints out the difference of the 2 numbers
        System.out.println("The difference of the 2 numbers is: " + diff);
        //prints out the product of the 2 numbers
        System.out.println("The product of the 2 numbers is: " + prod);
        //prints out the quotient of the 2 numbers
        System.out.println("The quotient of the 2 numbers is: " + quot);
        
        System.out.println("Question three was called and ran sucessfully.");
        
        scan.close(); // closes the scanner
    }

}
