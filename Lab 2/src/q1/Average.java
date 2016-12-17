package q1;

import java.util.Scanner;
public class Average 
{

    public static void main(String[] args)
    { 
        int val1, val2, val3; 
        double average; 
        Scanner scan = new Scanner(System.in) ; 
        
        System.out.println("I will calculate their average of three numbers for you. " + 
        "Enter the first number: ");
        
        val1 = scan.nextInt();
        
        System.out.println("Enter the second number: ");
        
        val2 = scan.nextInt();
        
        System.out.println("Enter the third number: ");
        
        val3 = scan.nextInt();
        
        average = (val1 + val2 + val3) / 3;
        
        System.out.println("The average of the three numbers is " + average);
        scan.close();
        
    }

}
