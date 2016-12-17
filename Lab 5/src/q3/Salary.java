package q3;

import java.util.Scanner; 
import java.text.NumberFormat; 

/**
 * <p>Reads a string and gives a certain raise based on the string read.</p>
 * 
 * @author JC
 * @version 1.0
 */
public class Salary { 
    /**
     * <p> This is the main method. </p>
     * @param args
     */
    public static void main (String[] args) { 
        double currentSalary; // employee's current salary 
        double raise; // amount of the raise 
        double newSalary; // new salary for the employee 
        String rating; // performance rating 

        Scanner scan = new Scanner(System.in); 

        System.out.print ("Enter the current salary: "); 
        currentSalary = scan.nextDouble(); 
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): "); 
        rating = scan.next(); 
        

        if (rating.equalsIgnoreCase("Excellent")){
            raise = currentSalary * .06;
        }
        else if (rating.equalsIgnoreCase("Good")){
            raise = currentSalary * .04;
        }
        else {
            raise = currentSalary * .015;
        }
        
        newSalary = currentSalary + raise; 

        // Print the results 
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        System.out.println(); 
        System.out.println("Current Salary: " + money.format(currentSalary)); 
        System.out.println("Amount of your raise: " + money.format(raise)); 
        System.out.println("Your new salary: " + money.format(newSalary) ); 
        System.out.println(); 

        
    } 
} 