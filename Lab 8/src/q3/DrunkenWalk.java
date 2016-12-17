package q3;

import java.util.Scanner;

/**
 * Driver class for RandomWalk.java
 * @author JC
 * @version 1.0
 */
public class DrunkenWalk {
    
    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args){
        
        int maxSteps;
        int maxCoord;
        int numDrunks;
        int numFall = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        
        System.out.print("Enter the number of maximum steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the number of drunks");
        numDrunks = scan.nextInt();
        
        for (int i=0; i < numDrunks; i++ ){
            RandomWalk drunk = new RandomWalk(maxSteps, maxCoord);
            drunk.walk();
            if(!drunk.inBounds())
                numFall++;
        }
        
        System.out.println("Number of drunks that fell is: " + numFall);

    }

}
