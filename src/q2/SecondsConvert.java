package q2;

import java.util.Scanner; 
/**
 * <p>This class is used to convert the given 
 * number of seconds and represent it in 
 * hours, minutes, and seconds.</p>
 *
 * @author John Tee, Set D
 * @version 1.0
 */
public class SecondsConvert {
    
    /** 
     * <p> Number of seconds in an hour. <p>
     */
    private static final int HOUR = 3600;
    
    /** 
     * <p> Number of seconds in a minute. <p>
     */
    private static final int MIN = 60;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        int hours; // number of hours
        int mins; // number of minutes
        int secs; // number of seconds
        int value; // user input, value in seconds
        
        Scanner scan = new Scanner(System.in); // initializes scanner
        
        // prompts user to enter a value
        System.out.print("Enter any number of seconds to convert: ");
        value = scan.nextInt(); // scans for user input
        
        hours = value / HOUR; //give the number of hours
        value = value % HOUR; //remainder number of seconds
        
        mins = value / MIN; //give the number of minutes
        value = value % MIN; //remainder number of seconds
        
        secs = value; //the number of seconds
        
        
        /* prints out the value given by 
        the user in hours, minutes, and seconds. */
        System.out.println("The time is: " + hours + ":" + mins + ":" + secs);
        
        System.out.println("Question two was called and ran sucessfully.");
        
        scan.close(); // close the scanner
    }

}
