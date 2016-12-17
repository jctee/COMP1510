package p1;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) 
    {
            
        double x1, y1, x2, y2; // coordinates of two points
        double distance;      // distance between the points
            
        Scanner scan = new Scanner(System.in);
            // Read in the two points
           
        System.out.print ("Enter the coordinates of the first point " +
            "(put a space between them): ");
            
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print ("Enter the coordinates of the second point: ");
        
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        double dx = x2 - x1;
        double dy = y2 - y1;
        distance = Math.sqrt(Math.pow(dy, 2) + Math.pow(dx, 2));
        
        System.out.print ("The distance between the 2 points is: " + distance);
             
        scan.close();    
    }
  
}