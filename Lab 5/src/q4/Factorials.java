package q4;
import java.util.Scanner;

/**
 * <p> Give the answer of a factorial as an integer. </p>
 * 
 * @author JC
 * @version 1.0
 */
public class Factorials {
    
    /**
     * <p> This is the main method. </p>
     * @param args
     */
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int newValue = 1;
        System.out.print("Enter a non-negative number: ");
        int value = scan.nextInt();
        
        
        while (value < 0) {
            System.out.print("Enter a non-negative number: ");
            value = scan.nextInt();
        }
        
        while (value > 0){
            newValue *= value;
            value--;
        }
        
        System.out.println("The factorial number is: " + newValue);
        
        scan.close();
    }
    
}
