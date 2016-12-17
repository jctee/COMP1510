/**
 * 
 */
package p1;

/**
 * @author JC
 *
 */
public class PlusTest {

    /**
     * main prints some expression using the + operator
     */
    public static void main(String[] args) {
        
        System.out.println ("This is a long string that is the " + 
                            "concatenation of two shorter strings."); 
        System.out.println ("The first computer was invented about " + 55 + "years ago.");
        System.out.println ("8 plus 5 is " + 8 + 5); 
        /* 
         * The set of 8 + 5 is not pranthesized, and since the program runs from left 
         * to right, the program adds the 8 to the string and then adds the 5 to the
         * string after
         */
        System.out.println ("8 plus 5 is " + (8 + 5)) ; 
        /*
         * Since the last set of 8 + 5  is in a set of parentheses, the program
         * calculates and adds the two numbers 8 and 5 together to get the number 13
         */
        System.out.println (8 + 5 + " equals 8 plus 5.");
        /*
         * Even though the 8 + 5 is not parenthesized, they are the first two
         * characters on the line. Since the program reads the line from left to right,
         * it first adds the two numbers to get 13, and then adds a string afterwards
         * of "equals 8 plus 5"
         */
        
        System.out.println ("Ten robins plus " + (12 + 1) +
                " canaries is " + (22 + 1) + " birds");
    }

}
