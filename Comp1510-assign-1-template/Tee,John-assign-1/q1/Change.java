package q1;

import java.util.Scanner; 
/**
 * <p> This class is supposed to take a double
 *  value that represents money, and determine 
 * the fewest number of bills and coins to represent 
 * the amount given by the user.</p>
 *
 * @author John Tee, Set D
 * @version 1.0
 */
public class Change {
    
    /** 
     * <p> Multiplier to turn value to cents. <p>
     */
    private static final int HUNDRED = 100; 
    
    /** 
     * <p> Ten dollars in cents. <p>
     */
    private static final int TEN = 1000;
    
    /** 
     * <p> Five dollars in cents. <p> 
     */
    private static final int FIVE = 500;
    
    /** 
     * <p> Toonie in cents. <p>
     */
    private static final int TWO = 200; 
    
    /** 
     * <p> Loonie in cents. <p> 
     */
    private static final int ONE = 100;
    
    /** 
     * <p> Quarter in cents. <p>
     */
    private static final int QUARTER = 25;
    
    /** 
     * <p> Dime in cents.<p>
     */
    private static final int DIME = 10;
    
    /** 
     * <p> Nickle in cents.<p> 
     */
    private static final int NICKLE = 5;
    
    /**
     * <p> Penny in cents. <p>
     */
    private static final int PENNY = 1; // 1 cent
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */    
    public static void main(String[] args) {
        
        int tens; // number of 10 dollar bills
        int fives; // number of 5 dollar bills
        int twos; // number of 2 dollar coins 
        int ones; // number of 1 dollar coins
        int quarters; // number of 25 cent coins
        int dimes; // number of 10 cent coins
        int nickles; // number of 5 cent coins
        int pennies; // number of 1 cent coins
        
        double value; // variable for money
        
        
        Scanner scan = new Scanner(System.in); //initializes scanner
        
        // prompts user to enter a value
        System.out.print("Enter a monetary value: ");
        value = scan.nextDouble(); // scans for user input
        
        value = value * HUNDRED; // value in cents
        
        tens = (int) (value / TEN); // gives the number of 10 dollar bills 
        value = value % TEN; /* remainder after taking out 
                            all the 10 dollar bills */
        
        fives = (int) (value / FIVE); // gives the number of 5 dollar bills
        value = value % FIVE; /* remainder after taking out 
                              all the 5 dollar bills */
        
        twos = (int) (value / TWO); // gives the number of toonies
        value = value % TWO; // remainder after taking out all the toonies
        
        ones = (int) (value / ONE); // gives the number of loonies
        value = value % ONE; // remainder after taking out all the loonies
        
        quarters = (int) (value / QUARTER); // gives the number of quarters
        value = value % QUARTER; // remainder after taking out all the quarters
        
        dimes = (int) (value / DIME); // gives the number of dimes
        value = value % DIME; // remainder after taking out all the dimes
        
        nickles = (int) (value / NICKLE); // gives the number of nickles
        value = value % NICKLE; // remainder after taking out all the nickles
        
        pennies = (int) (value / PENNY); // gives the number of pennies
        
        // prints the number of tens
        System.out.println("The number of ten dollar bills is: " + tens); 
        // prints the number of fives
        System.out.println("The number of five dollar bills is: " + fives);
        // prints the number of toonies
        System.out.println("The number of toonies is: " + twos);
        // prints the number of loonies
        System.out.println("The number of loonies is: " + ones);
        // prints the number of quarters
        System.out.println("The number of quarters is: " + quarters);
        // prints the number of dimes
        System.out.println("The number of dimes is: " + dimes);
        // prints the number of nickles
        System.out.println("The number of nickles is: " + nickles);
        // prints the number of pennies
        System.out.println("The number of pennies is: " + pennies);
        
        
        System.out.println("Question one was called and ran sucessfully.");
        
        scan.close(); // close scanner
    }
    

}
