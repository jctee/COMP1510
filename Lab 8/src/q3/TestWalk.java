package q3;

import java.util.Scanner;

/**
 * Driver class for RandomWalk.java
 * @author JC
 * @version 1.0
 */
public class TestWalk
{

    /**
     * This is the main method
     * @param args
     */
    public static void main (String[] args) {

        int maxSteps; //maximum number of steps in a walk
        int maxCoord; //the maximum x and y coordinate
        int x, y; //starting x and y coordinates for a walk

        Scanner scan = new Scanner(System.in);

        
        System.out.print ("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        
        System.out.print ("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print ("Enter the starting x and y coordinates with " +
                "a space between: ");

        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk random1 = new RandomWalk(5, 10, 0,0);
        RandomWalk random2 = new RandomWalk(maxCoord, maxSteps, x, y);
        
        System.out.println(random1.toString());
        System.out.println(random2.toString());
        
        for (int i=0; i<5; i++){
            random1.takeStep();
            System.out.println(random1.toString());
        }
        
        for (int i=0; i<5; i++){
            random2.takeStep();
            System.out.println(random2.toString());
        }
        
        System.out.println("The maximum Distance for object 1 is: " + random1.getMaxDistance());
        System.out.println("The maximum Distance for object 2 is: " + random2.getMaxDistance());
        
        
        /*
        RandomWalk random3 = new RandomWalk(200, 10, 0,0);

        while (random3.moreSteps() && random3.inBounds()){
            random3.walk();
        
        }
        */
    }
}
